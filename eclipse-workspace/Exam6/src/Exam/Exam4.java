package Exam;

import java.util.Scanner;
import java.util.StringTokenizer;

// 1 + 2 + 3 + 4 ó�� ���ϴ� ���ڿ��� �Է¹ް� 
// �ش� ���ڿ��� +�� �������� �ڸ��� ���������� ��ȯ�Ͽ� ���� ���

public class Exam4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		String text = scan.nextLine(); //���ڿ��� �ٹٲ��� ���ö����� �Է¹޾� text�� ����
		StringTokenizer s = new StringTokenizer(text, "+"); // text�� + �� �������� �߶� s�� ����
		while (s.hasMoreTokens()) {// ��ū�� ������ ����
			String stringNum = s.nextToken(); // +�� �������� �ڸ� ��ū�� stringNum�� ���� (��ū�� ���� �տ��ִ� ���� ������)
			stringNum = stringNum.trim(); // �� �� ���ڿ� ������ �ڸ�
			int num = Integer.parseInt(stringNum); // ����� ���ڿ��� ������ ��ȯ�Ͽ� num�� ����
			sum += num; 
		}

		System.out.println("���� : " + sum);
	}
}
