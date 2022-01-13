package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        int[] newArray = new int[array.length];
        int last = array[array.length-1];
        for (int i=0; i<array.length-1; i++){
            newArray[i+1]=array[i];
        }
        newArray[0] = last;
        array = Arrays.copyOf(newArray, array.length);
    }

    /*
    if (i == array.length-1){
                array[0] = array[array.length-1];
            }
     */

    static void cycleSwap(int[] array, int shift) {

    }
}
