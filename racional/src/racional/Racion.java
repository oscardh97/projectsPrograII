/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racional;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nozaki
 */
public class Racion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            racional x  = new racional(1,0);
        } catch (miex ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
