package 상속기본;

public class FlyCarUse {

	public static void main(String[] args) {

		FlyCar fly = new FlyCar();
		fly.color = "red";
		fly.fly = true;
		fly.run();
		fly.fly();
		System.out.println(fly);

	}

}
