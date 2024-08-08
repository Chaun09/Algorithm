package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// import java.util.Arrays;

public class CuaHangXangGanNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("location:");
        int viTriHienTai = sc.nextInt();
        System.out.print("type:");
        int loaiXangYeuCau = sc.nextInt();

        List<CuaHangXang> danhSachCuaHangXang = new ArrayList<>(List.of(new CuaHangXang(14, "A", List.of(95)),
                new CuaHangXang(95, "B", List.of(95)), new CuaHangXang(80, "R", List.of(95, 92)),
                new CuaHangXang(53, "D", List.of(95, 92)), new CuaHangXang(22, "N", List.of(95)),
                new CuaHangXang(15, "Q", List.of(95, 92)), new CuaHangXang(11, "T", List.of(92)),
                new CuaHangXang(2, "U", List.of(95)), new CuaHangXang(8, "P", List.of(95)),
                new CuaHangXang(43, "ZR", List.of(92)), new CuaHangXang(70, "MX", List.of(92))));

        // for (CuaHangXang cuaHang : danhSachCuaHangXang) {
        // System.out.print(cuaHang);
        // }

        CuaHangXang cuaHangGanNhat = timCuaHangGanNhat(viTriHienTai, loaiXangYeuCau, danhSachCuaHangXang);
        if (cuaHangGanNhat != null) {
            System.out.println("[{name: " + cuaHangGanNhat.ten + ", location: " + cuaHangGanNhat.viTri + ", type:"
                    + cuaHangGanNhat.danhsach + "}]");
        } else {
            System.out.println("[]");
        }

    }

    public static CuaHangXang timCuaHangGanNhat(int viTriHienTai, int loaiXangYeuCau,
            List<CuaHangXang> danhSachCuaHangXang) {
        CuaHangXang cuaHangGanNhat = null;
        int khoangCachNhoNhat = Integer.MAX_VALUE;

        for (CuaHangXang cuaHang : danhSachCuaHangXang) {
            if (cuaHang.danhsach.contains(loaiXangYeuCau)) {
                int khoangCach = Math.abs(cuaHang.viTri - viTriHienTai);
                if (khoangCachNhoNhat > khoangCach) {
                    khoangCachNhoNhat = khoangCach;
                    cuaHangGanNhat = cuaHang;
                }
            }
        }

        return cuaHangGanNhat;
    }
}
