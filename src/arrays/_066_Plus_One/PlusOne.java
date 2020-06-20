package arrays._066_Plus_One;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] output = new int[digits.length + 1];
        output[0] = 1;
        return output;
    }

    public static void main(String[] args) {
        int[] input = {1,2,4,7,0};
        PlusOne PlusOne = new PlusOne();
        PlusOne.plusOne(input);
    }
}