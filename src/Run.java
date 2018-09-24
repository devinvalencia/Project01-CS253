import java.io.File;
import java.util.*;

public class Run {
    public static int i;
    public static int selection = 0;
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        while (selection != 7) {
            System.out.println("\nWhich program would you like to run?");
            System.out.println("-------PART 1--------");
            System.out.println("[1] Bubble Sort \n[2] Insertion Sort \n[3] Selection Sort");
            System.out.println("\n-------PART 2--------");
            System.out.println("[4] Factorial \n[5] Fibonacci \n[6] Recursive Binary Search \n\n[7] Exit\n");
            selection = userinput.nextInt();

            if (selection == 1) {
                System.out.println("Which Scenario would you like to test?");
                System.out.println("[B]est Case? \n[W]orst Case? \n[A]verage Case?");
                String caseSelect = userinput.next();

                if (caseSelect.equalsIgnoreCase("B")) {
                    File Select = new File("src\\BestCase.txt");
                    ReadFile.work(Select);
                }

                else if (caseSelect.equalsIgnoreCase("W")) {
                    File Select = new File("src\\WorstCase.txt");
                    ReadFile.work(Select);
                }

                else if (caseSelect.equalsIgnoreCase("A")) {
                    File Select = new File("src\\AvgCase1.txt");
                    ReadFile.work(Select);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase2.txt");
                    ReadFile.work(Select);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase3.txt");
                    ReadFile.work(Select);
                }
            }

            if (selection == 2) {
                System.out.println("Which Scenario would you like to test?");
                System.out.println("[B]est Case? \n[W]orst Case? \n[A]verage Case?");
                String caseSelect = userinput.next();

                if (caseSelect.equalsIgnoreCase("B")) {
                    File Select = new File("src\\BestCase.txt");
                    ReadFile.work(Select);
                }

                else if (caseSelect.equalsIgnoreCase("W")) {
                    File Select = new File("src\\WorstCase.txt");
                    ReadFile.work(Select);
                }

                else if (caseSelect.equalsIgnoreCase("A")) {
                    File Select = new File("src\\AvgCase1.txt");
                    ReadFile.work(Select);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase2.txt");
                    ReadFile.work(Select);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase3.txt");
                    ReadFile.work(Select);
                }
            }

            if (selection == 3) {
                System.out.println("Which Scenario would you like to test?");
                System.out.println("[B]est Case? \n[W]orst Case? \n[A]verage Case?");
                String caseSelect = userinput.next();

                if (caseSelect.equalsIgnoreCase("B")) {
                    File Select = new File("src\\BestCase.txt");
                    ReadFile.work(Select);
                }

                else if (caseSelect.equalsIgnoreCase("W")) {
                    File Select = new File("src\\WorstCase.txt");
                    ReadFile.work(Select);
                }

                else if (caseSelect.equalsIgnoreCase("A")) {
                    File Select = new File("src\\AvgCase1.txt");
                    ReadFile.work(Select);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase2.txt");
                    ReadFile.work(Select);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase3.txt");
                    ReadFile.work(Select);
                    }
                }
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
                int[] list = {1,2,3,4,5,6,7,8,9,10};
                System.out.println("Please enter the number you are searching for (Between 1 & 10) ...");
                int Ans = userinput.nextInt();
                int index = RecursiveBinarySearch.recursiveBinarySearch(list,0,list.length,Ans);
                System.out.println("The number " + Ans + " is at index " + index);
            }
        }

        public static int returnSelect() {
            return selection;
        }
}

