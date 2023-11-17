/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author poo08alu04
 */
public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("##### Actividad Extra #########");
        try {
            
            FileWriter fw = new FileWriter("alumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter impresoraDeArchivos = new PrintWriter(bw);
            
            Alumno alumno1 = new Alumno("Carlos","Arroyo",19,3);
            Alumno alumno2 = new Alumno("Paola","Perez",17,2);
            Alumno alumno3 = new Alumno("Ilse","Martinez",20,1);
            Alumno alumno4 = new Alumno("Ivan","Martinez",23,6);
            Alumno alumno5 = new Alumno("Juan","Balmes",29,8);
            
            impresoraDeArchivos.println("Alumno 1: Nombre: "+alumno1.getNombre()+" Apellido: "+alumno1.getApellido()+" Edad: "+alumno1.getEdad()+" Semestre: "+alumno1.getSemestre());
            impresoraDeArchivos.println("Alumno 2: Nombre: "+alumno2.getNombre()+" Apellido: "+alumno2.getApellido()+" Edad: "+alumno2.getEdad()+" Semestre: "+alumno2.getSemestre());
            impresoraDeArchivos.println("Alumno 3: Nombre: "+alumno3.getNombre()+" Apellido: "+alumno3.getApellido()+" Edad: "+alumno3.getEdad()+" Semestre: "+alumno3.getSemestre());
            impresoraDeArchivos.println("Alumno 4: Nombre: "+alumno4.getNombre()+" Apellido: "+alumno4.getApellido()+" Edad: "+alumno4.getEdad()+" Semestre: "+alumno4.getSemestre());
            impresoraDeArchivos.println("Alumno 5: Nombre: "+alumno5.getNombre()+" Apellido: "+alumno5.getApellido()+" Edad: "+alumno5.getEdad()+" Semestre: "+alumno5.getSemestre());
            impresoraDeArchivos.close();
            
            System.out.println("######### Lectura del archivo ########");
            FileReader fr = new FileReader("alumnos.csv");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while(linea!=null){
                for (int i = 6; i < 10; i++) {
                    impresoraDeArchivos.println("Alumno "+i+" :"+ "Nombre: "+alumno2.getNombre()+" Apellido: "+alumno2.getApellido()+" Edad: "+alumno2.getEdad()+" Semestre: "+alumno2.getSemestre());
                }
            }
            br.close();
                      
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
     }
    
    }
}
