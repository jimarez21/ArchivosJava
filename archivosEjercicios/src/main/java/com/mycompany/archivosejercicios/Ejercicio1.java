/*
 * Ejercicio 1
 * Crea un archivo llado saludo.txt y escribe dentro el texto:
 * "Hola, mundo! Este es mi primer archivo en Java"
 *
 * Usar FileWriter
 */
package com.mycompany.archivosejercicios;

import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    public Ejercicio1(){}
    void crearArchivo(){
        try(FileWriter archivo =  new FileWriter("saludo.txt")){
            archivo.write("Hola, mundo! Este es mi primer archivo en Java");
            System.out.println("Archivo creado y texto escrito");
        } catch (IOException e){
            System.err.println("Error al escribir el archivo: "+e.getMessage());
        }
    }
}
