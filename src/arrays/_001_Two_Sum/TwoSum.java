package arrays._001_Two_Sum;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum chris = new TwoSum();
        int[] input = {3, 2, 4};
        System.out.println(chris.twoSum(input, 6));
    }

    //ONE PASS HASHMAP - Does a backwards check on every loop
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        int required;
        for (int i = 0; i < nums.length; i++) {
            required = target - nums[i];
            if (pairs.containsKey(nums[i])) {
                return new int[]{i, pairs.get(nums[i])};
            }
            pairs.put(required, i);
        }
        return new int[]{0, 0};
    }
}

