package sorting._088_Merge_Sorted_Array;

public class MergeSortedArray {


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[m + n - 1] = nums1[m - 1];
                m--;
            } else {
                nums1[m + n - 1] = nums2[n - 1];
                n--;
            }
        }

        // if the first array is empty... Leetcode wont accept nums1=nums2
        for(int i = 0; i < n; i++){
            nums1[i] = nums2[i];
        }
        System.out.println("hello");
    }


    public static void main(String[] args) {
        int[] input = {0};
        int[] input2 = {1};
        merge(input, 0, input2, 1);

    }
}