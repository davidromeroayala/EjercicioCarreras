/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocarreras;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Carrera {
    private String nombre;
    private int distanciaCarrera;
    private int cantidadCoches;
    private Coche[] vCoche;

    public Carrera(String nombre, int distanciaCarrera, int cantidadCoches) {
        this.nombre = nombre;
       
        this.distanciaCarrera = distanciaCarrera;
        this.cantidadCoches = cantidadCoches;
        this.vCoche =new Coche[cantidadCoches];
    }
    //crea coche sin que se repita el dorsal y se introduce en el vector 
    public void nuevoCoche() {
        Scanner leer=new Scanner(System.in);
        String nombrepiloto="";
        int diferente=0;
        int dorsalpiloto=69;
        
        do{
            try{
                System.out.println("Introduzca el nombre");
                nombrepiloto=leer.nextLine();
                System.out.println("Introduzca el dorsal");
                dorsalpiloto=leer.nextInt();
                diferente=0;
            }catch(Exception e){
                System.out.println("Erro vuelva a intentarlo");
            }
            for (Coche coche : vCoche) {
                if(dorsalpiloto==coche.getDorsal()){
                    diferente=-1;
                    System.out.println("El dorsal ya esta ocupado escoja otro");
                    break;
                }
            }
        }while(diferente==-1);
        Coche nuevo= new Coche(nombrepiloto, dorsalpiloto, distanciaCarrera);
        boolean bandera=true;
         for (int i = 0; i < vCoche.length; i++) {
             if (vCoche[i]==null) {
                 vCoche[i]=nuevo;
                 System.out.println("Ha sido añadido");
                  bandera= false;
                 break;
             }
        }
         if (bandera) {
             System.out.println("No quedan huecos");
            
        }
    }
    //cuenta los coches en Marcha
    public int cochesMarcha(){
        int cantidad=0;
        for (Coche coche : vCoche) {
                if(coche.getEstado().equalsIgnoreCase("marcha")){
                    cantidad++;
                }
        }
    return cantidad;
    }
    // cuenta los coches Terminados
    public int cochesTerminados(){
        int cantidad=0;
        for (Coche coche : vCoche) {
                if(coche.getEstado().equalsIgnoreCase("terminado")){
                    cantidad++;
                }
        }
    return cantidad;
    }
    public void mostrarPilotos(){
        for (Coche coche : vCoche) {
            coche.datospiloto();
        }
    }
}