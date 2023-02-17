package 상속기본;

public class 볼펜 extends 학용품{
	int thickness;
	
	public void 글을쓰다() {
		System.out.println("글씨를 씁니다.");
		
		
		
	}

	@Override
	public String toString() {
		return "볼펜 [thickness=" + thickness + ", price=" + price + ", company=" + company + "]";
	}
}
