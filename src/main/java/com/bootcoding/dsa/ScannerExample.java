package com.bootcoding.dsa;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int value = sc.nextInt();
        boolean res = isEven(value);
        if(res){
            System.out.println(value + " Is Even");
        }else{
            System.out.println(value + " Is Odd");
        }
    }
    public static boolean isEven(int value){
        return value % 2 == 0;
    }
}
