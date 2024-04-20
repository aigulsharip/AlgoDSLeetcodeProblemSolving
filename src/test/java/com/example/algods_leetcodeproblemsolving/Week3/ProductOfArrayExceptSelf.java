package com.example.algods_leetcodeproblemsolving.Week3;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] left = new int [n];
        int [] right = new int [n];
        int [] ans = new int [n];

        left [0] = 1;
        for (int i = 1; i < n; i++ ) {
            left[i] = left[i-1] * nums[i-1];
        }
        right[n-1] = 1;
        for (int i = n-2; i >= 0; i-- ) {
            right [i] = right [i+1] * nums[i+1];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;

    }


    /*
    // Prefix/Suffix approach
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] prefixMul = new int [n];
        int [] suffixMul = new int [n];
        int [] res = new int [n];

        for (int i = 0; i < n; i++) {
            prefixMul[i] = 1;
            suffixMul[i] = 1;
        }

        prefixMul[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixMul[i] = prefixMul[i-1] * nums[i];
        }

        suffixMul [n-1] = nums[n-1];
        for (int i = n-2; i> 0; i--) {
            suffixMul[i] = suffixMul[i+1] * nums[i];
        }

        res[0] = suffixMul [1];
        res [n-1] = prefixMul[n-2];

        for (int i = 1; i < n-1; i++) {
            res[i] = prefixMul[i-1] * suffixMul[i+1];
        }
        return res;
    }
    */
}
