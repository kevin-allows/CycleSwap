package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        int[] newArray = new int[array.length];
        if (array.length>0){
            int last = array[array.length-1];
            for (int i=0; i<array.length-1; i++){
                newArray[i+1]=array[i];
            }
            newArray[0] = last;
            for (int i=0; i<array.length; i++){
                array[i] = newArray[i];
            }
        } else {
            return;
        }
    }

    static void cycleSwap(int[] array, int shift) {
        int[] newArray = new int[array.length];
        for (int i=0; i<array.length; i++){
            if ((i+shift)>(array.length-1)) {
                newArray[(i+shift)-array.length] = array[i];
            }
            else {
                newArray[i+shift] = array[i];
            }
        }
        for (int i=0; i<array.length; i++) {
            array[i] = newArray[i];
        }

    }
}
