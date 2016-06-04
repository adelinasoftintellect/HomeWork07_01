
class CollegeTeacher extends Teacher {
	private String college;

	public CollegeTeacher(String lastname, int age, float service, String subject, String college) {
		super(lastname, age, service, subject);
		this.college = college;
	}

	public CollegeTeacher() {
		this("", 0, 0, "", "");

	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	public void college() {
		System.out.println("The college teacher is teaching in: " + this.college);
	}
	public void check() {
		System.out.println("The teacher is checking homework.");
	}

}
