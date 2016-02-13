/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racional;

/**
 *
 * @author Nozaki
 */
public class racional {
    private int num;
    private int den;

    public racional() {
    }

    public racional(int num, int den) throws miex {
        this.num = num;
        setDen(den);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) throws miex {
        if(den == 0){
            throw new miex("No se aceptan denominadores en cero");
        }else{
          this.den = den;  
        }   
    }

    @Override
    public String toString() {
        return "racional{" + "num=" + num + ", den=" + den + '}';
    }
    
}
