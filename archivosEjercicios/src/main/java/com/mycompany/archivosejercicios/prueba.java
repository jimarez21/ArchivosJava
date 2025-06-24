/*
 * Clase para pruebas
 */
package com.mycompany.archivosejercicios;

import java.util.Scanner;

public class prueba {
    public static void main(String[]args){
        EjercicioFinal eF = new EjercicioFinal();
        Scanner entrada = new Scanner(System.in);
        String archivo = "registro.txt";
        eF.crearArchivo(archivo);
        System.out.println("Ingrese sus 3 lineas de texto separados por enter. ");
        System.out.println("1 de 3: ");
        String s = entrada.nextLine();
        eF.escribirLinea(archivo, s);
        System.out.println("2 de 3: ");
        s = entrada.nextLine();
        eF.escribirLinea(archivo, s);
        System.out.println("3 de 3: ");
        s = entrada.nextLine();
        eF.escribirLinea(archivo, s);
        System.out.println("Contenido del archivo: ");
        eF.leerArchivo(archivo);
    }
}
