/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6;

public class cargamento {
    private String nombre;
    private double peso;
    private int unidades;

    public cargamento() {
    }

    public cargamento(String nombre, double peso, int unidades) {
        this.nombre = nombre;
        this.peso = peso;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "cargamento{" + "nombre=" + nombre + ", peso=" + peso + ", unidades=" + unidades + '}';
    }
    
}
