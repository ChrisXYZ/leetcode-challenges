package math._412_Fizz_Buzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> output = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.add("FizzBuzz");
            } else if (i % 5 == 0) {
                output.add("Buzz");
            } else if (i % 3 == 0) {
                output.add("Fizz");
            } else {
                output.add(String.valueOf(i));
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(1));
    }
}
