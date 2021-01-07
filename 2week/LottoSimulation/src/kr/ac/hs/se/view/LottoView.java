package kr.ac.hs.se.view;

import java.io.PrintStream;

import kr.ac.hs.se.model.PurchasedLotto;
import kr.ac.hs.se.model.WinningLotto;

public class LottoView {
	
	PrintStream out = new PrintStream(System.out);

	public void showProgramTitle() {
		out.println("������������������������������������������������������������������������������������������������������������");
		out.println("��                   Lotto Simulation                 ��");
		out.println("������������������������������������������������������������������������������������������������������������");
	}

	public void showInput() {
		out.print("�ùķ��̼� �� ������ ���� �Է��ϼ���.\n>> ");
	}
	
	public void winningLineBreak() {
		out.println("������������������������������������������������÷ ��ȣ������������������������������������������������");
	}
	
	public void purchasedLottoListLineBreak() {
		out.println("���������������������������������������ùķ��̼ǵ� ���� ��ȣ��������������������������������������");
	}
	
	public void lineBreak() {
		out.println("������������������������������������������������������������������������������������������������������������");
	}

	public void showErrorMassage() {
		out.println("���α׷��� ������ �߻��߽��ϴ�.");
	}

	public void showWinningLotto(WinningLotto winningLotto) {
		System.out.println(winningLotto);
	}
	
	public void showPurchasedLotto(PurchasedLotto purchasedLotto) {
		System.out.println(purchasedLotto);
	}
}