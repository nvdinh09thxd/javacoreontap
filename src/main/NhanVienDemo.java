package main;

import java.util.ArrayList;

import action.NhanVienAction;
import bean.NhanVien;

public class NhanVienDemo {

	public static void main(String[] args) {
		ArrayList<NhanVien> list = new ArrayList<>();
		NhanVien nv = new NhanVien();
		list.add(nv);
		for (NhanVien nhanvien : list) {
			nhanvien.nhap();
		}

	}

}
