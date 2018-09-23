import java.util.*;

public class Run {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int selection = 0;
        int arr[];

        while (selection != 7) {
            System.out.println("\nWhich program would you like to run?");
            System.out.println("-------PART 1--------");
            System.out.println("[1] Bubble Sort \n[2] Insertion Sort \n[3] Selection Sort");
            System.out.println("\n-------PART 2--------");
            System.out.println("[4] Factorial \n[5] Fibonacci \n[6] Recursive Binary Search \n\n[7] Exit\n");
            selection = userinput.nextInt();

            if (selection == 1) {
                arr = CaseRun.reader();
                BubbleSort.bubbleSort(arr);
                BubbleSort.printArray(arr);

                int rcvBool = CaseRun.bool;
                if (rcvBool == 1) {
                    arr = CaseRun.Avg2();
                    System.out.println(Arrays.toString(arr));
                    BubbleSort.bubbleSort(arr);
                    BubbleSort.printArray(arr);
                    Arrays.fill(arr,0);
                    arr = CaseRun.Avg3();
                    System.out.println(Arrays.toString(arr));
                    BubbleSort.bubbleSort(arr);
                    BubbleSort.printArray(arr);
                    Arrays.fill(arr,0);
                    rcvBool = 0;
                }
            }

            if (selection == 2) {
                arr = CaseRun.reader();
                InsertionSort.sort(arr);
                InsertionSort.printArray(arr);
                int rcvBool = CaseRun.bool;
                if (rcvBool == 1) {
                    arr = CaseRun.Avg2();
                    InsertionSort.sort(arr);
                    InsertionSort.printArray(arr);
                    arr = CaseRun.Avg3();
                    InsertionSort.sort(arr);
                    InsertionSort.printArray(arr);
                    rcvBool = 0;
                }
            }

            if (selection == 3) {
                arr = CaseRun.reader();
                SelectionSort.sort(arr);
                SelectionSort.printArray(arr);
                int rcvBool = CaseRun.bool;
                if (rcvBool == 1) {
                    arr = CaseRun.Avg2();
                    SelectionSort.sort(arr);
                    SelectionSort.printArray(arr);
                    arr = CaseRun.Avg3();
                    SelectionSort.sort(arr);
                    SelectionSort.printArray(arr);
                    rcvBool = 0;
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

        public static int[] ClearList(int[] arr) {
            for (int i=0; i < arr.length; i++) {
                arr[i++] = 0;
            }

            Arrays.fill(arr,0);
            return arr;
        }
    }

