
public class Classroom {

	String idClassroom, name, idAdvisor;

	public Classroom(String idClassroom, String name, String idAdvisor) {
		super();
		this.idClassroom = idClassroom;
		this.name = name;
		this.idAdvisor = idAdvisor;
	}

	private void showRoom() {
		System.out.println("[1] �����Ţ��ͧ  : " + idClassroom);
		System.out.println("[2] ������ͧ            : " + name);
		System.out.println("[3] �����Ţ��ͧ  : " + idAdvisor);
	}

	public void DBSearch(String idClassroom) {
		this.idClassroom = idClassroom;
		if (idClassroom.equals("584277"))
			name = "������蹤�������������������� ��2";
		else if (idClassroom.equals("594277"))
			name = "������蹤�������������������� ��1";
		else if (idClassroom.equals("574277"))
			name = "������蹤�������������������� ��3";
		else if (idClassroom.equals("564277"))
			name = "������蹤�������������������� ��4";
		else
			name = "����Һ";

		showRoom();
	}

	public static void main(String[] args) {
		Classroom c = new Classroom("584277", "������鹤���������������������2", "001");
		c.DBSearch("574277");
	}

}
