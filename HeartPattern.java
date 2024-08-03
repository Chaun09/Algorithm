import java.util.Scanner;

public class HeartPattern {
    public static void main(String[] args) {
        int n = 4; // Chiều cao của trái tim

        // Vẽ phần trên của trái tim
        for (int i = 2; i <= n; i += 2) {
            // In khoảng trắng bên trái
            for (int j = 0; j <= n - i; j += 2) {
                System.out.print("  ");
            }

            // In dấu *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // In khoảng trắng ở giữa
            for (int j = 0; j <= (n - i); j++) {
                System.out.print("  ");
            }

            // In dấu *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Vẽ phần dưới của trái tim
        for (int i = n; i >= 0; i--) {
            // In khoảng trắng bên trái
            for (int j = i - 2; j < n; j++) {
                System.out.print("  ");
            }

            // In dấu *
            for (int j = 2; j <= (i * 2); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}