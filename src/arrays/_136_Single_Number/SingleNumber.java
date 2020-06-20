package arrays._136_Single_Number;

import java.util.HashMap;

public class SingleNumber {
    private static int singleNumber(int[] nums) {
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
        System.out.println(singleNumber(intInput));
    }
}
