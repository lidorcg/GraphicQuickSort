package QuickSort;

import GUI.MainWindow;

import static Help.Help.swap;

public class MyQuickSort {

    private static int[] A;
    private static MainWindow g;

    public MyQuickSort(int[] A, MainWindow g) {
        MyQuickSort.A = A;
        MyQuickSort.g = g;
    }

    private static int partition(int[] A, int lo, int hi) {
        int p = A[hi];
        int i = lo;
        int j = hi;
        g.Draw(A, lo, hi, i, j, p);
        while (i < j) {
            while (A[i] < p && i < j) {
                i++;
            }
            g.Draw(A, lo, hi, i, j, p);
            while (A[j] >= p && i < j) {
                j--;
            }
            g.Draw(A, lo, hi, i, j, p);
            swap(A, i, j);
            g.Draw(A, lo, hi, j, i, p);
        }
        g.Draw(A, lo, hi, i, j, p);
        swap(A, hi, j);
        g.Draw(A, lo, hi, i, hi, p);
        return j;
    }

    public void sort() {
        QuickSort(A, 0, A.length - 1);
    }

    private void QuickSort(int[] A, int lo, int hi) {
        if (lo < hi) {
            int p = partition(A, lo, hi);
            QuickSort(A, lo, p - 1);
            QuickSort(A, p + 1, hi);
        }
    }
}