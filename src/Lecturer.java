
class Lecturer extends Person implements Checkable {
	private String uniname;
	private int number = 10;

	public Lecturer(String lastname, int age, float service, String uniname) {
		super(lastname, age, service);
		this.uniname = uniname;
		this.number = number;
	}

	public Lecturer() {
		this("", 0, 0, "");
	}
	

	public String getUniname() {
		return uniname;
	}

	public void setUniname(String uniname) {
		this.uniname = uniname;
	}

	public void check() {
		System.out.println("The lecturer is checking homework.");
	}

	public void greetday() {
		System.out.println("Good afternoon!");
	}

	public void exercise() {
		System.out.println("There will be lectures today.");
	}

	public void exercise(String math) {
		math = "Monday";
		System.out.println("Math lectures are every" + math);
	}

	public void exercise(String math, String physics) {
		math = "Monday";
		physics = "Friday";
		System.out.println("Math lectures are every" + math + ", physics are every" + physics);
	}

}
