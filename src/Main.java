abstract class Person {
	public static int objectsCount = 0;
	protected String lastname;
	protected int age;
	protected float service;

	public Person(String lastname, int age, float service) {
		super();
		this.lastname = lastname;
		this.age = age;
		this.service = service;
		objectsCount++;
	}

	public Person() {
		this("", 0, 0);
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getService() {
		return service;
	}

	public void setService(float service) {
		this.service = service;
		if (service < 0) {
			System.out.println("Work experience must be positive number.");
		}
	}

}

public class Main {

	public static void main(String[] args) {
		Professor ivanov = new Professor("Ivanov", 56, 30, "TU", "Doctor");
		ivanov.degr();
		ivanov.check();
		ivanov.exams();
		System.out.println("Objects count: " + Person.objectsCount);
		System.out.println();

		Assistant petrov = new Assistant("Petrov", 26, 2, "TU", false);
		petrov.assist();
		petrov.check();
		petrov.exams();
		petrov.article();
		System.out.println("Objects count: " + Person.objectsCount);
		System.out.println();

		SchoolTeacher georgiev = new SchoolTeacher("Georgiev", 32, 6, "maths",
				new String[] { "2B", "3A", "4D", "", "" });
		georgiev.groups();
		georgiev.entertain();
		georgiev.check();
		System.out.println("Objects count: " + Person.objectsCount);
		System.out.println();

		CollegeTeacher iliev = new CollegeTeacher("Iliev", 40, 10, "finance", "BFC");
		iliev.subject();
		iliev.college();
		iliev.check();
		System.out.println("Objects count: " + Person.objectsCount);
		System.out.println();

	}
}
