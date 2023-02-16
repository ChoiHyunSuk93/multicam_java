package 상속;

public class 원더우먼 extends 우먼{
	boolean fly;
	
	public void fight() {
		think();
		System.out.println("싸우다.");
	}

	@Override
	public String toString() {
		return "원더우먼 [fly=" + fly + ", brain=" + brain + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
