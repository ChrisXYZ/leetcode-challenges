package arrays._1295_Find_Numbers_with_Even_Number_of_Digits;

public class EvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int output = 0;
        for (int number : nums) {
            if (String.valueOf(number).length() % 2 == 0) output++;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input = {12, 345, 2, 6, 7892};
        System.out.println(findNumbers(input));
    }
}
