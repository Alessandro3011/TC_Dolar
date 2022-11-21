package Scraping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ScrapingWeb {

	public static Document getHTML(String url) {
		Document html = null;
		try {
			html = Jsoup.connect(url).get();
		} catch(Exception e) {
			System.out.println("Error al obtener el codigo HTML");
		}
		
		return html;
	}
	public void scraping() {
		Elements precio = ScrapingWeb.getHTML("https://www.google.com/search?q=precio+del+dolar+en+peru&sxsrf=ALiCzsa97UyyX9P_gI-O3xdDCe2fm_i16w%3A1667924659134&ei=s4JqY4_nB_3c5OUPwv2n2Ao&oq=precio+del+&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAxgAMg8IABCxAxCDARBDEEYQggIyCggAELEDEIMBEEMyCggAELEDEIMBEEMyCggAELEDEIMBEEMyBwgAELEDEEMyBAgAEEMyBAgAEEMyCAgAEIAEELEDMgoIABCxAxCDARBDMggIABCABBCxAzoKCAAQRxDWBBCwAzoHCAAQsAMQQzoNCAAQ5AIQ1gQQsAMYAToSCC4QxwEQ0QMQyAMQsAMQQxgCOgQILhAnOgQIIxAnOgcILhDUAhBDOgQILhBDOgsIABCABBCxAxCDAToFCAAQgAQ6BwgAEIAEEAo6CggAEIAEEIcCEBQ6CggAEIAEEMkDEAo6DAgAEIAEEAoQRhCCAjoNCAAQgAQQsQMQgwEQCjoICAAQsQMQgwE6DQguEIAEELEDENQCEAo6CggAEIAEELEDEApKBAhBGABKBAhGGAFQ4RtYp3lg_Y0BaAdwAHgAgAFuiAGDCpIBBDE0LjKYAQCgAQHIARPAAQHaAQYIARABGAnaAQYIAhABGAg&sclient=gws-wiz-serp").select("span.DFlfde.SwHCTb");
		for (Element element : precio) {
			try {
				String span = element.select("span").text();
				
				System.out.println(span);
			}catch (Exception e) {
				System.out.println("Error al entrar la tabla");
			}
		}
		
	}
	public static void main(String[] args) {
		new ScrapingWeb().scraping();
	}
}