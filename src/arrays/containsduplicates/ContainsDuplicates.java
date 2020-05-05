package arrays.containsduplicates;

import java.util.HashSet;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 *
 * Example 1:
 * Input: [1,2,3,1]
 * Output: true
 *
 * Example 2:
 * Input: [1,2,3,4]
 * Output: false
 *
 * Example 3:
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> setOfInts = new HashSet<>();
        for(int number: nums){
            if(setOfInts.contains(number)) return true;
            setOfInts.add(number);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,1};
        System.out.println(containsDuplicate(input));
    }
}
