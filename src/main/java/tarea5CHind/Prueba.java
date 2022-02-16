/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5CHind;

import java.util.Arrays;

 
/**
 *
 * @author hinda
 */
public class Prueba {
    
    public static void main(String[] args) {
 
        //creat cajonCalcentines
        CajonCalcetines cajon = new CajonCalcetines();
              
        //mostrar la lista de cajon
         cajon.mostrar();     
        
         //parejados
        System.out.println(" Parejados es null\n"+Arrays.toString(cajon.ParejadosYsueltos()));
         
       
        
        

    }
}
