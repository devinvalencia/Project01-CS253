import java.io.*;
import java.util.*;

public class InRead {
    public static int[] list = new int[10];
    public static int i;

    public static int[] reader() {
        try {
            Scanner getTxt = new Scanner(new File("C:\\Users\\devin\\Documents\\CS 253\\Project 01 - Devin Valencia - CS253\\src\\WorstCase.txt"));

            while (getTxt.hasNextInt()) {
                list[i++] = getTxt.nextInt();
            }

        } catch (Exception e) {
            System.out.println("File No Found");
        }
        return list;
    }

    public static void display() {
            System.out.println(Arrays.toString(list));
    }
}
