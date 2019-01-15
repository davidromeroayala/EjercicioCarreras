/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocarreras;

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

   
   //introducimos el coche 
    public Coche(String nombre, int dorsal,int distanciaCarrera) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.distanciaCarrera=distanciaCarrera;
        this.estado="parado";
        this.velocidad=0;
        this.kilometrosRecorridos=0;
    }

    Coche() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

   

    
    



}
