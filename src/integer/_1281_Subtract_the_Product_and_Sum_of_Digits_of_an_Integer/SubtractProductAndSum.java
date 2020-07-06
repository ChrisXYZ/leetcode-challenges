package integer._1281_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer;

public class SubtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        String number = String.valueOf(n);
        int[] allNumbers = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            allNumbers[i] = (int) number.charAt(i) - '0';
        }

        int product = 1;
        int sum = 0;
        for (int singleNumber : allNumbers) {
            product *= singleNumber;
            sum += singleNumber;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        subtractProductAndSum(4421);
    }
}