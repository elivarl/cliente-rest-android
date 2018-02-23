package com.ecodeup.clientelibros;

/**
 * Created by Elivar on 22/2/2018.
 */

public class Libro
{
    private int id;
    private String nombre;
    private String resumen;
    private String npagina;
    private String edicion;
    private String autor;
    private  String precio;
    private String created_at;
    private String updated_at;

    public Libro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getNpagina() {
        return npagina;
    }

    public void setNpagina(String npagina) {
        this.npagina = npagina;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return this.id+" "+this.nombre+" "+this.resumen+" "+this.npagina+" "+edicion+" "+this.autor+" "+this.precio+" "+this.created_at+" "+this.updated_at;
    }
}
