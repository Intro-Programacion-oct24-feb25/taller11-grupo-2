/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        int cedula;
        int tipo;
        
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su numero de cedula");
        cedula = entrada.nextInt();
        System.out.println("Ingrese el procedimiento a realizar 1(planilla"
                + "de luz) 2(valor predio de inmueble)");
        tipo = entrada.nextInt();
        
        switch(tipo){
            case(1):
                calcularValorLuz(nombre, cedula);
                break;
            case(2):
                calcularPredio(nombre, cedula);
                break;
            
        }
    }
    
    public static void calcularValorLuz (String a, int b){
        Scanner entrada = new Scanner(System.in);
        double total;
        double valor;
        double consumo;
        String cadena;
        System.out.println("Ingrese el valor del kilowatio");
        valor = entrada.nextDouble();
        System.out.println("Ingrese el numero consumido al mes");
        consumo = entrada.nextDouble();
        
        total = valor * consumo;
        cadena = String.format ("Cliente %s con cédula %d debe cancelar el "
                + "valor de $%.2f", a, b, total);
        
        System.out.println(cadena);
    }
    
    public static void calcularPredio (String a, int b){
        Scanner entrada = new Scanner(System.in);
        double total;
        double valor;
        String cadena;
        System.out.println("Ingrese el valor del inmueble");
        valor = entrada.nextDouble();

        total = (valor * 2)/100;
        cadena = String.format ("Cliente %s con cédula %d tiene un inmueble "
                + "valorado en $%.2f y tiene que pagar un predio de %.2f"
                + "", a, b, valor, total);
        
        System.out.println(cadena);
    }
    
}
