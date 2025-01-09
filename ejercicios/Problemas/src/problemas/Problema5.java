/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        String mensaje = suma(informacion,informacion2);
        System.out.println(mensaje);
    }
    
    public static String suma (int[][]num1,int[][]num2){
        String cadena = "";
      for (int i = 0; i < num1.length; i++) {
          cadena = String.format("%s\n", cadena);
            for (int j = 0; j < num1[i].length; j++) {
                
                  int suma;
                  suma = num1[i][j] +num2[i][j];
                    cadena = String.format("%s%d\t", cadena, suma);
                
            }
        }  
      return cadena;
    }
}
