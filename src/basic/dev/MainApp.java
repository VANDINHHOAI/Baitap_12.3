package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		
		if (n < 3) {
			System.out.println("n nhap vao khong duoc nho hon 3");
		}else {
			long fn = 0;
			long f1 = 1;
			long f2 = 1;
			System.out.println(f1);
			System.out.println(f2);
			for (int i = 3; i <= n; i++) {
				fn = f1 + f2;
				System.out.println(fn);
				f1 = f2;
				f2 = fn;
			}
		}
	}
}
