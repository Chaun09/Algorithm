package Java;

import java.util.Scanner;
import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tong so phan tu  trong day:");
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

                }

            }
            System.out.println(Arrays.toString(arr));
            Ketqua kq = new Ketqua(false, "Khong co so can tim");
            System.out.println(kq.Export());

            // System.out.println("Khong co so can tim");
        }
    }

}
