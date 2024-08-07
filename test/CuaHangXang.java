package test;

import java.util.List;

public class CuaHangXang {
    int viTri;
    String ten;
    List<Integer> danhsach;

    public CuaHangXang(int viTri, String ten, List<Integer> danhsach) {
        this.viTri = viTri;
        this.ten = ten;
        this.danhsach = danhsach;

    }

    @Override

    public String toString() {
        return "CuaHangXang{" +
                "location=" + viTri +
                ", name='" + ten + '\'' +
                ", type=" + danhsach +
                '}';
    }

}
