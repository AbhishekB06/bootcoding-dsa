package com.bootcoding.dsa.Search;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,99,69,4,32,17};
        int[] res = insertionSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(res[i]);
        }
    }
    public static int[] insertionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
