package com.bootcoding.dsa.Search;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {15,19,-5,7,6,5};
       int[] a = bubbleSort(arr);
       for (int i =0 ; i< a.length;i++){
           System.out.println(a[i]);
       }
    }
    public static int[] bubbleSort(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
