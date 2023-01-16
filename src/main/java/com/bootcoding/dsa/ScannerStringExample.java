package com.bootcoding.dsa;

import java.util.Scanner;

public class ScannerStringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word :");
        String word = sc.next();
        char output = duplicateCharacter(word);
        System.out.println("Duplicate Character in " + word +" is " + output);
    }
    public static char duplicateCharacter(String word){
        char[] chars = word.toCharArray();

        for(int i = 0; i < word.length(); i++){
            for(int j = i+1; j< word.length(); j++){
            if(chars[i]==chars[j]){
                return chars[i];
            }

            }
        }
        return 0;
    }
}
