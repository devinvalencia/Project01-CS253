public class Factorial {
    public static int factorial(int x) {
        if (x == 0) {
            return 1;
        }
        int results = x * factorial(x-1);
        return results;
    }
}
