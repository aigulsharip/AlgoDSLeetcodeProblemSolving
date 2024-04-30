package com.example.algods_leetcodeproblemsolving.Week4;

import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int balance = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                balance -= 1;
            } else {
                balance += 1;
            }
            if (map.containsKey(balance)) {
                maxLength = Math.max(maxLength, i - map.get(balance));
            }
            else {
                map.put(balance, i);
            }
        }
        return maxLength;
    }
}
