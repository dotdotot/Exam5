package Exam;

// ���� ���� 1~3�� 3�� �Է¹޾� ��� ������ ���� ��� �� ����

public class Exam3 {
	public static void main(String args[]) {
		while (true) {
			// ���� ���� 1~3�� �Է¹ް� ���ڿ��� ��ȯ
			String a = Integer.toString((int) (Math.random() * 3 + 1));
			String b = Integer.toString((int) (Math.random() * 3 + 1));
			String c = Integer.toString((int) (Math.random() * 3 + 1));

			System.out.println(a + '\t' + b + '\t' + c);
			if (a.equals(b) && b.equals(c)) {
				System.out.println("����!");
				break;
			}
		}
	}
}
