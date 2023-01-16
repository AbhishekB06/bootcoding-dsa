package com.bootcoding.dsa.Array;

public class ArraySquare {
    public static void main(String[] args) {
        int[] arr={3,4,9,6,8};
        int[] res =arraySquare(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static int[] arraySquare(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }

}
