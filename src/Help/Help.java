package Help;

import java.util.Random;

public class Help {

    public static int[] perm(int n) {
        // creating array with numbers from 1 to max
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        // shuffling the array
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int j = rand.nextInt(n);
            swap(array, i, j);
        }
        return array;
    }

    public static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
