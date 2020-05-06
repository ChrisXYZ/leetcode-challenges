package arrays.singlenumber;

import java.util.HashMap;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 * Input: [2,2,1]
 * Output: 1
 *
 * Example 2:
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> countOccurrences = new HashMap<>();
        for (int number : nums) {
            if (countOccurrences.containsKey(number)) {
                countOccurrences.put(number, countOccurrences.get(number) + 1);
            } else {
                countOccurrences.put(number, 1);
            }
        }

        for (int key : countOccurrences.keySet()) {
            if (countOccurrences.get(key) == 1) {
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] intInput = {4, 1, 2, 1, 2};
        singleNumber(intInput);
    }
}
