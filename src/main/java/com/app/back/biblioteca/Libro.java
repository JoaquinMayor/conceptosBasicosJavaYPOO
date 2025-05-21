package com.app.back.biblioteca;

import java.time.Year;

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Constructor para inicializar los atributos
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Método para mostrar la información del libro
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
    }

    // Método para calcular la edad del libro
    public int obtenerEdadLibro() {
        int anioActual = Year.now().getValue();
        return anioActual - anioPublicacion;
    }
}
