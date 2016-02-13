package tarea6;

import java.util.ArrayList;
import java.util.Scanner;
import static tarea6.Tarea6.pasajerosSistema;

public class avionPasajero extends avion{
    private static final Scanner lector = new Scanner( System.in );
    private int cantPasajetos;
    private double maxPeso;
    private ArrayList< pasajero > pasajeros = new ArrayList();
    public avionPasajero() {
        super();
    }

    public avionPasajero(int cantPasajetos, double maxPeso, int capacCombus, String nombre, String fabricante) {
        super(capacCombus, nombre, fabricante);
        this.cantPasajetos = cantPasajetos;
        this.maxPeso = maxPeso;
    }
    
    public int getCantPasajetos() {
        return cantPasajetos;
    }

    public void setCantPasajetos(int cantPasajetos) {
        this.cantPasajetos = cantPasajetos;
    }

    public double getMaxPeso() {
        return maxPeso;
    }

    public void setMaxPeso(double maxPeso) {
        this.maxPeso = maxPeso;
    }
    
    @Override
    public void despegar(){
        boolean masPasajeros;
        do{
            for (pasajero item : pasajerosSistema) {
             if( pasajeros.indexOf( item ) != -1)
                System.out.println(pasajerosSistema.indexOf(item) + ".- " + item.toString());
            }
            System.out.println("Ingrese la posicion");
            int op = lector.nextInt();
            double pesoActual = 50;
            for (pasajero pasajero1 : pasajeros) {
                pesoActual += pasajero1.getPeso();
            }
            if( pesoActual + pasajerosSistema.get(op).getPeso() < maxPeso){
                pasajeros.add( pasajerosSistema.get(op) );
            }else{
    //            Lanzar exception por gordo
            }
            masPasajeros = lector.next().toUpperCase().equals("S");
        }while( masPasajeros );
    }
    public void validar (){
        for (pasajero t : pasajeros) { 
        if (t.getPeso() > this.getMaxPeso()){
            System.out.println("Tiene que dejar un minimo de 50 libras");
        }
        }
    }
}
