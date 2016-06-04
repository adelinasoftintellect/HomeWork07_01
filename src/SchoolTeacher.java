import java.util.Arrays;

class SchoolTeacher extends Teacher {
	private String groups[] = new String[5];

	public SchoolTeacher(String lastname, int age, float service, String subject, String[] groups) {
		super(lastname, age, service, subject);
		this.groups = groups;
	}

	public String[] getGroups() {
		return groups;
	}

	public void setGroups(String[] groups) {
		this.groups = groups;
	}

	public void groups() {
		System.out.println(Arrays.toString(groups));
	}

	public void entertain() {
		System.out.println("The School teacher is entertaining the children.");
	}

	public void check() {
		System.out.println("The teacher is checking homework.");
	}
}
