package com.example.algods_leetcodeproblemsolving.Week4;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;

        for (int num: nums) {
            currSum = Math.max(currSum + num, num);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    /*
    // Brute Force
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];

        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += nums[j];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }
    */
}
