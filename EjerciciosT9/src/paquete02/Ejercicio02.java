/*
    Ejercicio muy complicado, aun que este complicado se va a resolver
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] respuestas = {1, 10, 11, 12, 12, 13, 16, 17, 18, 8, 9, 10, 21,
            -1, 100, 200, 2, 21, 22, 27};
        String[] rangos = {"Rango 1-5", "Rango 6-10", "Rango 11-15", "Rango "
            + "16-20", "fuera-de-rango"};
        int[] valoresRangos = new int[5]; // {0, 0, 0, 0, 0}
        int respuesta;

        for (int i = 0; i < respuestas.length; i++) {
            respuesta = respuestas[i]; // -1
            if ((respuesta >= 1) && (respuesta <= 5)) {
                valoresRangos[0] = valoresRangos[0] + 1;
            } else {
                if ((respuesta >= 6) && (respuesta <= 10)) {
                    valoresRangos[1] = valoresRangos[1] + 1;
                } else {
                    if ((respuesta >= 11) && (respuesta <= 15)) {
                        valoresRangos[2] = valoresRangos[2] + 1;
                    } else {
                        if ((respuesta >= 16) && (respuesta <= 20)) {
                            valoresRangos[3] = valoresRangos[3] + 1;
                        } else {
                            valoresRangos[4] = valoresRangos[4] + 1;
                        }

                    }
                }

            }
        }

        for (int i = 0; i < rangos.length; i++) {
            System.out.printf(" %s - valor %d\n", rangos[i],
                    valoresRangos[i]);
        }

    }

}
