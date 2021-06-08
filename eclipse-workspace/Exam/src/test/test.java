package test;

import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
	private JLabel timerLable; // Ÿ�̸� ���� ��µǴ� ���̺�

	public TimerThread(JLabel timerLabel) {
		this.timerLable = timerLabel; // Ÿ�̸� ī��Ʈ�� ����� ���̺�
	}

	// ������ �ڵ�, run()�� ����Ǹ� ������ ����
	@Override
	public void run() {
		int n = 0; // Ÿ�̸� ī��Ʈ ��
		while (true) { // ���� ���� ����
			timerLable.setText(Integer.toString(n)); // ���̺� ī��Ʈ �� �� �̤���
			n++; // ī��Ʈ ����
			try {
				Thread.sleep(1000); // 1�� ���� ���� �ܴ�
			} catch (InterruptedException e) {
				return; // ���� �߻��� ������ ����
			}
		}
	}
}

class ThreadTimerEx extends JFrame {
	public ThreadTimerEx() {
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel); // ���̺��� ����Ʈ�ҿ� ����

		// Ÿ�̸� ������ ��ü ����. Ÿ�̸� ���� ����� ���̺��� �����ڿ� ����
		TimerThread th = new TimerThread(timerLabel);

		setSize(250, 150);
		setVisible(true);
		
		th.start(); // Ÿ�̸� �������� ������ �����ϰ� �Ѵ�.
	}
}

public class test {

	public static void main(String args[]) {
		new ThreadTimerEx();
	}
}