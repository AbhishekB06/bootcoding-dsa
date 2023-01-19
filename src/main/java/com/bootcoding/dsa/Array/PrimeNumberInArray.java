package com.bootcoding.dsa.Array;

import java.util.Scanner;

public class PrimeNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int size = sc.nextInt();
        int numbers[]=new int[size];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter element "+(i+1));
            int number = sc.nextInt();
            numbers[i] = number;
        }
        System.out.println("Prime numbers :");
        primeNumber(numbers);
    }
    public static void primeNumber(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            boolean isPrime = true;
            for(int j = 2; j < numbers[i]; j++){
                if(numbers[i] % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(numbers[i]);
            }
        }
    }
}