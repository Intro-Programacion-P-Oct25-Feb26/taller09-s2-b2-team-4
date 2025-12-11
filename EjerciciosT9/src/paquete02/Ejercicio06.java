/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[] precios = {1.5, 2.1, 2.3};
        int[] tazasCompradas = new int[3];
        int opcion;
        int continuar = 1;
        String[] nombres = {"Café tradicional", "Café francés", "Café alemán"};

        while (continuar == 1) {
            System.out.println("\nSeleccione el producto que desea comprar:");
            for (int i = 0; i < nombres.length; i++) {
                System.out.printf("%d %s = $%.2f\n",
                        i,
                        nombres[i],
                        precios[i]);
            }

            System.out.print("Ingrese opción\n");
            opcion = entrada.nextInt();

            if (opcion < 0 || opcion >= nombres.length) {
                System.out.println("Opción inválida.");
                continue;
            }

            System.out.printf("¿Cuántas tazas de %s desea?\n",
                    nombres[opcion]);
            int tazas = entrada.nextInt();

            tazasCompradas[opcion] += tazas;

            System.out.print("¿Desea seguir comprando? (1=Sí, 0=No): ");
            continuar = entrada.nextInt();
        }

        double totalPagar = 0;

        System.out.println("\nEl usuario ha comprado:\n");

        for (int i = 0; i < nombres.length; i++) {
            if (tazasCompradas[i] > 0) {
                double subtotal = tazasCompradas[i] * precios[i];
                totalPagar += subtotal;

                System.out.printf("  %s (%d t), valor a cancelar $%.2f\n",
                        nombres[i], tazasCompradas[i], subtotal);
            }
        }

        System.out.printf("\nTotal a pagar: %.2f\n", totalPagar);
    }
}
