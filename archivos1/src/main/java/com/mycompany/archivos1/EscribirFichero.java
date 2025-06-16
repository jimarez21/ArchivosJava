/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.archivos1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author APIST-ALUMNOS
 */
public class EscribirFichero {
    public static void main(String[] args){
        File fichero = null;
        FileWriter writer = null;
        PrintWriter pw = null;
        try{
            fichero = new File("C:\\Users\\APIST-ALUMNOS\\Documents\\NetBeansProjects\\archivos1\\src\\main\\java\\com\\mycompany\\archivos1\\FicheroEjemplo.txt");
            writer = new FileWriter(fichero,true);
            pw = new PrintWriter(writer);
            System.out.println("Antes del for");
            for(int i=0;i<10;i++){
                pw.println("Linea "+i);
                System.out.println("For numero: "+i);
            }
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            try{
                if(null != pw){
                    pw.close();
                }
                if(writer != null){
                    writer.close();
                }
            } catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}