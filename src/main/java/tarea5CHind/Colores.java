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
public enum Colores {
    NEGRO,AZUL_CLARO,AZUL,BLANCO;
    
      //metodo para genera random color 
     public static Colores generateRandomColor() {
            Colores[] values = Colores.values();
            int length = values.length;
            int randIndex = new Random().nextInt(length);
            return values[randIndex];
        }
}
