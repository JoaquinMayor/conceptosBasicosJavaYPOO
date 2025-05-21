package com.app.back.banco.tiposCuentasHerencia;

import com.app.back.banco.Cuenta;

public class CuentaUSD extends Cuenta {//Aplicamos herencia con el extends y decimos cual es el padre
    private static final double TASA_CAMBIO_CLP_A_USD = 1 / 850.0;

    public CuentaUSD(int numeroCuenta, long idCliente, double saldoActual) {
        super(numeroCuenta, idCliente, saldoActual);
    }

    @Override // Con el override sobreescibimos el método con el mismo nombre del padre para que lo haga a su manera
    public void depositar(double monto) {
        System.out.println("Depósito en USD.");
        super.depositar(monto);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retiro en USD.");
        super.retirar(monto);
    }

    public void depositarDesdeCLP(double montoCLP) {
        double montoUSD = montoCLP * TASA_CAMBIO_CLP_A_USD;
        depositar(montoUSD);
    }

    public void retirarEnCLP(double montoCLP) {
        double montoUSD = montoCLP * TASA_CAMBIO_CLP_A_USD;
        retirar(montoUSD);
    }

}
