package 상속기본;

public class FlyCar extends Car {
	boolean fly;
	public void fly() {
		System.out.println("하늘을 날다.");
	}
	@Override
	public String toString() {
		return "FlyCar [fly=" + fly + ", color=" + color + "]";
	}
}
