package com.bootcoding.dsa.Array;

import java.util.Scanner;

public class SquareOfEachElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Enter element "+(i+1));
            int number = sc.nextInt();
            numbers[i] = number;
        }
        System.out.println("Square of each element in array :");
        squareOfElement(numbers);
    }
    public static void squareOfElement(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[i] * numbers[i];
            System.out.println(numbers[i]);
        }
    }
}
