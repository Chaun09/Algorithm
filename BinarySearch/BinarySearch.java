package BinarySearch;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhap tong to phan tu cua day:");
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Nhap tung phan tu cua day:");
                a[i] = scanner.nextInt();
                int left = 0;
                int right = n - 1;
                int mid = (left + right) / 2;
                System.out.print("Nhap so can phai tim:");
                int x = scanner.nextInt();
                if (a[mid] == x) {
                    System.out.println("So can phai tim o vi tri" + mid);

                }
            }
            System.out.println(Arrays.toString(a));

        } catch (InputMismatchException e) {
            System.out.println("Phan tu da nhap kp so");

        }
    }

}
