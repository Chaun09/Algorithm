package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// import java.util.Arrays;

public class CuaHangXangGanNhat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<CuaHangXang> danhSachCuaHangXang = new ArrayList<>();
        danhSachCuaHangXang.add(new CuaHangXang(14, "A", List.of(95)));
        danhSachCuaHangXang.add(new CuaHangXang(95, "B", List.of(95)));
        danhSachCuaHangXang.add(new CuaHangXang(80, "R", List.of(95, 92)));
        danhSachCuaHangXang.add(new CuaHangXang(53, "D", List.of(95, 92)));
        danhSachCuaHangXang.add(new CuaHangXang(22, "N", List.of(95)));
        danhSachCuaHangXang.add(new CuaHangXang(15, "Q", List.of(95, 92)));
        danhSachCuaHangXang.add(new CuaHangXang(11, "T", List.of(92)));
        danhSachCuaHangXang.add(new CuaHangXang(2, "U", List.of(95)));
        danhSachCuaHangXang.add(new CuaHangXang(8, "P", List.of(95)));
        danhSachCuaHangXang.add(new CuaHangXang(43, "ZR", List.of(92)));
        danhSachCuaHangXang.add(new CuaHangXang(70, "MX", List.of(92)));

        // for (CuaHangXang cuaHang : danhSachCuaHangXang) {
        // System.out.print(cuaHang);
        // }

        if (danhSachCuaHangXang.size() == 0) {
            System.out.println("Danh sach ko co cay xang nao");

        } else {
            System.out.println("Type:");
            int loaiXangYeuCau = sc.nextInt();
            System.out.println("Location:");
            int location = sc.nextInt();

            List<CuaHangXang> cuaHangCungLoaiXang = timCuaHangCungLoaiXang(loaiXangYeuCau, danhSachCuaHangXang);
            List<Integer> ds = khoangCach(cuaHangCungLoaiXang, location);

            System.out.println(ds);

            // System.out.println(cuaHangCungLoaiXang);

        }

    }

    public static List<CuaHangXang> timCuaHangCungLoaiXang(int loaiXangYeuCau,
            List<CuaHangXang> danhSachCuaHangXang) {
        List<CuaHangXang> cuaHangGanNhat = new ArrayList<>();

        for (CuaHangXang cuaHang : danhSachCuaHangXang) {
            if (cuaHang.danhsach.contains(loaiXangYeuCau)) {
                cuaHangGanNhat.add(cuaHang);
            }
        }

        return cuaHangGanNhat;
    }

    public static List<Integer> khoangCach(List<CuaHangXang> cuaHangCungLoaiXang, int location) {

        List<Integer> Danhsachkc = new ArrayList<>();
        for (CuaHangXang danhSachkhoangCach : cuaHangCungLoaiXang) {
            int khoangCach = Math.abs(danhSachkhoangCach.viTri - location);

            Danhsachkc.add(khoangCach);

        }
        return Danhsachkc;

    }

}
