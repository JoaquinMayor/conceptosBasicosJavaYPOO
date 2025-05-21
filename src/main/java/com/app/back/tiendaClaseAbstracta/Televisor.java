package com.app.back.tiendaClaseAbstracta;

public class Televisor extends Producto{

    private double impuesto;

    public Televisor(String nombre, double precioBase, double descuento, double impuesto) {
        super(nombre, precioBase);
        this.descuento = descuento;
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
