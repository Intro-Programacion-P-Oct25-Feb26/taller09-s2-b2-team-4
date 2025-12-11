/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[] numeros = new double[10];
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Ingrese el valor para posicion %d\n ", i + 1);
            numeros[i] = entrada.nextDouble();
            suma += numeros[i];
        }

        double promedio = suma / numeros.length;

        System.out.printf("\nPromedio: %.2f\n", promedio);
        System.out.println("\nNúmero   Diferencia con el promedio:");

        for (int i = 0; i < numeros.length; i++) {
            double diferencia = promedio - numeros[i];
            System.out.printf("  %.2f - %.2f = %.2f\n", numeros[i], promedio, 
                    diferencia);
        }
    }
}
