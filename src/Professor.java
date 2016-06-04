
class Professor extends Lecturer {
	private String degree;

	public Professor(String lastname, int age, float service, String uniname, String degree) {
		super(lastname, age, service, uniname);
		this.degree = degree;
	}

	public Professor() {
		this("", 0, 0, "", "");
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public void degr() {
		System.out.println("Professor's degree is " + this.degree);
		System.out.println("Professor's work experience is " + this.service + " years.");
	}

	public void check() {
		System.out.println("The professor is checking homework.");
	}

	public void exams() {
		System.out.println("The professor is doing exams.");

	}
}
