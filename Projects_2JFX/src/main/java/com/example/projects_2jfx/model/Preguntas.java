package com.example.projects_2jfx.model;

public class Preguntas {
    //variables
    private static int contador=1;
    private int Id;
    private String pregunta;
    private String tiempoLimite;
    private String punteo;
    private String respuesta;
    //metodo constructor

    public Preguntas(String pregunta, String tiempoLimite, String punteo,String respuesta) {
        contador=contador+1;
        Id = contador;
        this.pregunta = pregunta;
        this.tiempoLimite = tiempoLimite;
        this.punteo = punteo;
        this.respuesta=respuesta;
    }
    //metodos get and setters

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Preguntas.contador = contador;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getTiempoLimite() {
        return tiempoLimite;
    }

    public void setTiempoLimite(String tiempoLimite) {
        this.tiempoLimite = tiempoLimite;
    }

    public String getPunteo() {
        return punteo;
    }

    public void setPunteo(String punteo) {
        this.punteo = punteo;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }
}
