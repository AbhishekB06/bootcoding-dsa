package com.bootcoding.dsa.Array;

public class CopyArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30 , 40, 50, 60, 70};
        int[] newArr= new int[arr.length];
        for (int l=0; l<arr.length; l++){
            newArr[l] = arr[l];
        }
    }
}
