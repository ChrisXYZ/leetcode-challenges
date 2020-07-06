package math._1342_Number_of_Steps_to_Reduce_a_Number_to_Zero;

public class NumberOfStepsToReduceNumberToZero {
    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }
}
