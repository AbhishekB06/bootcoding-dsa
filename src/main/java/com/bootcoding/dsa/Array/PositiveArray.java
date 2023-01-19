package com.bootcoding.dsa.Array;

public class PositiveArray {
    public static void main(String[] args) {
        int[] arr = {4,-9,6,-3,5};
        int[] res = negativeArray(arr);
        for (int i = 0; i < arr.length; i++){
                System.out.println(res[i]);
        }
    }
    public static int[] negativeArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > 0){

                return arr;
            }
        }
        return arr;
    }
}
