package com.example.t3practica02;

public class Anime {

    String Imagen;
    String Titulo;
    String Descripcion;

    public Anime(String imagen, String titulo, String descripcion) {
        Imagen = imagen;
        Titulo = titulo;
        Descripcion = descripcion;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
