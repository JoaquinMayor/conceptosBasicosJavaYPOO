package com.app.back;

import com.app.back.banco.Cliente;
import com.app.back.banco.Cuenta;
import com.app.back.biblioteca.Libro;
import com.app.back.tiendaClaseAbstracta.Laptop;
import com.app.back.tiendaClaseAbstracta.Producto;
import com.app.back.tiendaClaseAbstracta.Telefono;
import com.app.back.tiendaClaseAbstracta.Televisor;

import java.util.Scanner;

public class TareaClase {

    public static void calculoTemperatura(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al conversor de temperatura.");
        System.out.println("Elige una opción:");
        System.out.println("1. Convertir de Celsius a Fahrenheit");
        System.out.println("2. Convertir de Fahrenheit a Celsius");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingresa la temperatura en grados Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("La temperatura en Fahrenheit es: " + fahrenheit + "°F");
                break;

            case 2:
                System.out.print("Ingresa la temperatura en grados Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("La temperatura en Celsius es: " + celsius + "°C");
                break;

            default:
                System.out.println("Opción no válida. Por favor, elige 1 o 2.");
        }

        scanner.close();
    }

    public static void donacionSangre(){
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario su edad y peso
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingresa tu peso en kg: ");
        double peso = scanner.nextDouble();

        // Evaluar las condiciones para donar sangre
        if (edad >= 18 && edad <= 65) {
            if (peso >= 50) {
                System.out.println("Puedes donar sangre.");
            } else {
                System.out.println("No puedes donar sangre porque pesas menos de 50 kg.");
            }
        } else {
            System.out.println("No puedes donar sangre porque tu edad no está entre 18 y 65 años.");
        }

        scanner.close();
    }

    public static void selectorFrutas(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la frutería.");
        System.out.println("Ingresa el nombre de la fruta (plátano, naranja, papaya, frutilla, manzana):");
        String fruta = scanner.nextLine().toLowerCase();

        switch (fruta) {
            case "plátano":
                System.out.println("El valor del kg de plátano es: $1.50");
                break;
            case "naranja":
                System.out.println("El valor del kg de naranja es: $2.00");
                break;
            case "papaya":
                System.out.println("El valor del kg de papaya es: $2.50");
                break;
            case "frutilla":
                System.out.println("El valor del kg de frutilla es: $3.00");
                break;
            case "manzana":
                System.out.println("El valor del kg de manzana es: $2.20");
                break;
            default:
                System.out.println("Fruta no disponible.");
        }

        scanner.close();
    }

    public static void ejercicioBiblioteca(){
        // Crear dos objetos de tipo Libro
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("1984", "George Orwell", 1949);

        // Mostrar información y edad del primer libro
        System.out.println("Información del primer libro:");
        libro1.mostrarInformacion();
        System.out.println("Edad del libro: " + libro1.obtenerEdadLibro() + " años\n");

        // Mostrar información y edad del segundo libro
        System.out.println("Información del segundo libro:");
        libro2.mostrarInformacion();
        System.out.println("Edad del libro: " + libro2.obtenerEdadLibro());
    }

    public static void ejercicioCuentaBancaria(){
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto Cuenta
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();

        System.out.print("Ingrese el ID del cliente: ");
        long idCliente = scanner.nextLong();

        System.out.print("Ingrese el saldo inicial: ");
        int saldoActual = scanner.nextInt();

        System.out.print("Ingrese el interés: ");
        double interes = scanner.nextDouble();

        Cuenta cuenta = new Cuenta(numeroCuenta, idCliente, saldoActual, interes);

        // Crear un objeto Cliente
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        Cliente cliente = new Cliente(idCliente, nombre, cuenta);

        // Mostrar información del cliente y su cuenta
        System.out.println("\nInformación del cliente:");
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Número de cuenta: " + cliente.getCuenta().getNumeroCuenta());
        System.out.println("Saldo actual: " + cliente.getCuenta().getSaldoActual());
        System.out.println("Interés: " + cliente.getCuenta().getInteres());

        // Ingresar dinero a la cuenta
        System.out.print("\nIngrese la cantidad de dinero a depositar: ");
        double ingreso = scanner.nextDouble();
        cliente.getCuenta().ingresar(ingreso);

        scanner.close();
    }


    public static void ejercicioProductosClaseAbstracta(){
        Producto telefono = new Telefono("iPhone 14", 1000, 10); //Las clases absvtractas no se pueden inicializar pero por cuestiones de herencia yo puedo decir que una clase padre tenga la clase del hijo pero no al revez
        //Esto es muy util para el manejo de colecciones donde podemos hacer una colección de la clase padre y llamar al método compartidos entre todos en este caso mostrar información
        Producto laptop = new Laptop("Dell XPS 13", 1500, 15);
        Producto televisor = new Televisor("Samsung QLED", 2000, 5, 18);

        Producto[] productos = {telefono, laptop, televisor};

        for (Producto producto : productos) { //Bucle for each para recorrer el array de productos producto es cada elemento individual y termina una vez terminados todos los elementos
            producto.mostrarInformacion();
            System.out.println("Precio final: $" + producto.calcularPrecioFinal());
            System.out.println("-----------------------------------");
        }
    }

}
