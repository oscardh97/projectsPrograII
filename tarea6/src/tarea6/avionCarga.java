package tarea6;

import java.util.ArrayList;
import java.util.Scanner;
import static tarea6.Tarea6.cargamentosSistema;

public class avionCarga extends avion{
    private static final Scanner lector = new Scanner( System.in );
    ArrayList< cargamento > Cargamento = new ArrayList();
    double maxPeso;

    public avionCarga() {
        super();
    }

    public avionCarga(double maxPeso, int capacCombus, String nombre, String fabricante) {
        super(capacCombus, nombre, fabricante);
        this.maxPeso = maxPeso;
    }
    
    @Override
    public void despegar(){
        boolean masPasajeros;
        do{
            for (cargamento item : cargamentosSistema) {
             if( Cargamento.indexOf( item ) != -1)
                System.out.println(cargamentosSistema.indexOf(item) + ".- " + item.toString());
            }
            System.out.println("Ingrese la posicion");
            int op = lector.nextInt();
            double pesoActual = 50;
            for (cargamento pasajero1 : Cargamento) {
                pesoActual += pasajero1.getPeso();
            }
            if( pesoActual + cargamentosSistema.get(op).getPeso() < maxPeso){
                Cargamento.add( cargamentosSistema.get(op) );
            }else{
    //            Lanzar exception por gordo
            }
            masPasajeros = lector.next().toUpperCase().equals("S");
        }while( masPasajeros );
    }
}
