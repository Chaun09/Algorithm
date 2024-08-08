package test1;

import java.util.List;

public class CuaHangXang {
    String ten;
    List<Integer> danhSachXang;
    int diaChi;

    public CuaHangXang(String ten, List<Integer> danhSachXang, int diaChi) {
        this.ten = ten;
        this.danhSachXang = danhSachXang;
        this.diaChi = diaChi;

    }

    @Override

    public String toString() {
        return "CuaHangXang{" + "Ten:" + ten + ", DanhSachXang:" + danhSachXang + ", Diachi:" + diaChi + "}";

    }

}
