package Java;

public class Ketqua {
    private boolean trangThai;
    private String thongBao;

    public Ketqua(boolean trangThai, String thongBao) {

        this.trangThai = trangThai;

        this.thongBao = thongBao;

    }

    public String Export() {
        return "KetQua {trangThai:" + trangThai + "thongBao:" + thongBao + "}";

    }

}
