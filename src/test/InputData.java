package test;

import java.util.Scanner;

import exception.NumberException;

public class InputData {
	static Scanner sc = new Scanner(System.in);

	public static int nhapSo(String msg) {
		boolean check = true;
		int n = 0;
		do {
			try {
				System.out.print("Nhập một số: ");
				n = Integer.parseInt(sc.nextLine());
				if (n < 0)
					throw new NumberException(msg);
				check = false;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập đúng định dạng số!");
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			}
		} while (check);
		return n;
	}

	public static void main(String[] args) {
		int a = nhapSo("Không thỏa mãn!");
		System.out.println(a);
	}

}
