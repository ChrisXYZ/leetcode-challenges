package Strings.reverseinteger;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 *
 * Example 2:
 *
 * Input: -123
 * Output: -321
 *
 * Example 3:
 *
 * Input: 120
 * Output: 21
 *
 * Note:
 * Assume we are dealing with an environment which could only store integers within the
 * 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume
 * that your function returns 0 when the reversed integer overflows.
 **/
public class ReverseInteger {

    private static int reverse(int x) {

        String s = String.valueOf(x);
        StringBuilder output = new StringBuilder();
        String negative = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '-') {
                negative = "-";
            } else {
                output.append(s.charAt(i));
            }
        }
        try {
            return Integer.parseInt(negative + output);
        } catch (NumberFormatException nfe) {
            return 0;
        }
    }

    public static void main(String[] args) {
        reverse(2147483647);
    }
}



// CAN BE OPTIMISED