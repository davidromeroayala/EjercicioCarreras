/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocarreras;

import menu.Menu;

/**
 *
 * @author alumno
 */
public class Coche {
    private String nombre;
    private int dorsal;
    private int distanciaCarrera;
    private final int potencia=50;
    private int velocidad;
    private int kilometrosRecorridos;
    private String estado;
    private boolean humano;

   
   //introducimos el coche 
    public Coche(String nombre, int dorsal,int distanciaCarrera) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.distanciaCarrera=distanciaCarrera;
        this.estado="parado";
        this.velocidad=0;
        this.kilometrosRecorridos=0;
        this.humano = false;
    }
    public Coche(int dorsal){
        this.nombre = "Bot";
        this.dorsal = dorsal;
        this.distanciaCarrera=distanciaCarrera;
        this.estado="parado";
        this.velocidad=0;
        this.kilometrosRecorridos=0;
        this.humano = true;
    }
    public void arrancar(){
        estado = "marcha";
    }
    public void frenar(){
         int num=0;
         num = Menu.numeroAleatorio(potencia);
         
             velocidad-=num;
             kilometrosRecorridos+=num;
         }
    public void acelerar(){
         int num=0;
         num = Menu.numeroAleatorio(potencia);
         if ((velocidad+num)>200){
             velocidad=0;
             estado="accidentado";
             
         }else{
             velocidad+=num;
             kilometrosRecorridos+=num;
             if (kilometrosRecorridos>=distanciaCarrera)
                 estado="terminado";
             System.out.println("Ha terminado");
         }
         
       /* if (vCoche[i].getVelocidad()==-2) {
            System.out.println("Accidentado ya no puede participar");
        }else{
            num= Menu.numeroAleatorio(vCoche[i].getPotencia());
             if (vCoche[i].getVelocidad()==-1) {
                 vCoche[i].setVelocidad(0);
             }
            num+=vCoche[i].getVelocidad();

            if(num<200){vCoche[i].setVelocidad(num);
            }else{if (cochesTerminados()<0) {
                      vCoche[i].setVelocidad(-2);
                      vCoche[i].setEstado("accidentado");  
                }else{
            vCoche[i].setVelocidad(-1);
            vCoche[i].setEstado("accidentado");
                 }
            }
            int recorrido=0;
            recorrido= vCoche[i].getKilometrosRecorridos();
            recorrido+=num;
            vCoche[i].setKilometrosRecorridos(recorrido);*/
    }
    
    public int getPotencia() {
        return potencia;
    }

    public void setHumano(boolean humano) {
        this.humano = humano;
    }

    public boolean isHumano() {
        return humano;
    }
    
    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getDistanciaCarrera() {
        return distanciaCarrera;
    }

    public void setDistanciaCarrera(int distanciaCarrera) {
        this.distanciaCarrera = distanciaCarrera;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    public String datospiloto() {
        return "nombre=" + nombre + ", dorsal=" + dorsal ;
    }

    public String duranteCarrera () {
        return "nombre=" + nombre + ", dorsal=" + dorsal + ", estado= " + estado + ", velocidad= " + velocidad +", kilometros recorridos= "+ kilometrosRecorridos ;
    }

    
    



}
