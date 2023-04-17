public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci:");
        fib(10);
        System.out.println();
        System.out.println("Silnia:");
        sil(5);
    }

    private static void fib(int n){
        long startIterative = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            Fibonacci.fibonacciIterative(n);
        }
        long timeIterative = System.nanoTime() - startIterative;

        long startRecursive = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            Fibonacci.fibonacciRecursive(n);
        }
        long timeRecursive = System.nanoTime() - startRecursive;

        System.out.printf("Iterative time: %d ns", timeIterative);
        System.out.println();
        System.out.printf("Recursive time: %d ns", timeRecursive);
    }

    private static void sil(int n){
        long startIterative = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            Silnia.silniaIterative(n);
        }
        long timeIterative = System.nanoTime() - startIterative;

        long startRecursive = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            Silnia.silniaRecursive(n);
        }
        long timeRecursive = System.nanoTime() - startRecursive;

        System.out.printf("Iterative time: %d ns", timeIterative);
        System.out.println();
        System.out.printf("Recursive time: %d ns", timeRecursive);
    }
}