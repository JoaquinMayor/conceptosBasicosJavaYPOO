package com.app.back;

import java.util.Objects;

public class Usuario {

    //TODO Atributos siempre privados Pueden ser otros Objetos o atributos primitivos
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    //TODO Constructor, se llama al crear el objeto y se le asignan valores a los atributos
    public Usuario(String nombre, String apellido, int edad, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
    }

    //TODO Getters y Setters, son métodos que permiten acceder y modificar los atributos privados
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //TODO Método equals, compara dos objetos para ver si son iguales
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return edad == usuario.edad && Objects.equals(nombre, usuario.nombre) && Objects.equals(apellido, usuario.apellido) && Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, edad, email);
    }

    //TODO Yo puedo crear todos los métodos extras que quieren siempre y cuando sean responsabilidad del usuario
}
