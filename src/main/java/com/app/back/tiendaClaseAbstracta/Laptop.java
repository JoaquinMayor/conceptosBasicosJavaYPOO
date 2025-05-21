package com.app.back.tiendaClaseAbstracta;

public class Laptop extends Producto {

    private double impuesto;

    public Laptop(String nombre, double precioBase, double impuesto) {
        super(nombre, precioBase);
        this.impuesto = impuesto;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Laptop: " + nombre);
        System.out.println("Precio base: $" + precioBase);
        System.out.println("Impuesto: " + impuesto + "%");
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase + (precioBase * impuesto / 100);
    }
}
