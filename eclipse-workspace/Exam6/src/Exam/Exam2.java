package Exam;

import java.util.Scanner;
import java.util.StringTokenizer;

// ���ڿ��� �Է¹޾� �ش� ���ڿ��� ���� ������ ������ִ� ����

public class Exam2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			String text = scan.nextLine();
			StringTokenizer st = new StringTokenizer(text, " ");

			if (text.equals("exit")) {
				System.out.println("�����մϴ�..");
				break;
			} else {
				int n = st.countTokens();
				System.out.println("���� ������ " + n);
			}
		}

	}
}
