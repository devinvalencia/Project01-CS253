public class SelectionSort {
    public static int exCount = 0;
    public static int compCount = 0;

   static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;


            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                    exCount++;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            compCount++;
        }
    }

    public static void report() {
        System.out.println("Number of Comparisons: " + compCount);
        System.out.println("Number of Exchanges: " + exCount);
    }

}
