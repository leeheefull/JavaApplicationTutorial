package kr.ac.hs.se.view;

public class LottoView {

	public void showProgramTitle() {
		System.out.println("������������������������������������������������������������������������������������������������������������");
		System.out.println("��                   Lotto Simulation                 ��");
		System.out.println("������������������������������������������������������������������������������������������������������������");
	}

	public void showInput() {
		System.out.print("�ùķ��̼� �� ������ ���� �Է��ϼ���.\n>> ");
	}

	public void showLottoList(Object o) {
		System.out.println(o);
	}

	public void showErrorMassage() {
		System.out.println("���α׷��� ������ �߻��߽��ϴ�.");
	}
}