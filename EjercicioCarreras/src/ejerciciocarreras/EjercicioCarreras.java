/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocarreras;

import java.util.Scanner;
import menu.Menu;

/**
 *
 * @author alumno
 */
public class EjercicioCarreras {
    public static void main(String[] args) {
        Carrera prueba=new Carrera("prueba", 200, 5);
       if(Menu.menuInicio()==1){
           System.out.println("1. Coche Humano 2. Rellenar el resto a Bot");
           Scanner leer=new Scanner(System.in);
           
           switch(leer.nextInt()){
               case 1:
               if(prueba.nuevoCoche()==0){

                   

                }break;
               case 2:prueba.cocheBotNuevo();
       }
          prueba.jugar();      
       }
        
        
            
        
       
    }
}
