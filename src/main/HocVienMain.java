package main;

import java.util.ArrayList;

import actions.HocVienAction;
import beans.HocVien;

public class HocVienMain {
	public static void main(String[] args) {
		ArrayList<HocVien> list = new ArrayList<>();
		boolean check = true;
		do {
			int luachon = HocVienAction.menu();
			switch (luachon) {
			case 1:
				list = HocVienAction.input();
				break;
			case 2:
				HocVienAction.display(list);
				break;
			case 3:
				HocVienAction.searchHV(list);
				break;
			case 4:
				HocVienAction.sort(list);
				break;
			case 5:
				HocVienAction.delete(list);
				break;
			case 6:
				System.out.println("Good bye!");
				check = false;
				break;
			}
		} while (check);
	}
}
