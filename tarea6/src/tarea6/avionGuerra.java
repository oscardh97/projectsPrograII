/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6;

import java.util.ArrayList;
import java.util.Scanner;
import static tarea6.Tarea6.armasSistema;

/**
 *
 * @author SAMSUNG
 */
public class avionGuerra extends avion{
    private final static Scanner lector = new Scanner( System.in );
    private String piloto, copiloto;
    ArrayList< arma > armas = new ArrayList();
    @Override
    public void despegar() {
        boolean masArmas;
        do{
            for (arma arma1 : armasSistema) {
                if( armas.indexOf(arma1) != -1){
                    System.out.println(armasSistema.indexOf(arma1) + ".- " + arma1.toString()); 
                }

            }
            System.out.println("Ingrese la posicion del arma: ");
            int pos = lector.nextInt();
            armas.add( armasSistema.get(pos) );
            System.out.println("Desea ingresar mas armas?");
            masArmas = lector.next().toLowerCase().equals("s");
        }while( masArmas );
    }
    
}
