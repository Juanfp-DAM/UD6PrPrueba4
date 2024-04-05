package es.iesmz.tests;

import java.util.Collections;

public class Vector {

    public static int[] reverso(int [] v){
        int vLength=v.length;
        int [] revers=new int[vLength];
        int vPosicion=0;
        int guardaIntV;
        for (int i=vLength-1; i>=0; i--){
            guardaIntV=v[i];
            revers[vPosicion]=guardaIntV;
            vPosicion++;
        }
        return revers;
    }

    //Se podría hacer usando reverso (v)

}
