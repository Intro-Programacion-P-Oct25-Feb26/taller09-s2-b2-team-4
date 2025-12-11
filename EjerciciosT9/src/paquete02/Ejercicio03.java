/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        double media = suma / arreglo.length;
        int arriba = 0;
        int debajo = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > media) {
                arriba = arriba + 1;
            } else if (arreglo[i] < media) {
                debajo = debajo + 1;
            }
        }

        System.out.printf("Media Aritmetica: %.2f\nElementos arriba de la media"
                + " %d\nElementos debajo de la media: %d\n", media,arriba,
                debajo);
    }
}
