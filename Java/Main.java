package Java;

// folder chứa các class
// import java.util.Arrays;//thêm thư viện 
// import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		// public : phạm vi truy cập
		// Static: phương thức tĩnh
		// Void: 0 trả về tham số
		// main: tên hàm
		// String[] args: tham số truyền vào

		int arr[] = { 6, 7, 8, 5 };
		int x = 5;
		int n = arr.length;
		if (n == 0) {
			Ketqua kq = new Ketqua(false, "Dãy rỗng", 0);
			System.out.println(kq.Export());
		} else {
			for (int i = 0; i < n; i++) {
				if (x == arr[i]) {
					Ketqua kq = new Ketqua(true, "Vị trí của số trong dãy cần tìm là:", i);
					System.out.println(kq.Export());

				}

			}

		}
		Ketqua kq = new Ketqua(true, "Ko có số nào được tìm thấy", 0);
		System.out.println(kq.Export());

	}

}

// int[] arrr= new int[5];
// int a = 3;
// System.out.println(a);
// double b = 3.1415;
// float k = 3.124124124;
// System.out.println(b);
// boolean c = true;
// char d = 'r';
// System.out.println(d);
// String s = "thang beo";
// System.out.println(s.length());
// int e[] = {1, 2, 3};
// System.out.println(Arrays.toString(e));
// for (int i = 0; i < e.length; i++) {

// if(e[i] > 2)
// System.out.print(e[i] );
// }

// ConNguoi conNguoi = new ConNguoi(1.5, "Thang", 120);
// System.out.println(conNguoi.export());
// String name = "Nguyễn Minh Châu";
// System.out.println(name);