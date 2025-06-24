package com.mycompany.archivosejercicios;

/*
 * Ejercicio 5
 *
 * Añadir texto a un archivo existente
 * Añade la siguiente línea al final de saludo.txt
 * "Archivo modificado con exito!"
 *
 * Usa FileWriter en modo append(true)
 * Verifica que el archivo exista antes de escribir.
 */
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio5 {
    public Ejercicio5(){}
    
    public void agregarTexto(){
        try (FileWriter writer = new FileWriter("saludo.txt", true))
        {
            writer.write("\nArchivo modificado con exito!");
            System.out.println("Texto añadido al archivo.");
        } catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}
