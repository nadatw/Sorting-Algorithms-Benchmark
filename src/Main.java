//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int n = 100000;
        Random rand = new Random();

        int[][] data = new int[4][n];

        for (int i = 0; i < n; i++) {
            data[0][i] = rand.nextInt(n);
            data[1][i] = n - i;
            data[2][i] = i;
            data[3][i] = i;
        }

        // Partially sorted (80%)
        for (int i = 0; i < n; i += 5) {
            int j = rand.nextInt(n / 5) * 5;

            int temp = data[2][i];
            data[2][i] = data[2][j];
            data[2][j] = temp;
        }

        String[] names = {
                "Selection Sort",
                "Insertion Sort",
                "Bubble Sort",
                "Merge Sort",
                "Quick Sort"
        };

        System.out.printf("%-18s %12s %12s %12s %12s%n",
                "Algorithm", "Random", "Reverse", "Partial", "Sorted");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-18s", names[i]);

            for (int j = 0; j < 4; j++) {

                int[] arr = Arrays.copyOf(data[j], n);

                long start = System.nanoTime();

                switch (i) {
                    case 0:
                        SortingAlgorithms.selectionSort(arr);
                        break;
                    case 1:
                        SortingAlgorithms.insertionSort(arr);
                        break;
                    case 2:
                        SortingAlgorithms.bubbleSort(arr);
                        break;
                    case 3:
                        SortingAlgorithms.mergeSort(arr, 0, n - 1);
                        break;
                    case 4:
                        SortingAlgorithms.quickSort(arr, 0, n - 1);
                        break;
                }

                long end = System.nanoTime();
                long time = (end - start) / 1000;

                System.out.printf("%12d", time);
            }

            System.out.println();
        }
    }
}