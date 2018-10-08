public class ShellSort {
    public static int exCount = 0;
    public static int compCount = 0;

    public static int sort(int arr[]) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i += 1) {
                compCount++;
                int temp = arr[i];
                int j;

                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                    exCount++;
                }

                arr[j] = temp;
            }
        }
        return 0;
    }

    public static void report() {
        System.out.println("Number of Comparisons: " + compCount);
        System.out.println("Number of Exchanges: " + exCount);
        exCount = 0;
        compCount = 0;
    }
}
