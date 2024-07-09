package Java;

public class Ketqua { // khai báo class Ketqua
    private boolean trangThai; // khởi tạo thuộc tính trangThai với phạm vi: private, kiểu dữ liệu: boolean
    private String thongBao; // khởi tạo thuộc tính thongBao với phạm vi: private, kiểu dữ liệu: String

    public Ketqua(boolean trangThai, String thongBao) { // khởi tạo hàm Ketqua với phạm vi: public có hai tham số truyền
                                                        // vào là trangThai, thongBao

        this.trangThai = trangThai; // gán thuộc tính trangThai của class Ketqua = tham số trangThai của hàm Ketqua

        this.thongBao = thongBao;// gán thuộc tính thongBao của class Ketqua = tham số thongBao của hàm Ketqua

    }

    public String Export() { // khởi tạo hàm Export với phạm vi: public, có kiểu dữ liệu: String
        return "KetQua {trangThai:" + trangThai + "thongBao:" + thongBao + "}"; // trả về kiểu dữ liệu String của hàm
                                                                                // Export

    }

}
