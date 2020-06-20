package arrays._217_Contains_Duplicates;

import java.util.HashSet;

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
