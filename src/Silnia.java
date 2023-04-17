public class Silnia {

    public static int silniaIterative(int n) {
        int result = 1;
        for (int i = 1; i<=n; i++) {
            result*=i;
        }
        return result;
    }

    public static int silniaRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n*silniaRecursive(n-1);
    }
}