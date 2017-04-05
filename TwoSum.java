package com.company.leetcode;

import java.util.HashMap;

/**
 * Given an array of integers,
 * return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * For Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * Created by chenkai on 2017/4/1.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return new int[]{-1, -1};
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (map.containsKey(target - x)) {
                return new int[]{map.get(target - x), i};
            }
            map.put(x, i);
        }
        return new int[]{-1, -1};
    }
}
