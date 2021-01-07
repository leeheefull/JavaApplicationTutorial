package kr.ac.hs.se.model;

import java.util.Set;
import java.util.TreeSet;

public class WinningLotto implements Lotto {

	private Set<Integer> basicNumbers;
	private int bonusNumber;

	public WinningLotto() {
		this.basicNumbers = new TreeSet<>();
		this.setBasicNumbers();
		this.setBonusNumber();
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

	public int getBonusNumber() {
		return this.bonusNumber;
	}

	// �⺻ ��ȣ�� �ߺ����� �ʰ� set
	public void setBonusNumber() {
		int tmp = (int) (Math.random() * 42) + 1;
		while (this.basicNumbers.contains(tmp)) {
			tmp = (int) (Math.random() * 42) + 1;
		}
		this.bonusNumber = tmp;
	}

	// ��÷ ��ȣ �� �� ���
	@Override
	public String toString() {
		String outputStr = "";
		for (int number : basicNumbers) {
			outputStr += number + "\t";
		}
		return outputStr + "+ " + this.bonusNumber;
	}
}
