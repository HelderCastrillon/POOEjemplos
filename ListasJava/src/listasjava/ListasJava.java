/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Helder Castrillon
 */
public class ListasJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   List <Estudiante> estudiantes = new ArrayList <Estudiante>();
   String nombre="";
   int codigo=0;
   Scanner leer = new Scanner(System.in);
   do{
       System.out.println("Digite un nombre");
       nombre=leer.next();
    System.out.println("Digite un código");
       codigo=leer.nextInt();
       
       Estudiante est = new Estudiante(nombre, codigo);
       
      estudiantes.add(est);
   }while(!nombre.equals("salir"));

// imprimiendo nombres
   for(int i=0; i<estudiantes.size();i++){
       System.out.println("Nombre del estudiante "+ estudiantes.get(i).getNombre());
   }
   
    
    }
    
}
