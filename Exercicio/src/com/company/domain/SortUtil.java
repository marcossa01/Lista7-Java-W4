package com.company.domain;

import com.company.interfaces.Precedente;

import java.util.Comparator;

public class SortUtil {

    public static <T> void ordena(Precedente<T> arr[]) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length-1; j++) {
                    if(arr[j].precedeA((T)arr[j+1]) > 0) {
                        Precedente<T> aux = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = aux;
                    }
                }
            }
    };
}
