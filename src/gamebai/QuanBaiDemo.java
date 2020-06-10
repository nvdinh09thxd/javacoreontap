package gamebai;

import java.util.ArrayList;

public class QuanBaiDemo {

	public static void main(String[] args) {
		ArrayList<QuanBai> list = new ArrayList<>();
		System.out.println("================ NHAP THONG TIN QUAN BAI ================");
		list = QuanBai.inputInfo();
		System.out.println("================ XUAT THONG TIN QUAN BAI ================");
		QuanBai.displayInfo(list);

	}

}
