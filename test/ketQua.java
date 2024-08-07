package test;

public class ketQua {
    private boolean trangThai;
    private String thongBao;

    public ketQua(boolean trangThai, String thongBao) {
        this.thongBao = thongBao;
        this.trangThai = trangThai;

    }

    public String Export() {
        return "{KetQua: Thong Bao: " + thongBao + ", Trang Thai: " + trangThai;

    }

}
