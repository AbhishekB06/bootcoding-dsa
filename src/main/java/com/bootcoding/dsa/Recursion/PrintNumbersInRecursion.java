package com.bootcoding.dsa.Recursion;

public class PrintNumbersInRecursion {
    public static void main(String[] args) {
        int n =15;
        print(n);
    }
    public static void print(int n){
        if(n == 0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
