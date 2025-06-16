/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.archivos1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author APIST-ALUMNOS
 */
public class LecturaFichero {
    public static void main(String[]arg){
        File archivo = null;
        FileReader reader = null;
        BufferedReader buffer = null;
        
        try {
            archivo = new File("C:/Users/APIST-ALUMNOS/Documents/NetBeansProjects/archivos1/src/main/java/com/mycompany/archivos1/FicheroEjemplo.txt");
            reader = new FileReader(archivo);
            buffer = new BufferedReader(reader);
            
            String linea;
            while((linea=buffer.readLine()) != null){
                System.out.println(linea);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(null != reader){
                    reader.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
