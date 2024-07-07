package Java;

public class Ketqua {
    private boolean trangThai;
    private String thongBao;
    private int noiDung;

    public Ketqua(boolean trangThai, String thongBao, int noiDung) {

        this.trangThai = trangThai;
        this.noiDung = noiDung;
        this.thongBao = thongBao;

    }

    public String Export() {
        return "KetQua {trangThai:" + trangThai + ", noiDung:" + noiDung + ","
                + " thongBao:" + thongBao + "}";

    }

}
