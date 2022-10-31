/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iserciondirecta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mikey
 */
public class IsercionDirecta {
 public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static int[] leerArreglo(int n) throws IOException {
        int[] a = new int[n];
        System.out.println("=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Escriba el valor [" + i + "]: ");
            entrada = bufer.readLine();
            a[i] = Integer.parseInt(entrada);
        }
        return a;
    }


    public static int[] insercionDirecta(int[] datos) {
       for(int k=1; k<datos.length;k++){
           int pivote = datos[k];
           int j = k-1;
           while(j>=0 && pivote<=datos[j]){
               datos[j+1] = datos[j];
               j=j-1;
           }
           datos[j+1]=pivote;
       }
        return datos;
    }

    public static void imprimirArreglo(int[] a) {
        System.out.println("======================");
        System.out.println("Arreglo ordenado: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%4d", a[i]);
        }
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int[] array;
        int t;
        System.out.println("Programa que Ordena por Algoritmo de Iserción Directa");
        System.out.println("Escribe la longitud del Arreglo: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);
        array = leerArreglo(t);
        array = insercionDirecta(array);
        imprimirArreglo(array);
    }
    
}
