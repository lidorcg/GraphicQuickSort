import GUI.MainWindow;
import QuickSort.MyQuickSort;

import java.util.Arrays;

import static Help.Help.perm;

public class Main {
    public static void main(String[] args) {
        int n = 50;

        // creating some permutation of n
        int[] A = perm(n);
        // creating a gui window
        MainWindow g = new MainWindow();

        System.out.println(Arrays.toString(A));
        g.Draw(A, 0, n, 0, 0, 0);
        new MyQuickSort(A, g).sort();
        System.out.println(Arrays.toString(A));
        g.Draw(A, 0, n, -1, -1, 0);
    }

}
