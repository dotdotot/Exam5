package exam;

abstract class Calculator { // �߻� Ŭ���� Calculator ����
	public abstract int add(int a, int b); // �� ������ ���� �����ϴ� ��� �޼ҵ�

	public abstract int subtract(int a, int b); // �� ������ ���� �����ϴ� ��� �޼ҵ�

	public abstract double average(int[] a); // ���� �迭�� ����� �����ϴ� ��� �޼ҵ�
}

class GoodCale extends Calculator { // �߻� Ŭ���� Calculator�� ��ӹ޾� �����ϴ� GoodCale Ŭ����
	public int add(int a, int b) { // ���� Ŭ������ ���ǵ� add �޼ҵ带 ������
		return a + b; // �� ������ ���� ����
	}

	public int subtract(int a, int b) { // ���� Ŭ������ ���ǵ� subtract �޼ҵ带 ������
		return a - b;
	}

	public double average(int[] a) { // ���� Ŭ������ ���ǵ� average �޼ҵ带 ������
		double sum = 0; // �Ǽ��� ���� sum ������ ���ÿ� 0���� �ʱ�ȭ
		for (int i = 0; i < a.length; i++) { // �迭�� ���̸�ŭ �ݺ��ϴ� �ݺ���
			sum += a[i]; // ������ �迭 a�� index i��° ���� sum�� ����
		}
		return sum / a.length; // ������ �迭 a�� ������ ������ �Ǽ��� ���� sum�� ������ �迭 a�� ���̷� ���� ����� ����
	}
}

public class Exam5_7 {
	public static void main(String[] args) {
		GoodCale c = new GoodCale(); // GoodCale Ŭ���� ���۷��� ����� ���ÿ� �ν��Ͻ� ����
		System.out.println(c.add(2, 3)); // 2 + 3�� ���
		System.out.println(c.subtract(2, 3)); // 2 - 3�� ���
		System.out.println(c.average(new int[] { 2, 3, 4 })); // (2 + 3 + 4) / 3�� ���
	}
}
