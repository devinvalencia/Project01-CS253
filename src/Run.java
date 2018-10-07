import java.io.File;
import java.util.*;

public class Run {
    public static int i;
    public static int selection = 0;
    public static int Size = 0;
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        while (selection != 9) {
            System.out.println("\nWhich program would you like to run?");
            System.out.println("-------PART 1--------");
            System.out.println("[1] Bubble Sort \n[2] Insertion Sort \n[3] Selection Sort \n[4] Shell Short \n[5] Merge Short");
            System.out.println("\n-------PART 2--------");
            System.out.println("[6] Factorial \n[7] Fibonacci \n[8] Recursive Binary Search \n\n[9] Exit\n");
            selection = userinput.nextInt();

            if (selection == 1) { /* Bubble Sort */
                System.out.println("Which data set would you like to test?");
                System.out.println("\n[1] Best Case ...1 to 10 \n[2] Worst Case ...1 to 10 \n[3] Average Case ...1 to 10");
                System.out.println("\n[4] Best Case ...1 to 2,000 \n[5] Worst Case ...1 to 2,000 \n[6] Average Case ...1 to 2,000");
                int caseSelect = userinput.nextInt();

                if (caseSelect == 1) {
                    Size = 0;
                    File Select = new File("src\\BestCase.txt");
                    ReadFile.work(Select, Size);
                } else if (caseSelect == 2) {
                    Size = 0;
                    File Select = new File("src\\WorstCase.txt");
                    ReadFile.work(Select, Size);
                } else if (caseSelect == 3) {
                    Size = 0;
                    File Select = new File("src\\AvgCase1.txt");
                    ReadFile.work(Select, Size);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase2.txt");
                    ReadFile.work(Select, Size);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase3.txt");
                    ReadFile.work(Select, Size);
                } else if (caseSelect == 4) {
                    Size = 1;
                    File Select = new File("src\\BestCaseL.txt");
                    ReadFile.work(Select, Size);
                } else if (caseSelect == 5) {
                    Size = 1;
                    File Select = new File("src\\WorstCaseL.txt");
                    ReadFile.work(Select, Size);
                } else if (caseSelect == 6) {
                    Size = 1;
                    File Select = new File("src\\AvgCase1L.txt");
                    ReadFile.work(Select, Size);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase2L.txt");
                    ReadFile.work(Select, Size);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase3L.txt");
                    ReadFile.work(Select, Size);
                }
            }

            if (selection == 2) { /* Insertion Sort */
                System.out.println("Which data set would you like to test?");
                System.out.println("\n[1] Best Case ...1 to 10 \n[2] Worst Case ...1 to 10 \n[3] Average Case ...1 to 10");
                System.out.println("\n[4] Best Case ...1 to 2,000 \n[5] Worst Case ...1 to 2,000 \n[6] Average Case ...1 to 2,000");
                int caseSelect = userinput.nextInt();

                if (caseSelect == 1) {
                    Size = 0;
                    File Select = new File("src\\BestCase.txt");
                    ReadFile.work(Select, Size);
                } else if (caseSelect == 2) {
                    Size = 0;
                    File Select = new File("src\\WorstCase.txt");
                    ReadFile.work(Select, Size);
                } else if (caseSelect == 3) {
                    Size = 0;
                    File Select = new File("src\\AvgCase1.txt");
                    ReadFile.work(Select, Size);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase2.txt");
                    ReadFile.work(Select, Size);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase3.txt");
                    ReadFile.work(Select, Size);
                } else if (caseSelect == 4) {
                    Size = 1;
                    File Select = new File("src\\BestCaseL.txt");
                    ReadFile.work(Select, Size);
                } else if (caseSelect == 5) {
                    Size = 1;
                    File Select = new File("src\\WorstCaseL.txt");
                    ReadFile.work(Select, Size);
                } else if (caseSelect == 6) {
                    Size = 1;
                    File Select = new File("src\\AvgCase1L.txt");
                    ReadFile.work(Select, Size);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase2L.txt");
                    ReadFile.work(Select, Size);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase3L.txt");
                    ReadFile.work(Select, Size);
                }
            }

            if (selection == 3) { /* Selection Sort */
                System.out.println("Which data set would you like to test?");
                System.out.println("\n[1] Best Case ...1 to 10 \n[2] Worst Case ...1 to 10 \n[3] Average Case ...1 to 10");
                System.out.println("\n[4] Best Case ...1 to 2,000 \n[5] Worst Case ...1 to 2,000 \n[6] Average Case ...1 to 2,000");
                int caseSelect = userinput.nextInt();

                if (caseSelect == 1) {
                    Size = 0;
                    File Select = new File("src\\BestCase.txt");
                    ReadFile.work(Select, Size);
                } else if (caseSelect == 2) {
                    Size = 0;
                    File Select = new File("src\\WorstCase.txt");
                    ReadFile.work(Select, Size);
                } else if (caseSelect == 3) {
                    Size = 0;
                    File Select = new File("src\\AvgCase1.txt");
                    ReadFile.work(Select, Size);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase2.txt");
                    ReadFile.work(Select, Size);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase3.txt");
                    ReadFile.work(Select, Size);
                } else if (caseSelect == 4) {
                    Size = 1;
                    File Select = new File("src\\BestCaseL.txt");
                    ReadFile.work(Select, Size);
                } else if (caseSelect == 5) {
                    Size = 1;
                    File Select = new File("src\\WorstCaseL.txt");
                    ReadFile.work(Select, Size);
                } else if (caseSelect == 6) {
                    Size = 1;
                    File Select = new File("src\\AvgCase1L.txt");
                    ReadFile.work(Select, Size);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase2L.txt");
                    ReadFile.work(Select, Size);
                    System.out.println("\n");
                    Select = new File("src\\AvgCase3L.txt");
                    ReadFile.work(Select, Size);
                }
            }

                if (selection == 4) { /* Shell Sort */
                    System.out.println("Which data set would you like to test?");
                    System.out.println("\n[1] Best Case ...1 to 10 \n[2] Worst Case ...1 to 10 \n[3] Average Case ...1 to 10");
                    System.out.println("\n[4] Best Case ...1 to 2,000 \n[5] Worst Case ...1 to 2,000 \n[6] Average Case ...1 to 2,000");
                    int caseSelect = userinput.nextInt();

                    if (caseSelect == 1) {
                        Size = 0;
                        File Select = new File("src\\BestCase.txt");
                        ReadFile.work(Select, Size);
                    } else if (caseSelect == 2) {
                        Size = 0;
                        File Select = new File("src\\WorstCase.txt");
                        ReadFile.work(Select, Size);
                    } else if (caseSelect == 3) {
                        Size = 0;
                        File Select = new File("src\\AvgCase1.txt");
                        ReadFile.work(Select, Size);
                        System.out.println("\n");
                        Select = new File("src\\AvgCase2.txt");
                        ReadFile.work(Select, Size);
                        System.out.println("\n");
                        Select = new File("src\\AvgCase3.txt");
                        ReadFile.work(Select, Size);
                    } else if (caseSelect == 4) {
                        Size = 1;
                        File Select = new File("src\\BestCaseL.txt");
                        ReadFile.work(Select, Size);
                    } else if (caseSelect == 5) {
                        Size = 1;
                        File Select = new File("src\\WorstCaseL.txt");
                        ReadFile.work(Select, Size);
                    } else if (caseSelect == 6) {
                        Size = 1;
                        File Select = new File("src\\AvgCase1L.txt");
                        ReadFile.work(Select, Size);
                        System.out.println("\n");
                        Select = new File("src\\AvgCase2L.txt");
                        ReadFile.work(Select, Size);
                        System.out.println("\n");
                        Select = new File("src\\AvgCase3L.txt");
                        ReadFile.work(Select, Size);
                    }
                }

                    if (selection == 5) { /* Merge Sort */
                        System.out.println("Which data set would you like to test?");
                        System.out.println("\n[1] Best Case ...1 to 10 \n[2] Worst Case ...1 to 10 \n[3] Average Case ...1 to 10");
                        System.out.println("\n[4] Best Case ...1 to 2,000 \n[5] Worst Case ...1 to 2,000 \n[6] Average Case ...1 to 2,000");
                        int caseSelect = userinput.nextInt();

                        if (caseSelect == 1) {
                            Size = 0;
                            File Select = new File("src\\BestCase.txt");
                            ReadFile.work(Select, Size);
                        } else if (caseSelect == 2) {
                            Size = 0;
                            File Select = new File("src\\WorstCase.txt");
                            ReadFile.work(Select, Size);
                        } else if (caseSelect == 3) {
                            Size = 0;
                            File Select = new File("src\\AvgCase1.txt");
                            ReadFile.work(Select, Size);
                            System.out.println("\n");
                            Select = new File("src\\AvgCase2.txt");
                            ReadFile.work(Select, Size);
                            System.out.println("\n");
                            Select = new File("src\\AvgCase3.txt");
                            ReadFile.work(Select, Size);
                        } else if (caseSelect == 4) {
                            Size = 1;
                            File Select = new File("src\\BestCaseL.txt");
                            ReadFile.work(Select, Size);
                        } else if (caseSelect == 5) {
                            Size = 1;
                            File Select = new File("src\\WorstCaseL.txt");
                            ReadFile.work(Select, Size);
                        } else if (caseSelect == 6) {
                            Size = 1;
                            File Select = new File("src\\AvgCase1L.txt");
                            ReadFile.work(Select, Size);
                            System.out.println("\n");
                            Select = new File("src\\AvgCase2L.txt");
                            ReadFile.work(Select, Size);
                            System.out.println("\n");
                            Select = new File("src\\AvgCase3L.txt");
                            ReadFile.work(Select, Size);
                        }


                    if (selection == 6) {
                        System.out.println("Please enter a number...");
                        int UserNum = userinput.nextInt();
                        int Ans = Factorial.factorial(UserNum);
                        System.out.println("The Factorial of " + UserNum + " is " + Ans);
                    }

                    if (selection == 7) {
                        System.out.println("Please enter a number...");
                        int UserNum = userinput.nextInt();
                        int Ans = Fibonacci.fib(UserNum);
                        System.out.println(Ans);
                    }

                    if (selection == 8) {
                        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                        System.out.println("Please enter the number you are searching for (Between 1 & 10) ...");
                        int Ans = userinput.nextInt();
                        int index = RecursiveBinarySearch.recursiveBinarySearch(list, 0, list.length, Ans);
                        System.out.println("The number " + Ans + " is at index " + index);
                    }

                }
            }

        }
    public static int returnSelect() {
        return selection;
    }

}

