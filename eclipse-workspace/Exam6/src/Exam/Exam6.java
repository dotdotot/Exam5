package Exam;

import java.util.Scanner;

// ��ǻ�Ϳ� ����������

public class Exam6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("����(1), ����(2), ��(3), ������(4)>>");
			int num = scan.nextInt();
			int computerNum = (int) (Math.random() * 3) + 1;
			if (num == 1) {
				if (computerNum == 1) {
					System.out.println("�����ϴ�..");
				} else if (computerNum == 2) {
					System.out.println("�����ϴ�..");
				} else if (computerNum == 3) {
					System.out.println("�̰���ϴ�..");
				}
			} else if (num == 2) {
				if (computerNum == 1) {
					System.out.println("�̰���ϴ�..");
				} else if (computerNum == 2) {
					System.out.println("�����ϴ�..");
				} else if (computerNum == 3) {
					System.out.println("�����ϴ�..");
				}
			} else if (num == 3) {
				if (computerNum == 1) {
					System.out.println("�����ϴ�..");
				} else if (computerNum == 2) {
					System.out.println("�̰���ϴ�..");
				} else if (computerNum == 3) {
					System.out.println("�����ϴ�..");
				}
			} else if (num == 4) {
				System.out.println("������ �����մϴ�..");
				break;
			}
		}
	}
}
