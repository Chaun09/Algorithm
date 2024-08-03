
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập các thông số từ người dùng
        System.out.print("Nhap chieu rong cua hinh dau cong: ");
        int ChieuRong = scanner.nextInt();
        System.out.print("Nhap chieu cao cua hinh dau cong: ");
        int ChieuCao = scanner.nextInt();
        System.out.print("Nhap chieu cao cua hinh thang: ");
        int ChieuCaoht = scanner.nextInt();
        System.out.print("Nhap chieu rong day tren: ");
        int CanhTren = scanner.nextInt();
        System.out.print("Nhap chieu rong day duoi: ");
        int CanhDay = scanner.nextInt();
        System.out.print("Nhap chieu rong cua hinh chu nhat: ");
        int ChieuRonghcn = scanner.nextInt();
        System.out.print("Nhap chieu cao cua hinh chu nhat: ");
        int ChieuCaohcn = scanner.nextInt();

        // Vẽ hình chữ nhật khuyết 4 góc
        for (int i = 0; i < ChieuCao; i++) {
            for (int j = 0; j < ChieuRong; j++) {
                // Kiểm tra và in ký tự @ cho mắt ở hàng thứ hai (i == 1)
                // Các mắt ở hai bên của hàng thứ hai
                if (i == 1 && j == 0) {
                    System.out.print("      ");

                }
                if (i == 2 && j == 0) {
                    System.out.print("      ");
                }
                if (i == 3 && j == 0) {
                    System.out.print("      ");

                }

                if (i == 1 && (j == 1 || j == ChieuRong - 2)) {
                    System.out.print(" @ ");
                }
                // Kiểm tra và in ký tự ! cho miệng ở hàng thứ ba (i == 2)
                // Miệng ở giữa của hàng thứ ba
                else if (i == 3 && j == ChieuRong / 2) {
                    System.out.print(" ! ");
                }
                // Kiểm tra và in khoảng trắng ở các góc khuyết
                else if ((i == 0 && (j == 0 || j == ChieuRong - 1)) ||
                        (i == ChieuCao - 1 && (j == 0 || j == ChieuRong - 1))) {
                    System.out.print("         ");
                }
                // In dấu sao * cho phần còn lại
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        // // // Vẽ hình thang ngược
        for (int i = 0; i < ChieuCaoht; i++) {
            int padding = i;
            int currentChieuRong = CanhTren - 2 * i;
            currentChieuRong = Math.max(currentChieuRong, CanhDay);

            // In khoảng trắng để tạo độ thụt vào
            for (int j = 0; j < padding; j++) {
                System.out.print("   ");
            }

            // In dấu sao để vẽ phần chính của hình thang
            for (int j = 0; j < currentChieuRong; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // // Vẽ hình chữ nhật đầy đủ
        for (int i = 0; i < ChieuCaohcn; i++) {
            for (int j = 0; j < ChieuRonghcn; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("         ");

                }
                if (i == 1 && j == 0) {
                    System.out.print("         ");

                }
                if (i == 2 && j == 0) {
                    System.out.print("         ");

                }
                if (i == 3 && j == 0) {
                    System.out.print("         ");

                }

                System.out.print(" * ");
            }

            System.out.println();
        }

    }
}