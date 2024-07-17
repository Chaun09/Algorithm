import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static String array() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tong so phan tu cua mang");
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap tung phan tu");
            a[i] = scanner.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.println("Mang sau khi da nhap" + a[i] * a[i]);

        }

        return Arrays.toString(a);

    }

    public static void main(String[] args) {
        System.out.println(array());

    }

}
