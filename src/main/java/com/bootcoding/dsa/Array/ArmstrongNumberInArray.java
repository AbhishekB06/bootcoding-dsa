package com.bootcoding.dsa.Array;

import java.util.Scanner;

public class ArmstrongNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array :");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1));
            int number = sc.nextInt();
            numbers[i] = number;
        }
        System.out.println("Armstrong Number : ");
        armstrongNumber(numbers);
    }
    public static void armstrongNumber(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            int temp = numbers[i];
            int sum = 0;
            while(numbers[i] > 0){
                int rem = numbers[i] % 10;
                sum = sum +(rem * rem * rem);
                numbers[i] = numbers[i] / 10;
            }
            if(sum == temp){
                System.out.println(temp);
            }
        }
    }
}
