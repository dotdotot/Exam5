package exam;

class Weapon { // Weapon Ŭ���� ����
	protected int fire() { // ������ ��ȯ�ϴ� �޼ҵ� ����
		return 1; // ����� �⺻������ 1���� �����
	}
}

class Cannon extends Weapon { // Weapon Ŭ������ ��ӹ޴� Cannon Ŭ���� ����
	protected int fire() { // ���� Ŭ������ ���ǵ� fire() �Լ��� �������̵��ؼ� ������
		return 10; // ������ �� ���� 10���� ���
	}
}

public class Exam5_6 {
	public static void main(String[] args) {
		Weapon weapon; // Weapon Ŭ������ ���۷��� ����
		weapon = new Weapon(); // Weapon Ŭ������ �ν��Ͻ� ����
		System.out.println("�⺻ ������ ��� �ɷ��� " + weapon.fire());
		weapon = new Cannon(); // Weapon Ŭ������ ��� ���� Cannon Ŭ������ �ν��Ͻ� ����
		System.out.println("������ ��� �ɷ��� " + weapon.fire());
	}
}
