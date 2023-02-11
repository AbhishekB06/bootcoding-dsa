package com.bootcoding.dsa.Array;

import java.util.Scanner;

public class DuplicateNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array :");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter element "+(i+1));
            int number = sc.nextInt();
            numbers[i] =number;
        }
        System.out.println("Duplicate Number :");
        duplicateNumber(numbers);
    }
    public static void duplicateNumber(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    System.out.println(numbers[j]);
                }
            }
        }
    }
}
