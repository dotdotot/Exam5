package over_riding;

class Shape { // ������ ���� Ŭ����
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

public class exam_over_riding_5_5 {
	// Shape p = line;
	static void paint(Shape p) { // shape�� ��ӹ��� ��ü���� �Ű� ������ �Ѿ�� �� ����
		p.draw();// p�� ����Ű�� ��ü�� �������̵��� darw() ȣ��
		// ���� ���ε�
	}

	public static void main(String[] args) {
		Line line = new Line();
		paint(line); // line�� draw()���� "Line"���
		
		paint(new Shape()); // Shape�� draw()���� , "Shape"���
		paint(new Line()); // �������̵��� �޼ҵ� Line�� draw()����
		paint(new Circle());// �������̵��� �޼ҵ� Circle�� draw()����
		paint(new Rect());// �������̵��� �޼ҵ� Rect�� draw()����
	}
}
