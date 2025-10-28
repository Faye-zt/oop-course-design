package com.coursedesign.demo.a16mergetwosortedarrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                list.add(arr1[i++]);
            }else{
                list.add(arr2[j++]);
            }
        }

        while(i < arr1.length){
            list.add(arr1[i++]);
        }
        while(j < arr2.length){
            list.add(arr2[j++]);
        }

        int[] arr = new int[list.size()];
        for(int k = 0; k < list.size(); k++){
            arr[k] = list.get(k);
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }



    }
}
