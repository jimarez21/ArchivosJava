/*
 * Ejercicio 2
 * Lee el archivo saludo.txt (creado preciamente en el ejercicio 1) y muestra su contenido por consola.
 *
 * Usa FileReader y BufferedReader
 */
package com.mycompany.archivosejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    
    public Ejercicio2(){}
    
    void leerArchivo(){
        try (BufferedReader reader = new BufferedReader(new FileReader("saludo.txt"))){
            String linea;
            while((linea = reader.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e){
            System.out.println("Error al leer el archivo: "+e.getMessage());
        }
    }
    
}
