package recursion._509_Fibonacci_Number;

public class FibonacciNumber {
    public static int fib(int N) {
        if (N <= 1) {
            return N;
        } else {
            return fib(N - 2) + fib(N - 1);
        }
    }
}