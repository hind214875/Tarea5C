/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5CHind;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author hinda
 */
public class CajonCalcetines {

    //atributos
    private Calcentines[] CajonCalcetines;

    //constrectores
    public CajonCalcetines() {
        this.CajonCalcetines = cajonCalcentinesAleatorio();
    }

    public CajonCalcetines(Calcentines[] CajonCalcetines) {
        this.CajonCalcetines = CajonCalcetines;
    }

    //metodo que genera lista de cajonCalcentines de N Calcentines entre 10 y 20
    public static Calcentines[] cajonCalcentinesAleatorio() {
        Random rd = new Random();
        int length = rd.nextInt(11) + 10;
        Calcentines[] cajonCalcentines = new Calcentines[length];

        for (int i = 0; i < cajonCalcentines.length; i++) {
            cajonCalcentines[i] = new Calcentines();
        }

        return cajonCalcentines;
    }

    //mostar el cajon de calcentines
    public void mostrar() {
        System.out.println("la lista de Calcentines: ");
        for (int i = 0; i < CajonCalcetines.length; i++) {
            System.out.println(CajonCalcetines[i]);
        }

    }

    //metodo que devuelve el Calcentines parejados o no 
    public Calcentines[] ParejadosYsueltos() {
        //creat nuevo array aux 
        Calcentines[] aux = new Calcentines[CajonCalcetines.length];

        //copio CajonCalcetines en aux
        System.arraycopy(CajonCalcetines, 0, aux, 0, CajonCalcetines.length);
        
        //crear lista de sueltos 
        ArrayList<Calcentines> sueltos=new ArrayList<>();

        for (int i = 0; i < aux.length; i++) {
            for (int j = i + 1; j < aux.length; j++) {
                if (aux[i] != null) {
                    //comparamos si los dos calcentines son egual
                    if (aux[i].equals(aux[j])) {
                       aux[i]=null;
                       aux[j]=null;
                    }
                }
            }
        }

        
        
        for (Calcentines aux1 : aux) {
            if (aux1 != null) {
                sueltos.add(aux1);
            }
        }
        
       Calcentines[] sueltosArray=new Calcentines[sueltos.size()];
         for (int i = 0; i < sueltos.size(); i++) {
            sueltosArray[i]=sueltos.get(i);
        }
//        
        return aux;
    }

//    public Calcentines[] calcentinoParejados(Calcentines[] calcentines) {
//        boolean[] pareja = new boolean[calcentines.length];
//
//        for (int i = 0; i < calcentines.length; i++) {
//            for (int j = i + 1; j < calcentines.length; j++) {
//                if (calcentines[i].equals(calcentines[j])) {
//                    pareja[i] = true;
//                    pareja[j] = true;
//                    break;
//                }
//            }
//        }
//
//        Calcentines[] sueltos = new Calcentines[calcentines.length];
//        for (int i = 0; i < pareja.length; i++) {
//            if (!(pareja[i])) {
//                sueltos[i] = calcentines[i];
//            }
//        }
//
//        if (sueltos != null) {
//            System.out.println("DESPAREJADOS");
//        } else {
//            System.out.println("PAREJADOS");
//        }
//
//        return sueltos;
//    }
    @Override
    public String toString() {
        return "CajonCalcetines{" + "CajonCalcetines=" + CajonCalcetines + '}';
    }

}
