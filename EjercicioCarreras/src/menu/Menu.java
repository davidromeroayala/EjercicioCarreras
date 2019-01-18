/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
abstract  public class Menu {
   public static int numeroAleatorio(int maximo){
  
       Random r = new Random();
       int numeroAleatorio = r.nextInt(maximo);
        return numeroAleatorio;
   }
   
   public static int menuInicio(){
       int opc=-1;
        do{
            System.out.println("Seleccione una opción");
            System.out.println("1. Configurar carrera");
            System.out.println("0. Salir");
            Scanner leer=new Scanner(System.in);
            
            try{
                switch(opc=leer.nextInt()){
                }
            }catch(Exception e){
                System.out.println("Introduzca un numero de la lista");
            }
        }while(!(opc>=0) && !(opc<=1));
      return opc; 
       
   }
   
   
}

