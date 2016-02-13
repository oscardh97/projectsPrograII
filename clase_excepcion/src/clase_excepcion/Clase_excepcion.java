/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nozaki
 */
public class Clase_excepcion {
    public static void main(String[] args) throws miEx {
        
        try {
          int x ;   
        System.out.print("escriba x: ");
        Scanner sc = new Scanner (System.in);
        x = sc.nextInt();
        validar(x);
        System.out.println(10/x);  
        } catch (miEx e) {
            System.out.println(e.getMessage());
            
        }
        
    }
    public static void validar (int x) throws miEx{
        if (x < 0){
            throw new miEx("No se aceptan negativos");
        }
    }
    
}
