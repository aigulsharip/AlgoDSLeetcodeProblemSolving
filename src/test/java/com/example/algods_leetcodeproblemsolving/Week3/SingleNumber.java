package com.example.algods_leetcodeproblemsolving.Week3;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int singleNumber = 0;

        for (int i: nums) {
            singleNumber = i ^singleNumber;
        }
        return singleNumber;
    }
}
