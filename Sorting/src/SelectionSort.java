import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] tab = new int[20];

        //Generates random numbers
        Random random = new Random();

        //Fills the array with random values
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(500);
        }

        //Unsorted
        System.out.println(Arrays.toString(tab));
        //Sorting the tab
        selectionSort(tab);
        //After sorting
        System.out.println(Arrays.toString(tab));
    }

    private static void selectionSort(int[] tab) {
        int length = tab.length;
        for (int i = 0; i < length - 1; i++) {
            //Initializes the min value and its index
            int minNumber = tab[i];
            int minNumberIndex = i;

            //Reads the array and looks for values less than the min value that we initialized
            for (int j = i + 1; j < length; j++) {
                if (tab[j] < minNumber) {
                    minNumber = tab[j];
                    minNumberIndex = j;
                }
            }

            swapValues(tab, i, minNumberIndex);
        }
    }

    //swaps two given elements in an array
    private static void swapValues(int[] tab, int a, int b) {
        int tmp = tab[a];
        tab[a] = tab[b];
        tab[b] = tmp;
    }
}