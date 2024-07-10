// quản lý,  tổ chức và nhóm các lớp (classes), giao diện (interfaces), và các kiểu dữ liệu khác 
package Java;

// gọi lớp scanner 
import java.util.Scanner;
// gọi lớp arrays
import java.util.Arrays;

// khai báo class LinearSearch với phạm vi: public
public class LinearSearch {

    // khởi tạo hàm main với phạm vi: public, trạng thái: static(tĩnh),void(ko trả
    // về), tên hàm: main và tham số truyền vào là String[] args
    public static void main(String[] args) {

        // tạo ra đối tượng lớp scanner để đọc dữ liệu đầu vào
        Scanner scanner = new Scanner(System.in);
        // in ra String trên terminal
        System.out.println("Nhap tong so phan tu trong day:");
        // nhập phần tử từ bàn phím
        int n = scanner.nextInt();
        // câu lệnh điều kiện để check dãy có số lượng phần tử = 0 hay không ?
        if (n == 0) {
            // tạo đối tượng có tên kq và truyền vào hai tham số (false, "Day ko co phan
            // tu")
            Ketqua kq = new Ketqua(false, "Day ko co phan tu");
            // In ketqua ra màn hình với cú pháp kq.Export() trong đó kq là tên đối tượng
            // vừa tạo và Export() là hàm tạo đã tạo bên class Ketqua
            System.out.println(kq.Export());

        } else {
            // int[] là khai báo kiểu dữ liệu cho biến arr, chỉ ra rằng arr là một mảng của
            // các số nguyên (int).
            // new int[n] tạo một mảng mới với kích thước n, nghĩa là mảng này có n phần tử.
            // Mỗi phần tử trong mảng này sẽ được khởi tạo với giá trị mặc định của kiểu
            // int, tức là 0.

            int[] arr = new int[n];
            // in ra String trên terminal
            System.out.print("Nhap so can phai tim trong day:");
            // nhập phần tử từ bàn phím
            int x = scanner.nextInt();
            // sử dụng vòng lặp for để vừa thực hiện nhập từng phần tử vào arr vừa tìm số
            // cần tìm trong arr

            for (int i = 0; i < n; i++) {
                // in ra String trên terminal
                System.out.print("Nhap tung phan tu trong day:");
                // nhập phần tử từ bàn phím
                arr[i] = scanner.nextInt();
                // sử dụng câu lệnh if để ktra từng phần tử có phải số cần tìm

                if (arr[i] == x) {

                    // tạo đối tượng có tên kq và truyền vào hai tham số (true, "So can tim o vi tri
                    // " + i")

                    Ketqua kq = new Ketqua(true, "So can tim o vi tri " + i);
                    // In ketqua ra màn hình với cú pháp kq.Export() trong đó kq là tên đối tượng
                    // vừa tạo và Export() là hàm tạo đã tạo bên class Ketqua
                    System.out.println(kq.Export());

                } else {
                    // tạo đối tượng có tên kq và truyền vào hai tham số (false, "ko co so can tim
                    // " + i")

                    Ketqua kq = new Ketqua(false, "Khong co so can tim");
                    // In ketqua ra màn hình với cú pháp kq.Export() trong đó kq là tên đối tượng
                    // vừa tạo và Export() là hàm tạo đã tạo bên class Ketqua
                    System.out.println(kq.Export());
                }

            }
            // in ra arr sau khi đã nhập toàn số lượng phần tử và từng phần tử vào arr

            System.out.println(Arrays.toString(arr));

        }

    }

}
