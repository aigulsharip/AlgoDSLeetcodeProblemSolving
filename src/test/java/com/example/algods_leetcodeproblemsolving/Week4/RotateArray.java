package com.example.algods_leetcodeproblemsolving.Week4;

public class RotateArray {
    //Approach 1
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length;
        reverse (nums, 0, n-1);
        reverse (nums, 0, k-1);
        reverse (nums, k, n-1);
    }

    public void reverse (int [] nums, int start, int end) {
        while (start < end ){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        int [] array = new int [n];

        for (int i = 0; i < n; i++) {
            array[(i + k)%n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = array[i];
        }
    }
}
