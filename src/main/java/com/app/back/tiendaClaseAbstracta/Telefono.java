package com.app.back.tiendaClaseAbstracta;

public class Telefono extends Producto{

    protected String nombre;
    protected double precioBase;

    public Telefono(String nombre, double precioBase) {
        super(nombre, precioBase);

    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Teléfono: " + nombre);
        System.out.println("Precio base: $" + precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        // Ejemplo: aplicar un descuento del 10%
        double descuento = 10.0;
        return precioBase - (precioBase * descuento / 100);
    }
}
