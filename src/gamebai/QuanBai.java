package gamebai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import exception.NumberException;

public class QuanBai {
	String name;
	int point;
	int exp;

	static Scanner sc = new Scanner(System.in);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public QuanBai(String name, int point, int exp) {
		super();
		this.name = name;
		this.point = point;
		this.exp = exp;
	}

	public QuanBai() {
		super();
	}

	@Override
	public String toString() {
		return "name = " + this.name + "\npoint = " + this.point + "\nexp = " + this.exp;
	}

	// Nhập danh sach quan bai
	public static ArrayList<QuanBai> inputInfo() {
		ArrayList<QuanBai> list = new ArrayList<>();
		boolean check = true;
		int n = 0;
		// Nhập số lượng quan bai
		do {
			try {
				System.out.print("Nhap so luong quan bai: ");
				n = Integer.parseInt(sc.nextLine());
				if (n < 0)
					throw new NumberException("Vui long nhap so luong quan bai lon hon hoac bang 0!");
				check = false;
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Nhap sai dinh dang so!");
			}
		} while (check);

		// Nhập thông tin cho mỗi quan bai
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin quan bai thu " + (i + 1) + ": ");
			System.out.print("Nhap ten quan bai: ");
			String ten = sc.nextLine();
			int diem = 0, heso = 0;
			check = true;

			// Nhập điểm
			do {
				try {
					System.out.print("Nhap diem (tu 1 - 4): ");
					diem = Integer.parseInt(sc.nextLine());
					if (diem < 1 || diem > 4)
						throw new NumberException("Vui long nhap diem tu 1 den 4!");
					check = false;
				} catch (NumberException e) {
					System.out.println(e.getMessage());
				} catch (NumberFormatException e) {
					System.out.println("Nhap sai dinh dang so!");
				}
			} while (check);

			// Nhập he so
			check = true;
			do {
				try {
					System.out.print("Nhap he so (tu 1 - 13): ");
					heso = Integer.parseInt(sc.nextLine());
					if (heso < 1 || heso > 13)
						throw new NumberException("Vui long nhap he so tu 1 den 13!");
					check = false;
				} catch (NumberException e) {
					System.out.println(e.getMessage());
				} catch (NumberFormatException e) {
					System.out.println("Nhap sai dinh dang so!");
				}
			} while (check);

			QuanBai ts = new QuanBai(ten, diem, heso);
			list.add(ts);
		}

		return list;
	}

	// Xuat danh sach quan bai
	public static void displayInfo(ArrayList<QuanBai> list) {
		if (list.size() > 0) {
			for (QuanBai obj : list) {
				System.out.println(obj);
				System.out.println("====================");
			}
		} else
			System.out.println("Chua co du lieu");
	}

	public static void sapXep(ArrayList<QuanBai> list) {
		Collections.sort(list, new Comparator<QuanBai>() {
			public int compare(QuanBai ts1, QuanBai ts2) {
				if (ts1.getExp() < ts2.getExp()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
	}

	public static QuanBai timKiem(ArrayList<QuanBai> list) {
		System.out.print("Nhập tên quân bài muốn tìm kiếm: ");
		String name = sc.nextLine();
		for (QuanBai qb : list) {
			if (name.equals(qb.getName()))
				return qb;
		}
		return null;
	}

	public static void tim(ArrayList<QuanBai> list) {
		QuanBai qb = timKiem(list);
		if (qb != null) {
			System.out.println(qb);
		} else
			System.out.println("Không tìm thấy!");
	}
}
