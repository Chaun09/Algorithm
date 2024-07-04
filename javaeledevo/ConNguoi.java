package javaeledevo;


public class ConNguoi {
	private double chieucao;
	private String ten;
	private double cannang;
	
	public double getChieucao() {
		return chieucao;
	}
	public void setChieucao(double chieucao) {
		this.chieucao = chieucao;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getCannang() {
		return cannang;
	}
	public void setCannang(double cannang) {
		this.cannang = cannang;
	}
	public ConNguoi(double chieucao, String ten, double cannang) {
		super(); // gọi lại các thuộc tính có sắn của lớp cha
		this.chieucao = chieucao;
		this.ten = ten;
		this.cannang = cannang;
		
	}
		
	
	@Override
	public String toString() {
		return "ConNguoi [chieucao=" + chieucao + ", ten=" + ten + ", cannang=" + cannang + "]";
	}
	
}