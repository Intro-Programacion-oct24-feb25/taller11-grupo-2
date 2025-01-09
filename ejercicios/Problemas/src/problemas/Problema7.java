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
public class Problema7 {
    
     public static void main(String[] args) {
        
        String[] ciudades = ingresarCiudades();
     
        imprimirCiudades4o5(ciudades);
    }

    public static String[] ingresarCiudades() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el número de ciudades:");
        int numCiudades = leer.nextInt();
        leer.nextLine();

        String[] ciudades = new String[numCiudades];

        for (int i = 0; i < numCiudades; i++) {
            System.out.print("Ingrese la ciudad:" + (i + 1) + " ");
            ciudades[i] = leer.nextLine();
        }

        return ciudades;
    }

   
    public static void imprimirCiudades4o5(String[] ciudades) {
        System.out.println("\nCiudades con 4 o 5 caracteres");

       
        for (int i = 0; i < ciudades.length; i++) {
            String ciudad = ciudades[i];
            if (ciudad.length() == 4 || ciudad.length() == 5) {
                System.out.println(ciudad);
            }
        }
    }

   
}
