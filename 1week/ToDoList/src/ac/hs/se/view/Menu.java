package ac.hs.se.view;

public class Menu implements View {

	@Override
	public void show() {
		out.print("\n\n");
		out.println("��������������������������������������������������������������������������������������");
		out.println("��                   Menu                  ��");
		out.println("��������������������������������������������������������������������������������������");
		out.println("1. �� �� �߰�");
		out.println("2. �� �� ����");
		out.println("3. �� �� ����");
		out.println("4. �� �� ��ȸ");
		out.println("5. ������");
		out.print(">> ");
	}
}