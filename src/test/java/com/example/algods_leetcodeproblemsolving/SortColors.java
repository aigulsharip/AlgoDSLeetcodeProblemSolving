package com.example.algods_leetcodeproblemsolving;

public class SortColors {

    public void sortColors(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n -1;
        int curr = 0;

        while (curr <= end) {
            if (nums[curr] == 0) {
                swap(nums, curr,start);
                start++;
                curr++;
            }
            else if (nums[curr] == 2) {
                swap(nums, curr,end);
                end--;

            }
            else {
                curr++;
            }
        }
    }

    public void swap (int [] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}
