package com.bootcoding.dsa.Recursion;

public class CalculatePower {
    public static void main(String[] args) {
        int n = 3;
        int p = 4;
        System.out.println(power(n,p));
    }
    public static int power(int n, int p){
        if(p==0){
           return 1;
        }
//        if(p == 1){
//            return n;
//        }
        return n* power(n, p-1);
    }
}
