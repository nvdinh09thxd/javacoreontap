package bean;

import java.util.Scanner;

public class LapTrinhVien extends NhanVien {
	int sogio;

	public int getSogio() {
		return sogio;
	}

	public void setSogio(int sogio) {
		this.sogio = sogio;
	}

	public LapTrinhVien(int maNV, String hoTen, int tuoi, String sdt, String email, int luongCoBan, int sogio) {
		super(maNV, hoTen, tuoi, sdt, email, luongCoBan);
		this.sogio = sogio;
	}

	public LapTrinhVien() {
		super();
	}

	public float luong() {
		return super.luongCoBan * sogio * 200000;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhập số giờ làm thêm: ");
		this.sogio = sc.nextInt();

	}
}
