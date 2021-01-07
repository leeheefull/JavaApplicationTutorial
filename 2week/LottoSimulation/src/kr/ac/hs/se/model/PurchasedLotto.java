package kr.ac.hs.se.model;

import java.util.Set;
import java.util.TreeSet;

public class PurchasedLotto implements Lotto {

	private Set<Integer> basicNumbers;
	private String winningResult;

	public PurchasedLotto() {
		this.basicNumbers = new TreeSet<>();
		this.setBasicNumbers();
	}

	@Override
	public Set<Integer> getBasicNumbers() {
		return this.basicNumbers;
	}

	// �⺻ ��ȣ�� ������ 6�� �� ������, �ݺ�
	@Override
	public void setBasicNumbers() {
		while (this.basicNumbers.size() < SIZE) {
			int tmp = (int) (Math.random() * 42) + 1;
			this.basicNumbers.add(tmp);
		}
	}

	public String getResult() {
		return winningResult;
	}

	public void setResult(String winningResult) {
		this.winningResult = winningResult;
	}

	// �⺻ ��ȣ �� �� ���
	@Override
	public String toString() {
		String outputStr = "";
		for (int number : this.basicNumbers) {
			outputStr += number + "\t";
		}
		return outputStr + this.winningResult;
	}
}