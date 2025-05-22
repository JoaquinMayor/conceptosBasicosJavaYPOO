package com.app.back.banco.tiposCuentasHerencia;


import com.app.back.banco.Cuenta;

public class CuentaPesoCL extends Cuenta { //Aplicamos herencia con el extends y decimos cual es el padre
    private static final double TASA_CAMBIO_USD_A_CLP = 850.0; //Es una constante que podremos usar siempre con esta clase

    public CuentaPesoCL(int numeroCuenta, long idCliente, int saldoActual) {
        super(numeroCuenta, idCliente, saldoActual);
    }

    @Override// Con el override sobreescibimos el método con el mismo nombre del padre para que lo haga a su manera
    public void depositar(double monto) {
        System.out.println("Depósito en CLP.");
        super.depositar(monto);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retiro en CLP.");
        super.retirar(monto);
    }

    public void depositarDesdeUSD(double montoUSD) {
        double montoCLP = montoUSD * TASA_CAMBIO_USD_A_CLP;
        depositar(montoCLP);
    }

    public void retirarEnUSD(double montoUSD) {
        double montoCLP = montoUSD * TASA_CAMBIO_USD_A_CLP;
        retirar(montoCLP);
    }
}
