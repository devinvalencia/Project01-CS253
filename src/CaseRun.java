import java.io.*;
import java.util.*;

public class CaseRun {
    public static int i;

    public static int[] Worst() {
        File f = new File("src\\WorstCase.txt");
        int[] temp = new int[10];
        try {
            Scanner getTxt = new Scanner(f);
            while (getTxt.hasNextInt()) {
                temp[i++] = getTxt.nextInt();
            }
            getTxt.close();
            System.out.println("FILE FOUND");
        } catch (Exception e) {
            System.out.println("File Not Found");
        }
        return temp;
    }

    public static int[] Best() {
        File f = new File("src\\BestCase.txt");
        int[] temp = new int[10];
        try {
            Scanner getTxt = new Scanner(f);
            while (getTxt.hasNextInt()) {
                temp[i++] = getTxt.nextInt();
            }
            getTxt.close();
            System.out.println("FILE FOUND");
        } catch (Exception e) {
            System.out.println("File Not Found");
        }
        return temp;
    }

    public static int[] Avg() {
        File f = new File("src\\WorstCase.txt");
        int[] temp = new int[10];
        try {
            Scanner getTxt = new Scanner(f);
            while (getTxt.hasNextInt()) {
                temp[i++] = getTxt.nextInt();
            }
            getTxt.close();
            System.out.println("FILE FOUND");
        } catch (Exception e) {
            System.out.println("File Not Found");
        }
        return temp;
    }

}