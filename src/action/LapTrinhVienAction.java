package action;

import java.util.ArrayList;
import java.util.Scanner;

import bean.NhanVien;

public class LapTrinhVienAction extends NhanVienAction {
	
	public void nhap(ArrayList<NhanVien> list) {
		Scanner sc = new Scanner(System.in);
		super.nhap(list);
		System.out.print("Nhập số giờ làm thêm: ");
        int soGioLamThem = sc.nextInt();
	}
}
