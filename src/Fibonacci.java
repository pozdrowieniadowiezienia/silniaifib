public class Fibonacci {

    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;
        for (int i=2; i<n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
    }

}
