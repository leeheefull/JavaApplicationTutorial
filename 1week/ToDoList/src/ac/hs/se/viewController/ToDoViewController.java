package ac.hs.se.viewController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import ac.hs.se.model.ToDo;

public class ToDoViewController {
	private ArrayList<ToDo> toDoList;
	private int cnt = 1;

	public ToDoViewController() {
		this.toDoList = new ArrayList<ToDo>();
		this.init();
	}

	public void init() {
		toDoList.add(new ToDo(cnt++, "2020-12-20", "�ڹ� �����ϱ�"));
		toDoList.add(new ToDo(cnt++, "2020-12-22", "������ �����ϱ�"));
		toDoList.add(new ToDo(cnt++, "2020-12-24", "��� �����ϱ�"));
		toDoList.add(new ToDo(cnt++, "2020-12-26", "�˰��� ����Ǯ��"));
	}

	public void printMenu() {
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

	public void executeMenu() {
		boolean keepLoop = true;
		while (keepLoop) {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				this.printMenu();
				int menu;
				menu = Integer.parseInt(br.readLine());
				switch (menu) {
				case 1:
					this.add();
					break;
				case 2:
					this.update();
					break;
				case 3:
					this.delete();
					break;
				case 4:
					this.print();
					break;
				case 5:
					System.out.println("����������������������������������������END����������������������������������������");
					keepLoop = false;
					break;
				default:
					System.out.println("������������������������������������������������������������������������������������");
				}
			} catch (NumberFormatException | IOException e) {
				System.out.println("������������������������������������������������������������������������������������");
			}
		}
	}

	private void add(String content) {
		toDoList.add(new ToDo(cnt++, content));
	}

	public void add() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\n��������������������������������������������������������������������������������������");
			System.out.print("1. �߰��� ������ �Է��Ͻÿ�.\n>> ");
			this.add(br.readLine());
			System.out.println("��������������������������������������������������������������������������������������");
		} catch (IOException e) {
			System.out.println("������������������������������������������������������������������������������������");
		}
	}

	private void update(int id) {
		for (int i = 0; i < toDoList.size(); i++) {
			if (toDoList.get(i).getStatus().equals("toDo") && toDoList.get(i).getId() == id) {
				toDoList.get(i).setStatus("doing");
			} else if (toDoList.get(i).getStatus().equals("doing") && toDoList.get(i).getId() == id) {
				toDoList.get(i).setStatus("done");
				return;
			}
		}
	}

	public void update() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			this.print();
			System.out.print("2. ������ ��ȣ�� �Է��Ͻÿ�.\n>> ");
			this.update(Integer.parseInt(br.readLine()));
			System.out.println("��������������������������������������������������������������������������������������");
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println("������������������������������������������������������������������������������������");
		}
	}

	private void delete(int id) {
		for (int i = 0; i < toDoList.size(); i++) {
			if (toDoList.get(i).getId() == id) {
				toDoList.remove(i);
			}
		}
	}

	public void delete() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			this.print();
			System.out.print("3. ������ ��ȣ�� �Է��Ͻÿ�.\n>> ");
			this.delete(Integer.parseInt(br.readLine()));
			System.out.println("��������������������������������������������������������������������������������������");
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println("������������������������������������������������������������������������������������");
		}
	}

	public void print() {

		System.out.println("\n��������������������������������������������������������������������������������������");
		System.out.println("\t\tToDo");
		System.out.println("��ȣ\t��¥\t\t�� ��");
		for (int i = 0; i < toDoList.size(); i++) {
			if (toDoList.get(i).getStatus().equals("toDo")) {
				System.out.println(toDoList.get(i));
			}
		}
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.println("\t\tDoing");
		System.out.println("��ȣ\t��¥\t\t�� ��");
		for (int i = 0; i < toDoList.size(); i++) {
			if (toDoList.get(i).getStatus().equals("doing")) {
				System.out.println(toDoList.get(i));
			}
		}
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.println("\t\tDone");
		System.out.println("��ȣ\t��¥\t\t�� ��");
		for (int i = 0; i < toDoList.size(); i++) {
			if (toDoList.get(i).getStatus().equals("done")) {
				System.out.println(toDoList.get(i));
			}
		}
		System.out.println("��������������������������������������������������������������������������������������");
	}
}