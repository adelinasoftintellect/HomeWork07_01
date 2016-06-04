
class Teacher extends Person implements Checkable{
	private String subject;

	public Teacher(String lastname, int age, float service, String subject) {
		super(lastname, age, service);
		this.subject = subject;
	}

	public Teacher() {
		this("", 0, 0, "");
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void subject() {
		System.out.println("The teacher is teaching " + this.subject);
	}
	public void check() {
		System.out.println("The teacher is checking homework.");
	}

	public void greetday() {
		System.out.println("Good afternoon!");
	}

	public void goodbye() {
		System.out.println("Goodbye!");
		System.out.println();
	}
}
