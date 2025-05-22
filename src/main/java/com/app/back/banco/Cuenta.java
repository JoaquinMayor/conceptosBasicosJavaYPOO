package com.app.back.banco;

public class Cuenta {

    private int numeroCuenta;
    private long idCliente;
    private int saldoActual;
    private double interes;

    // Constructor por defecto
    public Cuenta() {
    }

    // Constructor con parámetros
    public Cuenta(int numeroCuenta, long idCliente, int saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.idCliente = idCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public Cuenta(int numeroCuenta, long idCliente, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.idCliente = idCliente;
        this.saldoActual = saldoActual;
    }

    // Getters y Setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    // Método para ingresar dinero
    public void ingresar(double ingreso) {
        if (ingreso > 0) {
            this.saldoActual += ingreso;
            System.out.println("Ingreso realizado con éxito. Saldo actual: " + this.saldoActual);
        } else {
            System.out.println("El monto a ingresar debe ser mayor a 0.");
        }
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldoActual += monto;
            System.out.println("Depósito realizado. Saldo actual: " + saldoActual);
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldoActual) {
            saldoActual -= monto;
            System.out.println("Retiro realizado. Saldo actual: " + saldoActual);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }


}
