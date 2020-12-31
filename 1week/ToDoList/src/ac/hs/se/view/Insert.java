package ac.hs.se.view;

import java.io.IOException;

import ac.hs.se.model.ToDo;

public class Insert implements View {

	private void insert(String content) {
		toDoList.add(new ToDo(content));
	}

	@Override
	public void show() {
		try {
			print.lineBreak("");
			out.print("1. �߰��� ������ �Է��Ͻÿ�.\n>> ");
			insert(br.readLine());
			print.lineBreak("");
		} catch (IOException e) {
			print.lineBreak("Error");
		}
	}
}