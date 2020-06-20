package arrays._026_Remove_Duplicates_from_Sorted_Array;

public class RemoveDuplicates {


    private static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] input = {1,2,2};
        System.out.println(removeDuplicates(input));

    }
}
