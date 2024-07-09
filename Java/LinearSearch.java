package Java;

import java.util.Scanner;
import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {

        // int a[] = { 1, 2, 3 };
        // int n = a.length;
        // Scanner scanner = new Scanner(System.in);

        // for (int i = 0; i < n; i++) {
        // System.out.print("Nhap so:");
        // int x = scanner.nextInt();
        // if (x == a[n - 1]) {
        // System.out.print("Phan tu da nhap la phan tu cuoi");

        // }

        // }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tong so phan tu trong day:");
        int n = scanner.nextInt();
        if (n == 0) {
            Ketqua kq = new Ketqua(false, "Day ko co phan tu");
            System.out.println(kq.Export());

        } else {

            int[] arr = new int[n];
            System.out.print("Nhap so can phai tim trong day:");
            int x = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Nhap tung phan tu trong day:");
                arr[i] = scanner.nextInt();

                if (arr[i] == x) {
                    // System.out.println("So can tim o vi tri:" + i);
                    Ketqua kq = new Ketqua(true, "So can tim o vi tri " + i);
                    System.out.println(kq.Export());

                } else {
                    Ketqua kq = new Ketqua(false, "Khong phai so can tim");
                    System.out.println(kq.Export());
                }

            }

            System.out.println(Arrays.toString(arr));

        }

    }

}
