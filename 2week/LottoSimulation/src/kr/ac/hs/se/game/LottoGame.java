package kr.ac.hs.se.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kr.ac.hs.se.model.PurchasedLotto;
import kr.ac.hs.se.model.WinningLotto;

public class LottoGame {

	private final List<PurchasedLotto> purchasedLottoList;
	private final WinningLotto winningLotto;

	public LottoGame() {
		this.purchasedLottoList = new ArrayList<>();
		this.winningLotto = new WinningLotto();
	}

	public WinningLotto getWinningLotto() {
		return winningLotto;
	}

	public List<PurchasedLotto> getPurchasedLottoList() {
		return this.purchasedLottoList;
	}

	// �ùķ��̼� �� ���� ����Ʈ�� setter
	public void setPurchasedLottoList(int numberOfLotto) {
		while (purchasedLottoList.size() < numberOfLotto) {
			this.purchasedLottoList.add(new PurchasedLotto());
		}
	}

	// �� �ùķ��̼� �ζǵ��� ����� set
	public void setLottoListResult() {
		for (PurchasedLotto purchasedLotto : purchasedLottoList) {
			int rank = getRanking(purchasedLotto);
			if (5 < rank) {
				purchasedLotto.setResult("��÷");
			} else {
				purchasedLotto.setResult(rank + "��");
			}
		}
	}

	// �ùķ��̼��� ���� ����Ʈ�� ���
	private int getRanking(PurchasedLotto purchasedLotto) {
		int cnt = 0;
		// ���ŵ� �ζǿ� ��÷ �ζǰ� ������, 1��
		if (purchasedLotto.getBasicNumbers().containsAll(this.winningLotto.getBasicNumbers())) {
			return 1;
		}
		// ���ŵ� �ζǿ� ��÷ �ζǰ� 5���� �����鼭 ���ʽ� ��ȣ�� ���� �ִٸ�, 2��
		int bonusNumber = this.winningLotto.getBonusNumber();
		if (cnt == 5 && isWinningBonusNumber(purchasedLotto, bonusNumber)) {
			return 2;
		}
		// ���ŵ� �ζǿ� ��÷ �ζ� �߿��� ���� ������ � ����
		Iterator<Integer> winningBasicNumber = this.winningLotto.getBasicNumbers().iterator();
		while (winningBasicNumber.hasNext()) {
			if (purchasedLotto.getBasicNumbers().contains(winningBasicNumber.next())) {
				cnt++;
			}
		}
		// 3�� ~ 8�� ���� ��ȯ
		return 8 - cnt;
	}

	// ���ʽ� ��ȣ�� ��ġ�ϴ���
	private boolean isWinningBonusNumber(PurchasedLotto purchasedLotto, int bonusNumber) {
		return purchasedLotto.getBasicNumbers().contains(bonusNumber);
	}
}
