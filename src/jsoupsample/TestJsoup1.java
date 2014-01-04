package jsoupsample;

import java.io.File;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Whitelist;
import org.jsoup.select.Elements;

public class TestJsoup1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		crossword();
		/*
		File input = new File("D:\\WorkSpace-personal\\input.html");
		Document doc = Jsoup.parse(input, "utf-8", "http://www.flipkart.com/books/pr?q=startup&sid=bks&as=off&as-show=off&otracker=start");
		Jsoup.parse(html, baseUri, parser)
		Parser parser = new Parser(treeBuilder)
		//Document doc = Jsoup.parse(input, "UTF-8");
		 
		String url = "http://www.flipkart.com/books/pr?q=startup&sid=bks&as=off&as-show=off&otracker=start";
		Document doc = Jsoup.connect(url).get();
		//Elements links = doc.select("#products .gd-row .gd-col gu12 browse-product fk-inf-scroll-item, .list-unit .gd-row  .gd-col gu9, .gd-row"); // a with href
		Elements bookObjs = doc.select("#products div.gd-row div.gd-col gu12 browse-product fk-inf-scroll-item, div.list-unit"); // a with href
		Elements authors = doc.select("#products .gd-row .gd-col gu12 browse-product fk-inf-scroll-item, .list-unit .gd-row .gd-col gu9, .lu-title-wrapper .fk-font-11 a"); // a with href
		Elements costs = doc.select("#products .gd-row .gd-col gu12 browse-product fk-inf-scroll-item, .list-unit .gd-row .gd-col gu9, .lu-title-wrapper"); // a with href
		
		
		  // img with src ending .png
		//Element book  = bookObjs.get(0);
		System.out.println("No of Books in result"+bookObjs.size());
		Whitelist whitelist = Whitelist.none();
		for(Element book:bookObjs){
			
			System.out.println("************ Title *******************" );
			String title = Jsoup.clean(book.select("a.lu-title").html(), whitelist);			
			System.out.println(title);
			
			System.out.println("************ Author *******************" );
			System.out.println(book.select("span a").html());
			
			System.out.println("************ Price *******************" );
			System.out.println(book.select(".pu-price div.pu-final").html());
		}
		
		/*
		Element author  = authors.get(0);
		System.out.println(author.html());
		System.out.println("************Author *******************" );
		System.out.println(authors.size());
		
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
	
	public static void crossword() throws Exception{
		
		String url = "http://www.crossword.in/books/search?q=gatsby";
		Document doc = Jsoup.connect(url).get();
		//Retrieves the list of divs for each result as elements
		Elements bookObjs = doc.select("#search-result-items .variant-desc");
		
		System.out.println("Number of Books in result :: "+bookObjs.size());
		Whitelist whitelist = Whitelist.none();
			 
		for(Element book:bookObjs){
			
			System.out.println("************ Title *******************" );
			System.out.println(book.select(".variant-title a").html());
			
			System.out.println("************ Author *******************" );
			System.out.println(book.select(".contributors .ctbr-name a").html());		
			
			System.out.println("************ Price *******************" );	
			System.out.println(Jsoup.clean(book.select(".price .variant-final-price").html(), whitelist));
			
		}
		
		
		
	}

}
