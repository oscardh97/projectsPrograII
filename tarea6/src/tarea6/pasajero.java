/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6;

/**
 *
 * @author SAMSUNG
 */
public class pasajero{
    private String nombre;
    private double peso;

    public pasajero(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "pasajero{" + "nombre=" + nombre + ", peso=" + peso + '}';
    }
        
}
