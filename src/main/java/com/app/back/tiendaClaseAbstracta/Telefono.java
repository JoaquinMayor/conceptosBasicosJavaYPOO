package com.app.back.tiendaClaseAbstracta;

public class Telefono extends Producto{

    protected String nombre;
    protected double precioBase;

    public Telefono(String nombre, double precioBase, double descuento) {
        super(nombre, precioBase);
        this.descuento = descuento;
    }

    public abstract void mostrarInformacion();

    public abstract double calcularPrecioFinal();
}
