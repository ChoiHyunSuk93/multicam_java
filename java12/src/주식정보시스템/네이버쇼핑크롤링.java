package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버쇼핑크롤링 {

	public static void main(String[] args) {

		Connection con = Jsoup.connect("https://shopping.naver.com/home");

		Document doc = null;
		try {
			doc = con.get();

			Elements menuList = doc.select("._lnb_text_3f3tB");
			System.out.println(menuList.size());

			for (int i = 0; i < menuList.size(); i++) {
				Element tag = menuList.get(i);
				String menu = tag.text();
				System.out.println(menu);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
