package com.bootcoding.dsa.Recursion;

public class EvenNumberUsingRecursion {
    public static void main(String[] args) {
        int n = 10;
        even(n);
    }
    public static void even(int n){
        if(n== 0){
            return;
        }
        even(n-1);
        if(n % 2 == 0) {
            System.out.println(n);
        }
    }
}
