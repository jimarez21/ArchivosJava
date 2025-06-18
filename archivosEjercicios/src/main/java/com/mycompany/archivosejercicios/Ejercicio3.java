/*
 * Ejercicio 3
 * Copia el contenido de saludo.txt a un nuevo archivo llamado copia_saludo.txt
 *
 * Usa FileReader para leer y FileWriter para escribir.
 * No sobreexcribir si copia_saludo.txt ya esxiste (usa un nombre diferente).
 */
package com.mycompany.archivosejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
public Ejercicio3(){}    
    void copia(){
        try (BufferedReader reader = new BufferedReader(new FileReader("saludo.txt"));
             FileWriter writer = new FileWriter("copia_saludo.txt")) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea + "\n");
            }
            System.out.println("Archivo copiado con exito.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}