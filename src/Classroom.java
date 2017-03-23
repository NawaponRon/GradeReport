
public class Classroom {

	String idClassroom, name, idAdvisor;

	public Classroom(String idClassroom, String name, String idAdvisor) {
		super();
		this.idClassroom = idClassroom;
		this.name = name;
		this.idAdvisor = idAdvisor;
	}

	private void showRoom() {
		System.out.println("[1] หมายเลขห้อง  : " + idClassroom);
		System.out.println("[2] ชื่อห้อง            : " + name);
		System.out.println("[3] หมายเลขห้อง  : " + idAdvisor);
	}

	public void DBSearch(String idClassroom) {
		this.idClassroom = idClassroom;
		if (idClassroom.equals("584277"))
			name = "ความมั่นคงคอมพิวเตอร์เเละไซเบอร์ ปี2";
		else if (idClassroom.equals("594277"))
			name = "ความมั่นคงคอมพิวเตอร์เเละไซเบอร์ ปี1";
		else if (idClassroom.equals("574277"))
			name = "ความมั่นคงคอมพิวเตอร์เเละไซเบอร์ ปี3";
		else if (idClassroom.equals("564277"))
			name = "ความมั่นคงคอมพิวเตอร์เเละไซเบอร์ ปี4";
		else
			name = "ไม่ทราบ";

		showRoom();
	}

	public static void main(String[] args) {
		Classroom c = new Classroom("584277", "ความมั้นคงคอมพิวเตอร์เเละไซเบอร์ปี2", "001");
		c.DBSearch("574277");
	}

}
