import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {
    public static void work(File n,int Size) {
        int[] temp1 = new int[10];

        if (Size == 1) {
            temp1 = new int[2000];
        }

        int i = 0;

        try {
            Scanner getTxt1 = new Scanner(n);
            while (getTxt1.hasNextInt()) {
                temp1[i++] = getTxt1.nextInt();
            }
            getTxt1.close();

        } catch (Exception e) {
            System.out.println("File Not Found");
        }

        int x = Run.returnSelect();

        if (x == 1) {
            int[] temp = Arrays.copyOf(temp1, temp1.length);
            System.out.println(Arrays.toString(temp));
            BubbleSort.sort(temp);
            System.out.println(Arrays.toString(temp));
        }
        else if (x == 2) {
            int[] temp = Arrays.copyOf(temp1, temp1.length);
            System.out.println(Arrays.toString(temp));
            InsertionSort.sort(temp);
            System.out.println(Arrays.toString(temp));
        }
        else if (x == 3) {
            int[] temp = Arrays.copyOf(temp1, temp1.length);
            System.out.println(Arrays.toString(temp));
            SelectionSort.sort(temp);
            System.out.println(Arrays.toString(temp));
        }
        else if ( x== 4) {
            int[] temp = Arrays.copyOf(temp1, temp1.length);
            System.out.println(Arrays.toString(temp));
            ShellSort.sort(temp);
            System.out.println(Arrays.toString(temp));
        }
        else if (x == 5) {
            int[] temp = Arrays.copyOf(temp1, temp1.length);
            System.out.println(Arrays.toString(temp));
            MergeSort.sort(temp, 0, temp.length-1);
            System.out.println(Arrays.toString(temp));
        }

    }
}
