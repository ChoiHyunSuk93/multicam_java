package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(42);
		HashSet lotto = new HashSet();
		
		while (lotto.size() < 6) {
			lotto.add(r.nextInt(45) + 1);
		}
		System.out.println(lotto.size());
		System.out.println(lotto);
	}

}
