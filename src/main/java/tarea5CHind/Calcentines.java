/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5CHind;

import java.util.Random;

/**
 *
 * @author hinda
 */
public class Calcentines {

    //atributos 
    private int tallas;
    private Colores colores;
    
   
    //constructor parameterized
    public Calcentines(int tallas, Colores colores) {
        this.tallas = tallas;
        this.colores = colores;
    }

    //constrector por defecto
    public Calcentines() {
        Random rd = new Random();
        this.tallas = rd.nextInt(4) + 40;;
        this.colores = Colores.generateRandomColor();
    }

    //getters
    public int getTallas() {
        return tallas;
    }

    public Colores getColores() {
        return colores;
    }

    //tostring
    @Override
    public String toString() {
        return "Calcentines{" + "tallas=" + tallas + ", colores=" + colores + '}' + "\n";
    }

     

}
