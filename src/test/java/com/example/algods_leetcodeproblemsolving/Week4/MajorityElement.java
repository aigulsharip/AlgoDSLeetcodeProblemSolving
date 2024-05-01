package com.example.algods_leetcodeproblemsolving.Week4;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length /2;
        for (int num: nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            if (value > n) {
                return key;
            }
        }
        // Second approach for HashMap iteration
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() > n) {
        //         return entry.getKey();
        //     }
        // }
        return -1;

    }
}
