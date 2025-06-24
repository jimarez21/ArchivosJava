package com.mycompany.archivosejercicios;

/* Ejercicio 4
 * Cuenta cuantas lineas tiene el archivo saludo.txt
 *
 * Usa BufferedReader
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {
    Ejercicio4(){}
    
    void contador(){
        int cont = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("saludo.txt"))){
            while(reader.readLine() != null){
                cont++;
            }
            System.out.println("Numero de lineas: "+cont);
        } catch(IOException e) {
            System.err.println("Error: "+e.getMessage());
        }
    }
}
