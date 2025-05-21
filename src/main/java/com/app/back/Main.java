package com.app.back;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TODO Tipo de Datos Pimitivos

        int numeroEntero = 10; //Almacena un numero entero, sin decimales.
        double numeroDecimal = 10.5; //Almacena un numero decimal, con decimales.
        char letra = 'A'; //Almacena un solo caracter.
        String texto = "Hola Mundo"; //Almacena una cadena de texto.
        boolean isTrue = true; //Almacena Datos de True o False, muy util para condiciones.



        //TODO Sentencia If

        if(numeroEntero > 5) {
            System.out.println("El numero es mayor a 5");
        }else if(numeroEntero == 5) { //Recordar un = significa asignación osea le damos ese valor a la variable, == es comparación de igualdar en datos primitivos
            System.out.println("El numero es igual a 5");
        }else {
            System.out.println("El numero es menor a 5");
        }

        //Comparaciones más complejas

        if(numeroEntero > 5 && numeroDecimal < 20) { //El operador && significa que ambas condiciones deben ser verdaderas
            System.out.println("Ambas condiciones son verdaderas");
        }else if(numeroEntero > 5 || numeroDecimal == 20) { //El operador || significa que al menos una de las condiciones debe ser verdadera
            System.out.println("Una de las condiciones es verdadera");
        }
        //La combinaciones de || e && pueden usarse en la misma validación

        //Todo Sentencia Switch

        switch (numeroEntero) {
            case 1:
                System.out.println("El numero es 1");
                break; //El break es para salir del switch
            case 2:
                System.out.println("El numero es 2");
                break;
            case 3:
                System.out.println("El numero es 3");
                break;
            default: //El default se ejecuta si no se cumple ningun case
                System.out.println("El numero no es ninguno de los anteriores");
        }

        //TODO Sentencia While

        int contador = 0; //Contador para el while

        while(contador < 5) { //Mientras el contador sea menor a 5
            System.out.println("El contador es: " + contador);
            contador++; //Aumentamos el contador en 1
        }

        //TODO Sentencia Do While

        int contador2 = 0; //Contador para el do while

        do {
            System.out.println("El contador es: " + contador2);
            contador2++; //Aumentamos el contador en 1
        }while(contador2 < 5);

        //TODO Sentencia For
        //El for se usa para iterar un bloque de codigo un numero determinado de veces
        for (int i = 0; i < 5; i++) { //El i++ significa que aumentamos el valor de i en 1 cada vez que se ejecuta el for
            System.out.println("El contador es: " + i);
        }

        //TODO Sector de Ejercicios (Puse los ejercicios en una clase aparte el cual solo tienen que entrar a la función para ver el código)
        TareaClase.calculoTemperatura();
        TareaClase.donacionSangre();
        TareaClase.selectorFrutas();
        TareaClase.ejercicioBiblioteca();
        TareaClase.ejercicioCuentaBancaria();
        TareaClase.ejercicioProductosClaseAbstracta();
        //Todo Para ver las caracteristicas de una clase ingresar a la clase Usuario




    }
}