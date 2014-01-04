package jsoupsample;

import java.io.File;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

public class TestJsoup {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		/*
		File input = new File("D:\\WorkSpace-personal\\input.html");
		Document doc = Jsoup.parse(input, "utf-8", "http://www.flipkart.com/books/pr?q=startup&sid=bks&as=off&as-show=off&otracker=start");
		Jsoup.parse(html, baseUri, parser)
		Parser parser = new Parser(treeBuilder)
		//Document doc = Jsoup.parse(input, "UTF-8");
		 */
		String url = "http://www.flipkart.com/books/pr?q=startup&sid=bks&as=off&as-show=off&otracker=start";
		Document doc = Jsoup.connect(url).get();
		//Elements links = doc.select("#products .gd-row .gd-col gu12 browse-product fk-inf-scroll-item, .list-unit .gd-row  .gd-col gu9, .gd-row"); // a with href
		Elements names = doc.select("#products .gd-row .gd-col gu12 browse-product fk-inf-scroll-item, .list-unit .gd-row .gd-col gu9, .lu-title-wrapper .lu-title"); // a with href
		Elements authors = doc.select("#products .gd-row .gd-col gu12 browse-product fk-inf-scroll-item, .list-unit .gd-row .gd-col gu9, .lu-title-wrapper .fk-font-11 a"); // a with href
		Elements costs = doc.select("#products .gd-row .gd-col gu12 browse-product fk-inf-scroll-item, .list-unit .gd-row .gd-col gu9, .lu-title-wrapper"); // a with href
		
		
		  // img with src ending .png
		Element name  = names.get(0);
		System.out.println(name.html());
		System.out.println("************Title *******************" );
		System.out.println(names.size());
		
		Element author  = authors.get(0);
		System.out.println(author.html());
		System.out.println("************Author *******************" );
		System.out.println(authors.size());
		/*
		Elements pngs = doc.select("img[src$=.png]");
		Element masthead = doc.select("div.masthead").first();
		  // div with class=masthead

		Elements resultLinks = doc.select("h3.r > a"); // direct a after h3
		System.out.println("************Links *******************" );
		System.out.println(links.size());
		System.out.println("************Pngs *******************" );
		System.out.println(pngs);
		System.out.println("************MastHead *******************" );
		System.out.println(masthead);
		System.out.println("************Result Links *******************" );
		System.out.println(resultLinks);
		*/
	}

}
