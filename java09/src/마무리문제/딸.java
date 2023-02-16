package 마무리문제;

public class 딸 {
	String name;
	char gender;

	static int wallet = 10000;
	static int count;

	public 딸(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
		count++;
		wallet = wallet - 1000;
	}

	public void tv보다() {
		System.out.println("TV를 본다.");
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
	

}
