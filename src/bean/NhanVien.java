package bean;

import java.util.Scanner;

import exception.NumberException;

public class NhanVien {
	protected int maNV;
	protected String hoTen;
	protected int tuoi;
	protected String sdt;
	protected String email;
	protected float luongCoBan;

	public int getMaNV() {
		return maNV;
	}

	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(float luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public NhanVien(int maNV, String hoTen, int tuoi, String sdt, String email, float luongCoBan) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.sdt = sdt;
		this.email = email;
		this.luongCoBan = luongCoBan;
	}

	public NhanVien() {
		super();
	}

	@Override
	public String toString() {
		return "maNV = " + this.maNV + "\nhoTen = " + this.hoTen + "\ntuoi = " + this.tuoi + "\nsdt = " + this.sdt
				+ "\nemail = " + this.email + "\nluong = " + this.luongCoBan;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		do {
			try {
				System.out.print("Nhập mã nhân viên: ");
				maNV = Integer.parseInt(sc.nextLine());
				if (maNV < 1)
					throw new NumberException("Mã nhân viên phải lớn hơn 0!");
				check = false;
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Nhap sai dinh dang so!");
			}
		} while (check);
		System.out.print("Nhập họ tên nhân viên: ");
		hoTen = sc.nextLine();
		System.out.print("Nhập số điện thoại: ");
		sdt = sc.nextLine();

		check = true;
		do {
			try {
				System.out.print("Nhập email: ");
				email = sc.nextLine();
				if (!email.contains("@"))
					throw new NumberException("Sai định dạng email!");
				check = false;
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			}
		} while (check);

		check = true;
		do {
			try {
				System.out.print("Nhập tuổi: ");
				tuoi = Integer.parseInt(sc.nextLine());
				if (tuoi < 1)
					throw new NumberException("Tuổi phải lớn hơn 0!");
				check = false;
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Nhap sai dinh dang so!");
			}
		} while (check);

		check = true;
		do {
			try {
				System.out.print("Nhập lương cơ bản: ");
				luongCoBan = Float.parseFloat(sc.nextLine());
				if (luongCoBan < 0)
					throw new NumberException("Lương phải là số dương!");
				check = false;
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Nhap sai dinh dang so!");
			}
		} while (check);

	}
}
