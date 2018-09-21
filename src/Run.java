import java.util.*;

public class Run {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Which method would you like to run?");
        System.out.println("[1] Factorial \n[2] Fibonacci \n[3] Recursive Binary Search \n[4] Exit");
        int selection = userinput.nextInt();

        if (selection == 1) {
            System.out.println("Please enter a number");
            int UserNum = userinput.nextInt();
            Factorial.factorial(UserNum);
        }
        if (selection == 2) {
            System.out.println("Please enter a number");
            int UserNum = userinput.nextInt();
            Fibonacci.fib(UserNum);
        }
        if (selection == 3) {
            /*
            RecursiveBinarySearch.recursiveBinarySearch();
             */
        }
    }
}
