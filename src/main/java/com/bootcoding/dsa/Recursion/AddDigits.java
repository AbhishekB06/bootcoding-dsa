package com.bootcoding.dsa.Recursion;

public class AddDigits {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(countDigits(n));
    }
    public static int countDigits(int n){
        if(n < 10){
            return 1;
        }
        return (n%10) + countDigits(n/10);
    }
}
