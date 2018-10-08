class BubbleSort {
    public static int exCount = 0;
    public static int compCount = 0;

    static void sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                compCount++;
                if (arr[j] > arr[j + 1]) {
                    exCount++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                }
            }
        }
        public static void report() {
            System.out.println("Number of Comparisons: " + compCount);
            System.out.println("Number of Exchanges: " + exCount);
            exCount = 0;
            compCount = 0;
        }



}
