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
    public int nuevoCoche() {
        Scanner leer=new Scanner(System.in);
        String nombrepiloto="";
        int diferente=0;
        int dorsalpiloto=-1;
        int comprueba=-1;
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
                if(coche!=null && dorsalpiloto==coche.getDorsal()){
                    diferente=-1;
                    System.out.println("El dorsal ya esta ocupado escoja otro");
                    break;
                }
            }
        }while(diferente==-1);
        Coche nuevo= new Coche(nombrepiloto, dorsalpiloto, distanciaCarrera);
        nuevo.setHumano(true);
        boolean bandera=true;
         for (int i = 0; i < vCoche.length; i++) {
             if (vCoche[i]==null) {
                 vCoche[i]=nuevo;
                 System.out.println("Ha sido añadido");
                  bandera= false;
                  comprueba=0;
                 break;
             }
        }
         if (bandera) {
             System.out.println("No quedan huecos");
            
        }
         return comprueba;
    }
    public void cocheBotNuevo(){
        int diferente=0;
        int dorsal;
        for (int i = 0; i < vCoche.length; i++) {
            if (vCoche[i]==null){
               do{
                    dorsal = Menu.numeroAleatorio(100);
                    for (Coche coche : vCoche) {
                        if(coche!=null && dorsal==coche.getDorsal()){
                            diferente=-1;
                            System.out.println("El dorsal ya esta ocupado escoja otro");
                            break;
                        }
                    }   
                }while(diferente==-1); 
                vCoche[i]=new Coche(dorsal);
            }
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
    public int cochesAccidentados(){
        int cantidad=0;
        for (Coche coche : vCoche) {
                if(coche.getEstado().equalsIgnoreCase("accidentado")){
                    cantidad++;
                }
        }
        
    return cantidad;
    }
    public void mostrarPilotos(){
        for (Coche coche : vCoche) {
            
            System.out.println(coche.datospiloto());   
        }
    }
    public void mostrarPilotosDuranteCarrera(){
        for (Coche coche : vCoche) {
            System.out.println(coche.duranteCarrera());   
        }
    }
    public void arrancarTodos(){
        for (int i = 0; i < vCoche.length; i++) {
            vCoche[i].arrancar();
            
        }
    }
    public void jugar(){
    mostrarPilotos();
    arrancarTodos();
        do{
            for (int i = 0; i <vCoche.length; i++) {
               if (vCoche[i].isHumano()){
                    Scanner leer=new Scanner(System.in); 
                    if (vCoche[i].getEstado().equalsIgnoreCase("accidentado")){
                        if (cochesTerminados()>0){
                            System.out.println("No puedes volver a arrancar");
                        }else{
                            vCoche[i].arrancar();
                        }
                    }else{
                        mostrarPilotosDuranteCarrera();
                        
                        System.out.println("1 Acelerar 2 Frenar"); 
                        switch(leer.nextInt()){
                            case 1:
                                vCoche[i].acelerar();
                                break;
                            case 2:
                                vCoche[i].frenar();
                                break;
                        }
                    }
               }else{
                   //acelerar o frenar aleatoriamente
                   switch (Menu.numeroAleatorio(1)) {
                       case 0:
                           vCoche[i].acelerar();
                           break;
                        case 1:
                           vCoche[i].frenar();
                           break;
                       
                   }
               }
                
            }
           
        }while(!partidaTerminada());
    
    
    }
    
    
    private boolean partidaTerminada(){
        
        return (cochesAccidentados()+cochesTerminados()==vCoche.length);
    }
    
    
    
}