public class InsertionSort {
    public static int exCount = 0;
    public static int compCount = 0;

    static void sort(int arr[]) {
        int n = arr.length;
        for (int i=1; i<n; ++i) {
            int key = arr[i];
            int j = i-1;




            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
                compCount++;
                exCount++;
            }
            arr[j+1] = key;
        }
    }

    public static void report() {
        System.out.println("Number of Comparisons: " + compCount);
        System.out.println("Number of Exchanges: " + exCount);
        exCount = 0;
        compCount = 0;
    }

}
