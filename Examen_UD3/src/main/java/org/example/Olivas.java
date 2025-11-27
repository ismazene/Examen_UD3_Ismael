package org.example;

import java.util.Random;
import java.util.Scanner;

public class Olivas {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int ancho = 0;
        int alto = 0;

        System.out.println("*****BIENVENIDO AL OLIVÓMETRO*****");
        System.out.println("Introduce el tamaño de tu bancal... ");

        System.out.println("Ancho:");
        ancho = teclado.nextInt();

        System.out.println("Alto:");
        alto = teclado.nextInt();

        teclado.nextLine();

        int[][] plantacion = new int[ancho][alto];

        System.out.println("Introduce (por hileras) los kg por árbol de tu bancal: ");

        for (int i = 0; i < ancho; i++) {
            String linea;
            do {
                linea = teclado.nextLine();

                //Hacer validacion
//                if (linea.length() < 1 && linea.length() < 50) {
//                    System.err.println("La linea debe tener exactamente " + ancho + " caracteres.");
//                    linea = teclado.nextLine();
//
//                }
                if (!linea.matches("\\d{1,2} \\d{1,2} \\d{1,2} \\d{1,2}")) {
                    System.err.println("Formato incorrecto. Inténtalo de nuevo.");
                }

            } while (!linea.matches("\\d{1,2} \\d{1,2} \\d{1,2} \\d{1,2}") || linea.length() < 1 && linea.length() < 50);


            String[] partes = linea.split(" ");
            for (int j = 0; j < ancho; j++) {
                plantacion[i][j] = Integer.parseInt(partes[j]);
            }
        }

        //Mostrar matriz
        System.out.println("Mapa de tu bancal actual: ");
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                System.out.print(plantacion[i][j] + " ");
            }
            System.out.println(" ");
        }

        //No he sabido hacerlo (Es para hacer el de la suma de la hilera)
//        for (int i = 0; i < ancho; i++) {
//            for (int j = 0; j < plantacion.length; j++) {
//
//                }
//        int resultado = suma;
//        System.out.println("==============================================================================");
//        System.out.println(resultado);
//        }

        //Litros por hilera
        int suma = 500;
        int resultado_hilera = 0;
            resultado_hilera =  suma/8;

        System.out.println("Litros totales por hilera: " + resultado_hilera);

//        for (int i = 0; i < plantacion.length; i++) {
//            System.out.println("Litros por hilera... ");
//
//            suma += plantacion[i]; // sumar cada elemento
//        }

        Random random = new Random();

        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                plantacion[i][j] = random.nextInt(34)+14; // valores 0-99
            }
        }
        System.out.println("=========================");
        System.out.println("");
        System.out.println("MAPA estimacion replantar");
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                System.out.print(plantacion[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
