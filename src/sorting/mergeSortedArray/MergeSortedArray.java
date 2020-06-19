package sorting.mergeSortedArray;

/**
 * Merge Sorted Array
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * <p>
 * Example:
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * Output: [1,2,2,3,5,6]
 */

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