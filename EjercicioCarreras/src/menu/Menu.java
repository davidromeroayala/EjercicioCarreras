/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class Menu {
   public static int NumeroAleatorio(int maximo){
  
       Random r = new Random();
       int numeroAleatorio = r.nextInt(maximo);
        return numeroAleatorio;
   }
}

