package kr.ac.hs.se.module;

import java.util.ArrayList;
import java.util.List;

import kr.ac.hs.se.model.PurchasedLotto;
import kr.ac.hs.se.model.WinningLotto;

public class LottoModule {

	private List<PurchasedLotto> purchasedLottoList;
	private WinningLotto winningLotto;

	public LottoModule() {
		this.purchasedLottoList = new ArrayList<>();
		this.winningLotto = new WinningLotto();
	}

	public List<PurchasedLotto> getPurchasedLottoList() {
		return this.purchasedLottoList;
	}

	public void setPurchasedLottoList(int n) {
		for (int i = 0; i < n; i++) {
			this.purchasedLottoList.add(new PurchasedLotto());
		}
	}

	public int whatIsRanking(PurchasedLotto purchasedLotto) {
		int cnt = 0;
		// ���ŵ� �ζǿ� ��÷ �ζǰ� ������, 1��
		if (purchasedLotto.getNumbers().containsAll(this.winningLotto.getNumbers())) {
			return 1;
		}
		// ���ŵ� �ζǿ� ��÷ �ζǰ� 5�� �����鼭 ���ʽ� ��ȣ�� ���� �ִٸ�, 2��
		int bonusNumber = this.winningLotto.getBonusNumber();
		if (cnt == 5 && isWinningBonusNumber(purchasedLotto, bonusNumber)) {
			return 2;
		}
		// ���ŵ� �ζǿ� ��÷ �ζ� �߿��� ���� ������ � ����
		for (int i = 0; i < this.winningLotto.getNumbers().size(); i++) {
			if (purchasedLotto.getNumbers().contains(this.winningLotto.getNumbers().get(i))) {
				cnt++;
			}
		}
		// 3�� ~ 8�� ���� ��ȯ
		return 8 - cnt;
	}

	private boolean isWinningBonusNumber(PurchasedLotto purchasedLotto, int bonusNumber) {
		if (purchasedLotto.getNumbers().contains(bonusNumber)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		String outputStr = "";
		// ��÷ ��ȣ ���
		outputStr += winningLotto;
		// ���ŵ� �ζ� ����Ʈ ���
		for (PurchasedLotto purchasedLotto : purchasedLottoList) {
			int rank = whatIsRanking(purchasedLotto);
			if (5 < rank) {
				outputStr += purchasedLotto + "-> ��÷\n";
			} else {
				outputStr += purchasedLotto + "-> " + rank + "\n";
			}
		}
		return outputStr;
	}
}
