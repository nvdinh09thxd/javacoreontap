package gamebai;

import java.util.ArrayList;

public class QuanBaiDemo {

	public static void main(String[] args) {
		ArrayList<QuanBai> list = new ArrayList<>();
		System.out.println("================ NHAP THONG TIN QUAN BAI ================");
		list = QuanBai.inputInfo();
		System.out.println("================ XUAT THONG TIN QUAN BAI ================");
		QuanBai.displayInfo(list);
		//Sắp xếp danh sách theo chiều giảm dần của hệ số
		QuanBai.sapXep(list);
		System.out.println("================ DANH SÁCH QUÂN BÀI SAU KHI SẮP XẾP ================");
		QuanBai.displayInfo(list);
		//Tìm kiếm quân bài
		QuanBai.tim(list);
	}

}
