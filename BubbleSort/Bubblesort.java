package BubbleSort;

import java.util.Arrays;
// import java.util.Scanner;

public class Bubblesort {

    public static String BubbleSort() {
        int[] a = { 6, 4, 8, 9, 1 };
        int n = a.length;

        boolean Swapped;

        do {
            Swapped = false;

            for (int j = 1; j < n; j++) {

                if (a[j - 1] < a[j]) {

                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;

                    Swapped = true;

                }
                n--;
            }

        } while (Swapped);
        return Arrays.toString(a);
    }

    public static void main(String[] args) {
        System.out.println(BubbleSort());

    }

}