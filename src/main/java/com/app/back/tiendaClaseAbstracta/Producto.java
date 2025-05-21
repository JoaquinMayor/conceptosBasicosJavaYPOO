package com.app.back.tiendaClaseAbstracta;

public abstract class Producto { //Creando clase abstracta
    protected String nombre;
    protected double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public abstract void mostrarInformacion();

    public abstract double calcularPrecioFinal();
}
