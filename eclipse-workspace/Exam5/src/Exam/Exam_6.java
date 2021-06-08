package Exam;

import java.util.Scanner;

abstract class Shape {
	abstract void draw();
}

class editor extends Shape {
	Scanner scan = new Scanner(System.in);

	private String[] Shape = new String[10];
	private int top = 0;

	public void insert() {
		System.out.print("���� ���� Line(1), Rect(2), Circle(3)>>");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			Shape[top] = "Line";
			top += 1;
			break;
		case 2:
			Shape[top] = "Rect";
			top += 1;
			break;
		case 3:
			Shape[top] = "Circle";
			top += 1;
			break;
		default:
			System.out.println("���� �����Դϴ�.");
		}
	}

	public void delete() {
		System.out.print("������ ������ ��ġ>>");
		int choice = scan.nextInt();

		if (top < choice) {
			System.out.println("������ �� �����ϴ�.");
		} else {
			Shape[choice - 1] = null;
		}
	}

	public void draw() {
		for (int i = 0; i < top; i++) {
			System.out.println(Shape[i]);
		}
	}
}

public class Exam_6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		editor e = new editor();

		boolean b = true;

		while (b != false) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			int num = scan.nextInt();
			switch (num) {
			case 1:
				e.insert();
				break;
			case 2:
				e.delete();
				break;
			case 3:
				e.draw();
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				b = false;
				break;
			default:
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
	}
}
