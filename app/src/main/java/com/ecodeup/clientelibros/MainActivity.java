package com.ecodeup.clientelibros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    List<Libro> listaLibros;
    Retrofit cliente;
    ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cliente= new Retrofit.Builder().baseUrl(ApiService.URL).addConverterFactory(GsonConverterFactory.create()).build();
        apiService=cliente.create(ApiService.class);
        apiService.listaLibros().enqueue(new Callback<List<Libro>>() {
            @Override
            public void onResponse(Call<List<Libro>> call, Response<List<Libro>> response) {
                Log.i("Cliente","Cliente Android");
                if (response.isSuccessful()){
                    listaLibros=response.body();
                    for (Libro libro:listaLibros){
                        Log.i("Libro",libro.toString());
                    }
                }
            }
            @Override
            public void onFailure(Call<List<Libro>> call, Throwable t) {
                Log.i("Error",t.getMessage());

            }
        });

    }
}
