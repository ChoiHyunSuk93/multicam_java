package 주식정보시스템;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링부품 {

	public void naver(String code2) {

		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code2);
		// 삼성전자

		Document doc = null;
		try {
			doc = con.get(); // html코드를 다 가지고온다.!
			Elements codeList = doc.select(".code");
			Element tag = codeList.get(0);
			String code = tag.text();
			System.out.println("코드는 " + code);

			Elements list = doc.select("span.blind");
			Element tag2 = list.get(12);
			String today = tag2.text();
			System.out.println("현재가 " + today);

			Element tag3 = list.get(20);
			String low = tag3.text();
			System.out.println("최저가 " + low);

			Element tag4 = list.get(16);
			String high = tag4.text();
			System.out.println("최고가 " + high);
			
			FileWriter file = new FileWriter(code2 + ".txt");
			file.write("코드명 " + code2 + "\n");
			file.write("현재가 " + today + "\n");
			file.write("최저가 " + low + "\n");
			file.write("최고가 " + high + "\n");
			file.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
