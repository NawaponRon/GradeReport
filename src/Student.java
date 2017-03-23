
public class Student {
	String idStudent, name, password, idClassroom;

	public Student(String idStudent, String name, String password, String idClassroom) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.password = password;
		this.idClassroom = idClassroom;
	}

	private void modify(String name1, String password1, String idclassroom1) {
		name = name1;
		password = password1;
		idClassroom = idclassroom1;

	}

	public String getIdStudent() {
		return idStudent;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getIdClassroom() {
		return idClassroom;
	}

	private void show() {
		System.out.println("[1] รหัสนักศึกษา : " + getIdStudent());
		System.out.println("[2] ชื่อ : " + getName());
		System.out.println("[3] รหัสผ่าน : " + getPassword());
		System.out.println("[4] รหัสห้อง : " + getIdClassroom());
	}

	public void DBSearch(String idStu) {
		if (idStu.equals("584277001"))
			modify("นฤมล", "pass", "584277");
		else if (idStu.equals("584277002"))
			modify("โกศิลป์", "pass", "584277");
		else if (idStu.equals("584277003"))
			modify("ดุสิต", "pass", "584277");
		else if (idStu.equals("584277004"))
			modify("นวพล", "pass", "584277");
		else if (idStu.equals("584277005"))
			modify("ภูมินทร์", "pass", "584277");
		else
			modify("ยุรนันท์", "pass", "584277");

		idStudent = idStu;
		show();
	}

	public static void main(String[] args) {
		Student s = new Student("584277004", "นวพล", "pass1234", "584277");
		Classroom c = new Classroom ("","","001");
		s.DBSearch("584277001");
		c.DBSearch(s.idClassroom);
	}

}
