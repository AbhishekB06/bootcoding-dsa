package com.bootcoding.dsa.Recursion;

public class PrintNaturalNumbers {
    public static void main(String[] args) {
        int n = 50;
        naturalNumbers(n);
    }
    public static void naturalNumbers(int n){
        if(n == 0){
            return;
        }
        naturalNumbers(n-1);
        System.out.println(n);
    }
}
