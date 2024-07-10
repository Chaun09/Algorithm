// quản lý,  tổ chức và nhóm các lớp (classes), giao diện (interfaces), và các kiểu dữ liệu khác 
package Java;

// khai báo class Ketqua
public class Ketqua {
    // khởi tạo thuộc tính trangThai với phạm vi: private, kiểu dữ liệu: boolean
    private boolean trangThai;
    // khởi tạo thuộc tính thongBao với phạm vi: private, kiểu dữ liệu: String
    private String thongBao;

    // khởi tạo hàm Ketqua với phạm vi: public có hai tham số truyền vào là
    // trangThai, thongBao
    public Ketqua(boolean trangThai, String thongBao) {

        // gán thuộc tính trangThai của class Ketqua = tham số trangThai của hàm Ketqua
        this.trangThai = trangThai;
        // gán thuộc tính thongBao của class Ketqua = tham số thongBao của hàm Ketqua
        this.thongBao = thongBao;

    }

    // khởi tạo hàm có tên Export với phạm vi: public, có kiểu dữ liệu: String
    public String Export() {
        // trả về kiểu dữ liệu String của hàm Export

        return "KetQua {trangThai:" + trangThai + "thongBao:" + thongBao + "}";
    }

}
