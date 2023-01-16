package com.bootcoding.dsa.Array;

import java.util.Scanner;

public class EvenAndOddInArray {
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
        System.out.println("\nEven Elements :");
        printEven(numbers);
        System.out.println("\nOdd Elements :");
        printOdd(numbers);
    }
    public static void printEven(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                System.out.println(numbers[i]);
            }
        }
    }
    public static void printOdd(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 1){
                System.out.println(numbers[i]);
            }
        }
    }
}
