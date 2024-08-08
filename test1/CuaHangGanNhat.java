package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class CuaHangGanNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Loction:");
        int location = sc.nextInt();
        System.out.print("Type:");
        int type = sc.nextInt();
        List<CuaHangXang> ds = new ArrayList<>(
                List.of(new CuaHangXang("A", List.of(95), 14), new CuaHangXang("B", List.of(95), 95),
                        new CuaHangXang("R", List.of(95, 92), 80), new CuaHangXang("M", List.of(95, 92), 90),
                        new CuaHangXang("Q", List.of(95, 92), 15)));
        List<CuaHangXang> ds3 = DsCuaHangCungLoaiXang(ds, type);
        List<Integer> kcach = Dskhoangcach(ds3, location);
        System.out.print(Dscayxanggannhat(ds, location, type, kcach));

    }

    public static List<CuaHangXang> DsCuaHangCungLoaiXang(List<CuaHangXang> ds, int type) {
        List<CuaHangXang> Dscungloai = new ArrayList<>();
        for (CuaHangXang ds1 : ds) {
            if (ds1.danhSachXang.contains(type)) {
                Dscungloai.add(ds1);

            }

        }
        return Dscungloai;

    }

    public static List<Integer> Dskhoangcach(List<CuaHangXang> ds, int location) {
        List<Integer> dskc = new ArrayList<>();
        for (CuaHangXang ds2 : ds) {
            int kc = Math.abs(location - ds2.diaChi);
            dskc.add(kc);
            Collections.sort(dskc);

        }
        return dskc;

    }

    public static List<CuaHangXang> Dscayxanggannhat(List<CuaHangXang> ds, int location, int type, List<Integer> ds2) {
        List<CuaHangXang> ds4 = new ArrayList<>();
        for (CuaHangXang ds5 : ds) {
            int khoangCach = Math.abs(location - ds5.diaChi);
            if (ds5.danhSachXang.contains(type)) {
                if (ds2.get(0) == khoangCach || ds2.get(1) == khoangCach) {
                    ds4.add(ds5);

                }

            }

        }
        return ds4;

    }

}
