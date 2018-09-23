import java.io.*;
import java.util.*;

public class CaseRun {

    public static int i;
    public static int bool = 0;
    public static int[] list = new int[10];
    public static int[] originalList = Worst();

    public static int[] reader() {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Which Scenario would you like to test?");
        System.out.println("[B]est Case? \n[W]orst Case? \n[A]verage Case?");
        String caseSelect = userinput.nextLine();

        if (caseSelect.equalsIgnoreCase("B")) {
            try {
                Scanner getTxt = new Scanner(new File("src\\BestCase.txt"));
                while (getTxt.hasNextInt()) {
                    list[i++] = getTxt.nextInt();
                }
                getTxt.close();
            } catch (Exception e) {
                System.out.println("File No Found");
            }
            return list;
        }

        if (caseSelect.equalsIgnoreCase("W")) {
            System.out.println(Arrays.toString(originalList));
            return list;
        }

        if (caseSelect.equalsIgnoreCase("A")) {
            try {
                Scanner getTxt = new Scanner(new File("src\\AvgCase1.txt"));
                while (getTxt.hasNextInt()) {
                    list[i++] = getTxt.nextInt();
                }
                getTxt.close();
            } catch (IOException e) {
                System.out.println("File No Found");
            }
            bool = 1;
            return list;
        }

        else {
            return list;
        }
    }

    public static int onoff() {
        return bool;
    }

    public static int[] Avg2() {
        try {
            Scanner getTxt = new Scanner(new File("src\\AvgCase2.txt"));
            while (getTxt.hasNextInt()) {
                list[i++] = getTxt.nextInt();
            }
            getTxt.close();
        } catch (Exception e) {
            System.out.println("File No Found");
        }
        return list;
    }

    public static int[] Avg3() {
        try {
            Scanner getTxt = new Scanner(new File("src\\AvgCase3.txt"));
            while (getTxt.hasNextInt()) {
                list[i++] = getTxt.nextInt();
            }
            getTxt.close();
        } catch (Exception e) {
            System.out.println("File No Found");
        }
        return list;
    }

    private static int[] Worst() {
        try {
            Scanner getTxt = new Scanner(new File("src\\WorstCase.txt"));
            while (getTxt.hasNextInt()) {
                list[i++] = getTxt.nextInt();
            }
            getTxt.close();
        } catch (Exception e) {
            System.out.println("File No Found");
        }
        return list;
    }

}