/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.archivos1;

import java.io.File;

/**
 *
 * @author APIST-ALUMNOS
 */
public class Archivos1 {

    public static void main(String[] args) {
        File fichero = new File("C:/Users/APIST-ALUMNOS/Documents/NetBeansProjects/archivos1/src/main/java/com/mycompany/archivos1/FicheroEjemplo.txt");
        
        if(fichero.exists()){
            System.out.println("Nombre del archivo "+fichero.getName());
            System.out.println("Ruta "+fichero.getPath());
            System.out.println("Ruta absoluta "+fichero.getAbsolutePath());
            System.out.println("Se puede escribir "+fichero.canRead());
            System.out.println("Se puede leer "+fichero.canWrite());
            System.out.println("Tamanio "+fichero.length());            
        }
        System.out.println(""+fichero.exists());
        System.out.println("Hello World!");
        //fichero.close();
    }
}
