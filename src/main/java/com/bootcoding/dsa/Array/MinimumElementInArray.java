package com.bootcoding.dsa.Array;

import java.util.Scanner;

public class MinimumElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array :");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter Element " + (i+1));
            int number = sc.nextInt();
            numbers[i] = number;
        }
        System.out.println("\nMinimum Element :");
        printMin(numbers);
    }

    public static void printMin(int[] numbers){
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++ ){
            if(min > numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
