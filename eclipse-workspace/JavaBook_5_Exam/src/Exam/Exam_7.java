package Exam;

interface Shapee {
	final double PI = 3.14;

	void draw();

	double getArea();

	default public void redraw() {
		System.out.println("--- �ٽ� �׸��ϴ� ---");
		draw();
	}
}

class Circlee implements Shapee {
	private int radius;

	public Circlee(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("������ " + radius + " ");
	}

	public double getArea() {
		return PI * radius * radius;
	}
}

public class Exam_7 {
	public static void main(String args[]) {
		Shapee coin = new Circlee(10); // �������� 10�� ���� ����
		coin.redraw();
		System.out.println("������ ������ " + coin.getArea());
	}
}
