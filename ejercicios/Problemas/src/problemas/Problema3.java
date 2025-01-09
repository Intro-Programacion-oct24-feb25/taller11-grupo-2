/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        String cualitativo = "";
        int[] notas;
        String mensaje;

        notas = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese las notas");
            notas[i] = leer.nextInt();
        }

        cualitativo = promedios(notas[0], notas[1], notas[2], notas[3]);
        mensaje = "El promedio de las notas: " + notas[0] + "," + notas[1]
                + "," + notas[2] + "," + notas[3] + " es: " + cualitativo;

        mensaje = mayusculas(mensaje);
        System.out.println(mensaje);
    }

    public static String promedios(double a, double b, double c, double d) {

        double suma;
        double promedio;
        String cadena = "";
        String cualidad = "";

        suma = a + b + c + d;
        promedio = suma / 4;

        if (promedio >= 0 && promedio <= 5) {
            cualidad = "Regular";
        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                cualidad = "Bueno";
            } else {
                if (promedio >= 8.1 && promedio <= 9) {
                    cualidad = "Muy bueno";
                } else {
                    if (promedio >= 9.1 && promedio <= 10) {
                        cualidad = "SobreSaliente";
                    } 
                }
            }
        }

        return cualidad;

    }

    public static String mayusculas(String mensaje) {
        mensaje = mensaje.toUpperCase();
        return mensaje;
    }
}
