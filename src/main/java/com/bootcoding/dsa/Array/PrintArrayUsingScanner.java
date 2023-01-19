package com.bootcoding.dsa.Array;

import java.util.Scanner;

public class PrintArrayUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array :");
        int size = sc.nextInt();
        int numbers[]= new int[size];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter number " +(i+1));
            int number = sc.nextInt();
            numbers[i] = number;
        }
        System.out.println("\nArray :");
        printArray(numbers);
    }
    public static void printArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
