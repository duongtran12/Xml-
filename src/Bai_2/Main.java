package Bai_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private String name;
	private int age;
	private double gpa;

	public Main(String name, int age, double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}

	public String XML() {
		StringBuilder xml = new StringBuilder();
		xml.append("<student>\n");
		xml.append("\t<name>").append(name).append("</name>\n");
		xml.append("\t<age>").append(age).append("</age>\n");
		xml.append("\t<gpa>").append(gpa).append("</gpa>\n");
		xml.append("</student>\n");
		return xml.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số lượng sinh viên: ");
		int numStudents = Integer.parseInt(scanner.nextLine());

		List<Main> students = new ArrayList<>();

		for (int i = 0; i < numStudents; i++) {
			System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
			System.out.print("Tên sinh viên: ");
			String name = scanner.nextLine();

			System.out.print("Tuổi: ");
			int age = Integer.parseInt(scanner.nextLine());

			System.out.print("GPA: ");
			double gpa = Double.parseDouble(scanner.nextLine());

			students.add(new Main(name, age, gpa));
		}

		System.out.println("<students>");
		for (Main student : students) {
			System.out.println(student.XML());
		}
		System.out.println("</students>");

		scanner.close();
	}
}