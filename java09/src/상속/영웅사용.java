package 상속;

public class 영웅사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		사람 p = new 사람();
		p.name = "홍길동";
		p.age = 100;
		System.out.println(p);
		p.eat();

		맨 m = new 맨();
		m.run();

		수퍼맨 s = new 수퍼맨();
		s.name = "클라크";
		s.fly = true;
		s.power = 1000;
		s.age = 200;

		s.space();
		System.out.println(s);
		s.eat();
		
		원더우먼 wonder = new 원더우먼();
		wonder.fly = true;
		wonder.brain = 100;
		wonder.name = "원더우먼";
		wonder.age = 20;
		
		System.out.println(wonder);
		wonder.fight();
		

	}

}
