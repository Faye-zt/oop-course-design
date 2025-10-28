package com.coursedesign.demo.a14findmax;

public class FindMax {
    public <E extends Comparable<E>> E findMax(E[] arr ){
        if(arr == null){
            return null;
        }

        E max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].compareTo(max) > 0){
                max = arr[i];
            }
        }
        return max;
    }
}
