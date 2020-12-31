package ac.hs.se.main;

import ac.hs.se.model.ToDo;
import ac.hs.se.resource.R;

public class ToDoConsole implements R {

	public static void main(String[] args) {
		try {
			listInit();
			toDoController.process();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void listInit() {
		toDoList.add(new ToDo("2020-12-20", "�ڹ� �����ϱ�"));
		toDoList.add(new ToDo("2020-12-22", "������ �����ϱ�"));
		toDoList.add(new ToDo("2020-12-24", "��� �����ϱ�"));
		toDoList.add(new ToDo("2020-12-26", "�˰��� ����Ǯ��"));
	}
}