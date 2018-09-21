import java.util.*;

public class Run {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int selection = 0;

        while (selection != 7) {
            System.out.println("\nWhich program would you like to run?");
            System.out.println("\n-------PART 1--------");
            System.out.println("[1] Bubble Sort \n[2] Insertion Sort \n[3] Selection Sort");
            System.out.println("\n-------PART 2--------");
            System.out.println("[4] Factorial \n[5] Fibonacci \n[6] Recursive Binary Search \n\n[7] Exit\n");
            selection = userinput.nextInt();

            if (selection == 1) {
                /*
                Bubble Sort
                 */
            }

            if (selection == 2) {
                /*
                Insertion Sort
                 */
            }

            if (selection == 3) {
                /*
                Selection Sort
                 */
            }

            if (selection == 4) {
                System.out.println("Please enter a number...");
                int UserNum = userinput.nextInt();
                int Ans = Factorial.factorial(UserNum);
                System.out.println("The Factorial of " + UserNum + " is " + Ans);
            }

            if (selection == 5) {
                System.out.println("Please enter a number...");
                int UserNum = userinput.nextInt();
                int Ans = Fibonacci.fib(UserNum);
                System.out.println(Ans);
            }

            if (selection == 6) {
                int[] list = {9, 8, 1, 2, 6, 3, 4, 10, 5, 7};
                System.out.println("Please enter the number you are searching for (Between 1 & 10) ...");
                int Ans = userinput.nextInt();
                int index = RecursiveBinarySearch.recursiveBinarySearch(list,0,list.length,Ans);
                System.out.println("The number " + Ans + " is at index " + index);
            }

        }
    }
}
