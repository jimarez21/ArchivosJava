/*
 * Realiza un programa que:
 * Cree un archivo llamdo "registro.txt"
 * Pida al usuario que ingrese 3 líneas de texto (usando Scanner).
 * Guardar esas líneas en el archivo.
 * Mostrar el contenido del archivo al final
 */
package com.mycompany.archivosejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class EjercicioFinal {
    public EjercicioFinal(){}
    
    void crearArchivo(String name){
        File archivo = new File(name);
        try{
            if(archivo.createNewFile()){
                System.out.println("Archivo creado: "+archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch(IOException e){
            System.out.println("Error al crear el archivo: "+ e.getMessage());
        }
    }
    
    void escribirLinea(String archivo,String linea){
        File fichero = null;
        FileWriter escribir = null;
        PrintWriter pw = null;
        try {
            fichero = new File(archivo);
            escribir = new FileWriter(fichero,true);
            pw = new PrintWriter(escribir);
            pw.println(linea);
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    
    void leerArchivo(String archivo){
        try (BufferedReader lector =  new BufferedReader(new FileReader(archivo)))
        {
            String linea;
            while((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: "+e.getMessage());
        }
    }
    
}
