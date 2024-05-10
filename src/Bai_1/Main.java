package Bai_1;

import java.io.File;
import java.util.Scanner;

public class Main {
	public Main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập đường dẫn thư mục:");
		String path = sc.nextLine();
		File f = new File(path);
		if (f.exists()) {
			output(f);
		} else {
			System.out.println("Đường dẫn không tồn tại.");
		}
	}

	public void output(File file) {
		if (file.isDirectory()) {
			System.out.println("<" + file.getName() + ">");
			File[] children = file.listFiles();
			for (File child : children) {
				this.output(child);
			}
			System.out.println("</" + file.getName() + ">");
		} else {
			System.out.println("<file>" + file.getName() + "</file>");
		}
	}

	public static void main(String[] args) {
		new Main();
	}
}
