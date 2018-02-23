package com.ecodeup.clientelibros;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Elivar on 22/2/2018.
 */

public interface ApiService {
    public static final String URL="http://localhost/crudlaravel/public/";

    @GET("api/v1/libros")
    Call<List<Libro>>listaLibros();
}
