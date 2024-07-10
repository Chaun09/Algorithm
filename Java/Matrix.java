package Java;

import java.util.Scanner;
import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dien so n:");
        int n = scanner.nextInt();
        System.out.print("Dien so x:");
        int x = scanner.nextInt();
        int[][] a = new int[n][x];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("Dien tung phan tu:");
                a[i][j] = scanner.nextInt();

            }

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }

    }

}