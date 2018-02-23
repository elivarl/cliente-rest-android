package com.ecodeup.clientelibros;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Elivar on 22/2/2018.
 */

public interface ApiService {
    public static final String URL="http://192.168.1.7:80/crudlaravel/public/";

    @GET("api/v1/libros")
    Call<List<Libro>>listaLibros();
}
