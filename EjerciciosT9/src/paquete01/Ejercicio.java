/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String dato;
        int numeroMarcas;
        String[] arreglo;

        System.out.println("Ingrese el numero de marcas que desea agregar");
        numeroMarcas = entrada.nextInt();

        entrada.nextLine();

        arreglo = new String[numeroMarcas];

        for (int i = 0;i < arreglo.length;i++) {

            System.out.println("Ingrese una marca:");
            dato = entrada.nextLine();
            String letra = dato.substring(0, 1);
            letra = letra.toLowerCase();

            switch (letra) {
                case "a":
                case "c":
                case "t":
                    System.out.println("MARCA INVALIDA (empieza con A - C - T)\n"
                            + "INTENTE OTRA");
                    i--;
                    break;
                default:
                    arreglo[i] = dato;
            }
        }

        for (int i = 0;
                i < arreglo.length;
                i++) {
            System.out.printf("\nLA MARCA INGRESADA ES:\nMarca: %s posicion en"
                    + " el arreglo = %d\n",arreglo[i].toUpperCase(), i);

        }

    }
}
