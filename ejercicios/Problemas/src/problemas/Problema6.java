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
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        double media = calcularMedia(informacion);

        double desviacionEstandar
                = calcularDesviacionEstandar(informacion, media);

        System.out.println("Media aritmética: " + media);
        System.out.println("Desviación estándar: " + desviacionEstandar);
    }

    public static double calcularMedia(int[] arreglo) {
        double suma = 0;
        double media;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        media = suma / arreglo.length;
        return media;
    }

    public static double calcularDesviacionEstandar(int[] arreglo, double media) {
        double sumaDesviacionCuadrada = 0;
        double desviacion;
        for (int i = 0; i < arreglo.length; i++) {
            sumaDesviacionCuadrada = sumaDesviacionCuadrada + Math.pow(arreglo[i] - media, 2);
        }
        desviacion = Math.sqrt(sumaDesviacionCuadrada / arreglo.length);
        return desviacion;
    }

}
