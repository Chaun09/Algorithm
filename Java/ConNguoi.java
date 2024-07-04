package Java;


public class ConNguoi {
	private double chieucao;
	private String ten;
	private double cannang;
	
	
	public ConNguoi(double chieucao, String ten, double cannang) {
		super(); // gọi lại các thuộc tính có sắn của lớp cha
		this.chieucao = chieucao;
		this.ten = ten;
		this.cannang = cannang;
		
	}
		
	
	// @Override
	// public String toString() {
	// 	return "ConNguoi [chieucao=" + chieucao + ", ten=" + ten + ", cannang=" + cannang + "]";
	// }
	
	public String export(){ 
		return "ConNguoi [chieucao=" + chieucao + ", ten=" + ten + ", cannang=" + cannang + "]";
}}

//Xau + biến = xâu 
//Kiểu dữ liệu nguyên thủy: int, float,..
// java Kiểu dữ lieu hiện đại : mảng, object in ra địa chỉ torng bộ nhớ