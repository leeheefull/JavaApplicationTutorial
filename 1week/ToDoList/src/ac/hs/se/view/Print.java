package ac.hs.se.view;

public class Print implements View {

	@Override
	public void show() {
		print.lineBreak("");
		out.println("\t\tToDo");
		out.println("��ȣ\t��¥\t\t�� ��");
		for (int i = 0; i < toDoList.size(); i++) {
			if (toDoList.get(i).getStatus().equals("toDo")) {
				out.println(toDoList.get(i));
			}
		}
		print.lineBreak("");
		out.println("\t\tDoing");
		out.println("��ȣ\t��¥\t\t�� ��");
		for (int i = 0; i < toDoList.size(); i++) {
			if (toDoList.get(i).getStatus().equals("doing")) {
				out.println(toDoList.get(i));
			}
		}
		print.lineBreak("");
		out.println("\t\tDone");
		out.println("��ȣ\t��¥\t\t�� ��");
		for (int i = 0; i < toDoList.size(); i++) {
			if (toDoList.get(i).getStatus().equals("done")) {
				out.println(toDoList.get(i));
			}
		}
		print.lineBreak("");
	}
	
	public void lineBreak(String output) {
		out.println("����������������������������������������" + output + "����������������������������������������");
	}
}