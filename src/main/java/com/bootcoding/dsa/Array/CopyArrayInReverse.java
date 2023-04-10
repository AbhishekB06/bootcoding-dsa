package com.bootcoding.dsa.Array;

public class CopyArrayInReverse {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = new int[arr.length];
        int i=0;
        for(int j=arr.length-1;j>=0;j--){
            arr2[j]=arr[i++];
        }
        System.out.println("Old array :");
        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
        System.out.println("New array :");
        for (int k=0;k<arr.length;k++){
            System.out.println(arr2[k]);
        }
    }
}
