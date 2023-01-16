package com.bootcoding.dsa.Array;

import java.util.Scanner;

public class MaximumElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int size = sc.nextInt();
        int numbers[] =new int[size];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter element "+(i+1));
            int number = sc.nextInt();
            numbers[i] = number;
        }
        System.out.println("Maximum element :");
        printMax(numbers);
    }
    public static void printMax(int[] numbers){
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++ ){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
