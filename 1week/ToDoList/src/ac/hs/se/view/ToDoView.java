package ac.hs.se.view;

import java.util.List;

import ac.hs.se.model.ToDo;
import ac.hs.se.model.ToDoStatus;
import ac.hs.se.util.ToDoConstants.Menu;

public class ToDoView {

	public void showMenu() {
		System.out.print("\n\n");
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.println("��                   Menu                  ��");
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.println("1. �� �� �߰�");
		System.out.println("2. �� �� ����");
		System.out.println("3. �� �� ����");
		System.out.println("4. �� �� ��ȸ");
		System.out.println("5. ������");
		System.out.print(">> ");
	}

	public void showInput(String menu) {
		switch (menu) {
		case Menu.INSERT:
			System.out.print("1. �߰��� ������ �Է��Ͻÿ�.\n>> ");
			break;
		case Menu.UPDATE:
			System.out.print("2. ������ ��ȣ�� �Է��Ͻÿ�.\n>> ");
			break;
		case Menu.DELETE:
			System.out.print("3. ������ ��ȣ�� �Է��Ͻÿ�.\n>> ");
			break;
		}
	}

	public void showAttribute(ToDoStatus todo) {
		System.out.println(todo);
		System.out.println("��ȣ\t��¥\t\t�� ��");
	}

	public void showToDoList(List<ToDo> list) {
		list.forEach(System.out::println);
	}

	public void lineBreak() {
		System.out.println("��������������������������������������������������������������������������������");
	}

	public void showMessage(String message) {
		System.out.println("��������������������������������������" + message + "������������������������������������");
	}
}
