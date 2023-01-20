package com.bootcoding.dsa.Recursion;

public class CountDigits {
    public static void main(String[] args) {
        int n = 4567;
        System.out.println(countDigits(n));
    }
    public static int countDigits(int n){
        if(n <= 9){
            return 1;
        }
        return 1 + countDigits(n/10);
    }
}
