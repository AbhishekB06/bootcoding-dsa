package com.bootcoding.dsa.Recursion;

public class PrintArray {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,60};
        printArray(a, 0);
    }
    public static void printArray(int[] a, int i){
        if(i==a.length){
            return;
        }
        System.out.println(a[i]);
        printArray(a,++i);
    }
}
