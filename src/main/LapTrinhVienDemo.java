package main;

import java.util.ArrayList;

import bean.LapTrinhVien;

public class LapTrinhVienDemo {

	public static void main(String[] args) {
		ArrayList<LapTrinhVien> list = new ArrayList<>();
		LapTrinhVien nv = new LapTrinhVien();
		list.add(nv);
		for (LapTrinhVien nhanvien : list) {
			nhanvien.nhap();
		}
	}

}
