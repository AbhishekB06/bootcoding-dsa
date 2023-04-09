package com.bootcoding.dsa.Array;

public class CopyEven {
    public static void main(String[] args) {
        int arr[] = {56,9,13,7,6,88,132};
        int count=0;
        for (int j=0; j<arr.length; j++){
            if(arr[j]%2==0){
                count++;
            }
        }
        int arr2[]=new int[count];
        int i = 0;
        for (int j=0; j<arr.length; j++){
            if(arr[j]%2==0){
                arr2[i++]=arr[j];
            }
        }
        System.out.println("Old Array :");
        for (int j=0; j<arr.length; j++){
            System.out.println(arr[j]);
        }
        System.out.println("New Array :");
        for (int j=0; j<count; j++){
            System.out.println(arr2[j]);
        }
    }
}
