package arrays._1480_Running_Sum_of_1d_Array;


public class RunningSumOfArray {
    public int[] runningSum(int[] nums) {
        int runningTotal = 0;

        for (int i = 0; i < nums.length; i++) {
            runningTotal = runningTotal + nums[i];
            nums[i] = runningTotal;
        }
        return nums;
    }

}
