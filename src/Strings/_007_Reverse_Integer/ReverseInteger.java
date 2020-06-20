package Strings._007_Reverse_Integer;

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