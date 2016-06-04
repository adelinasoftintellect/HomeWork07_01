
class Assistant extends Lecturer {
	private boolean assistant;

	public Assistant(String lastname, int age, float service, String uniname, boolean assistant) {
		super(lastname, age, service, uniname);
		this.assistant = assistant;
	}

	public Assistant() {
		this("", 0, 0, "", true);
	}

	public boolean isAssistant() {
		return assistant;
	}

	public void setAssistant(boolean assistant) {
		this.assistant = assistant;
	}

	public void assist() {
		System.out.println("The Assistant Lastname is: " + this.lastname);
		System.out.println("Is " + this.lastname + " Chief assistant? " + assistant);
	}

	public void check() {
		System.out.println("The assistant is checking homework.");
	}

	public void exams() {
		System.out.println("The assistant is checking  exams.");
	}

	public void article() {
		System.out.println("The assistant is able to write scientific articles.");
	}
}
