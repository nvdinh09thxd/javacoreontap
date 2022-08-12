package action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import bean.HocVien;
import exception.NumberException;

public class HocVienAction {
	static Scanner sc = new Scanner(System.in);

	public static int NhapSoDuong(String msg, String err) {
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print(msg);
				n = Integer.parseInt(sc.nextLine());
				if (n < 0)
					throw new NumberException(err);
				check = false;
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập đúng định dạng số!");
			}
		} while (check);
		return n;
	}

	public static String nhapChuoi(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}

	public static int tuoiNgauNhien() {
		Random rd = new Random();
		return rd.nextInt(8) + 18;
	}

	public static ArrayList<HocVien> input() {
		ArrayList<HocVien> list = new ArrayList<>();
		int n = NhapSoDuong("Nhập số lượng học viên: ", "Vui lòng nhập số lượng học viên lớn hơn hoặc bằng 0!");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin cho học viên thứ " + (i + 1) + ": ");
			String maHV = nhapChuoi("Nhập mã học viên: ");
			String hoTen = nhapChuoi("Nhập họ và tên: ");
			String diaChi = nhapChuoi("Nhập địa chỉ: ");
			int tuoi = tuoiNgauNhien();
			HocVien hv = new HocVien(maHV, hoTen, diaChi, tuoi);
			list.add(hv);
		}
		return list;
	}

	public static void display(ArrayList<HocVien> list) {
		if (list.size() > 0) {
			for (HocVien hv : list) {
				System.out.println(hv);
				System.out.println("========================");
			}
		} else
			System.out.println("Không có học viên nào!");
	}

	public static HocVien search(ArrayList<HocVien> list, String maHV) {
		for (HocVien hv : list) {
			if (maHV.equals(hv.getMaHV()))
				return hv;
		}
		return null;
	}

	public static void sort(ArrayList<HocVien> list) {
		String luachon = nhapChuoi("Nhập lựa chọn sắp xếp (DESC/ASC): ");
		if ("ASC".equals(luachon)) {
			Collections.sort(list, new Comparator<HocVien>() {
				public int compare(HocVien ts1, HocVien ts2) {
					if (ts1.getTuoi() > ts2.getTuoi()) {
						return 1;
					} else {
						return -1;
					}
				}
			});
		} else if ("DESC".equals(luachon)) {
			Collections.sort(list, new Comparator<HocVien>() {
				public int compare(HocVien ts1, HocVien ts2) {
					if (ts1.getTuoi() < ts2.getTuoi()) {
						return 1;
					} else {
						return -1;
					}
				}
			});
		}
	}

	public static void delete(ArrayList<HocVien> list) {
		String maHV = nhapChuoi("Nhập mã học viên muốn xóa: ");
		for (HocVien hv : list) {
			if (maHV.equals(hv.getMaHV()))
				list.remove(hv);
		}
	}

	public static void searchHV(ArrayList<HocVien> list) {
		String maHV = nhapChuoi("Nhập mã học viên muốn tìm: ");
		HocVien hv = search(list, maHV);
		if (hv != null) {
			System.out.println(hv);
		} else
			System.out.println("Không tìm thấy!");
	}

	public static int menu() {
		System.out.println("----------------------------");
		System.out.println("--1. Nhập dữ liệu");
		System.out.println("--2. Xuất dữ liệu");
		System.out.println("--3. Tìm thông tin");
		System.out.println("--4. Sắp xếp");
		System.out.println("--5. Xóa thông tin học viên");
		System.out.println("--6. Thoát");
		System.out.println("----------------------------");
		boolean check = true;
		int luachon = 0;
		do {
			try {
				System.out.print("Nhập thao tác lựa chọn: ");
				luachon = Integer.parseInt(sc.nextLine());
				if (luachon < 1 || luachon > 6)
					throw new NumberException("Vui lòng nhập số từ 1 đến 6!");
				check = false;
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập đúng định dạng số!");
			}
		} while (check);
		return luachon;
	}
}
