package com.example.projects_2jfx.model;

public class Titulo {
    private static int c=101010;
    private int id;
    private String titulo;
    private String descripcion;

    /**
     * constructor por defecto
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * constructor con parametros
     */
    public Titulo(String titulo, String descripcion) {
this.id=c;
        this.titulo = titulo;
        this.descripcion = descripcion;
        c=c+1;
    }
}
