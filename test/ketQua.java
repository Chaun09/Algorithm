package test;

import java.util.List;

public class ketQua {
    private boolean trangThai;
    private String thongBao;
    private List<String> noiDung;

    public ketQua(boolean trangThai, String thongBao, List<String> noiDung) {
        this.thongBao = thongBao;
        this.trangThai = trangThai;
        this.noiDung = noiDung;

    }

    public String Export() {
        return "{KetQua: Thong Bao" + thongBao + "Trang Thai:" + trangThai + "Noi Dung:" + noiDung + "}";

    }

}
