package com.bootcoding.dsa.LeetCode;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {5, 6, 3, 2, 9, 13};
        int arr1[] = getConcatenation(nums);
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

    }
    public static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int arr[] = new int[2*n];
        for(int i = 0; i < n; i++){
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }
        return arr;
    }
}
