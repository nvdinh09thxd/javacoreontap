package action;

import java.util.ArrayList;
import java.util.Scanner;

import bean.NhanVien;
import exception.NumberException;

public class NhanVienAction {
	public void nhap(ArrayList<NhanVien> list) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean check = true;
		// Nhập số lượng nhan vien
		do {
			try {
				System.out.print("Nhap so luong nhan vien: ");
				n = Integer.parseInt(sc.nextLine());
				if (n < 0)
					throw new NumberException("Vui long nhap so luong nhan vien lon hon hoac bang 0!");
				check = false;
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Nhap sai dinh dang so!");
			}
		} while (check);
		// Nhập thông tin cho mỗi nhan vien
		for (int i = 0; i < n; i++) {
			int maNV = 0, tuoi = 0;
			String email = null;
			float luongCoBan = 0.0f;
			check = true;
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
			String hoTen = sc.nextLine();
			System.out.print("Nhập số điện thoại: ");
			String sdt = sc.nextLine();

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

			NhanVien nv = new NhanVien(maNV, hoTen, tuoi, sdt, email, luongCoBan);
			list.add(nv);
		}
	}

	public static void xuat(ArrayList<NhanVien> list) {
		for (NhanVien nv : list) {
			System.out.println(nv);
		}
	}

}
