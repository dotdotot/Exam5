package Exam;

import java.util.Scanner;

abstract class Calculator {
	protected int a, b;

	abstract protected int calc(); // �߻� �޼ҵ�

	protected void input() { // �� ������ �Է¹޴� �޼ҵ�
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 2���� �Է��ϼ���>>");
		a = scan.nextInt();
		b = scan.nextInt();
	}

	public void run() { // �� ������ �Է¹޾� ����ϰ� ����� ����ϴ� �޼ҵ�
		input();
		int res = calc();
		System.out.println("���� ���� " + res);
	}
}

class Adder extends Calculator {
	protected int calc() {
		return a + b;
	}
}

class Subtracter extends Calculator {
	protected int calc() {
		return a - b;
	}
}

public class Exam_3 {
	public static void main(String args[]) {
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();

		adder.run();
		sub.run();
	}
}
