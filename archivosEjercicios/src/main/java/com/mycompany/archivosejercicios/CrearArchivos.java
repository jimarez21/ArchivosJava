package com.mycompany.archivosejercicios;
import java.io.File;
import java.io.IOException;
/*
CLASE EJEMPLO PARA CREAR ARCHIVOS
*/
public class CrearArchivos{
    public static void main(String[]args){
        Ejercicio2 e2 = new Ejercicio2();
        e2.leerArchivo();
    }
    /*
    public static void main(String [] args){
        File archivo = new File("mi_archivo.txt");//Creamos un objeto File para crear nuestro archivo
        
        try{
            if(archivo.createNewFile()){
                //Condicional que nos avisará si el archivo fue creado con exito
                System.out.println("Archivo creado: "+archivo.getName());
            } else {
                //Si el archivo ya existe, nos manda el mensaje correspondiente
                System.out.println("El archivo ya existe.");
            }
        } catch(IOException e){
            //Excepcion que nos dice si ocurre algun error
            System.out.println("Error al crear el archivo: "+ e.getMessage());
        }
    }
    */
}
