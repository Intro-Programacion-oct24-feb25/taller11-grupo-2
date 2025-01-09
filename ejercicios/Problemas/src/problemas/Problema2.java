/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int tipo;
        String variable = "";
        
        System.out.println("Ingrese el procedimiento que desea 1(cuadrado) 2("
                + "Triangulo) 3(rectangulo)");
        tipo = entrada.nextInt();
        
        switch(tipo){
            case(1):
                variable = obtenerAreaCuadrado();
                break;
            case(2):
                variable = obtenerAreaTriangulo();
                break;
            case(3):
                variable = obtenerAreaRectangulo();
                break;
        }
        
        System.out.println(variable);
            
    }  
    
        public static String obtenerAreaCuadrado(){
            Scanner entrada = new Scanner(System.in);
            
            int lado;
            int area;
            String cadena;
            
            System.out.println("Ingrese lado del cuadrado");
            lado = entrada.nextInt();
            area = lado * lado * lado * lado;
            
            cadena = String.format ("El área del cuadrado de lado: %d es: %d", 
                    lado, area);
            
            return cadena;
        }
        
        public static String obtenerAreaTriangulo(){
            Scanner entrada = new Scanner(System.in);
            
            int baseT;
            int alturaT;
            int areaT;
            String cadena;
            
            System.out.println("Ingrese la altura del triangulo");
            alturaT = entrada.nextInt();
            System.out.println("Ingrese la base del triangulo");
            baseT = entrada.nextInt();
            areaT = (baseT * alturaT)/2;
            
            cadena = String.format ("El área del triangulo de base: %d y "
                    + "altura: %d es: %d", baseT, alturaT, areaT);
            
            return cadena;
        }
        
        public static String obtenerAreaRectangulo(){
            Scanner entrada = new Scanner(System.in);
            
            int baseR;
            int alturaR;
            int areaR;
            String cadena;
            
            System.out.println("Ingrese la altura del rectangulo");
            alturaR = entrada.nextInt();
            System.out.println("Ingrese la base del rectangulo");
            baseR = entrada.nextInt();
            areaR = baseR * alturaR;
            
            cadena = String.format ("El área del rectángulo de base: %d y "
                    + "altura: %d es: %d", baseR, alturaR, areaR);
            
            return cadena;
    }
    
}
