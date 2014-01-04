package jsoupsample;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Whitelist;
import org.jsoup.select.Elements;



public class ExtractSerachResultsOld {
	
	static String site;	
	static String searchString;	
	static String url;
	
	static String listExtractor;
	static String titleExtractor;
	static String authorExtractor;
	static String costExtractor;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		System.out.println("Enter command");		
		Scanner scanner = new Scanner(System.in); 
		boolean res = true;
		do{		          
	        String command = scanner.nextLine();  
	        command =  command.trim(); 
	        if(command.equalsIgnoreCase("exit")){
	        	break;
	        }
	        res = processValidateCmd(command); 
	        if(!res) break;
	        List<Book> books = null;
	        
	        if(site.equalsIgnoreCase("flipcart")){
	        	listExtractor = ExtractorStrings.flipCartListExtractor;
	        	titleExtractor = ExtractorStrings.flipCartBookTitleExtractor;
	        	authorExtractor = ExtractorStrings.flipCartBookAuthorExtractor;
	        	costExtractor = ExtractorStrings.flipCartBookCostExtractor;
	        	
	        	books =  flipCart(searchString);	    		
	        }else if(site.equalsIgnoreCase("crossword")){
	        	books = crossword(searchString);
	        }
	        
	        if(books!=null && books.size()>0){
    			displayBooks(books);
    		}else{
    			System.out.println("There are no books for the given search criteria");
    		}
		}while(res);
	}
	
	public static void buildDetails(String site){
		StringBuilder urlString;
		
		if(site.equalsIgnoreCase("flipcart")){
        	listExtractor = ExtractorStrings.flipCartListExtractor;
        	titleExtractor = ExtractorStrings.flipCartBookTitleExtractor;
        	authorExtractor = ExtractorStrings.flipCartBookAuthorExtractor;
        	costExtractor = ExtractorStrings.flipCartBookCostExtractor;
        	
        	urlString = new StringBuilder(ExtractorStrings.flipCartUrlHead);
        	urlString.append(searchString).append(ExtractorStrings.flipCartUrlTail);
        	url = urlString.toString();        	
        		    		
        }else if(site.equalsIgnoreCase("crossword")){
        	listExtractor = ExtractorStrings.crossWordListExtractor;
        	titleExtractor = ExtractorStrings.crossWordBookTitleExtractor;
        	authorExtractor = ExtractorStrings.crossWordBookAuthorExtractor;
        	costExtractor = ExtractorStrings.crossWordBookCostExtractor;
        	        	
    		urlString = new StringBuilder(ExtractorStrings.crossWordBaseUrl);
    		urlString.append(searchString);
    		url = urlString.toString();  
        }
		
	}
	
	/**
	 * This method prints the result by taking books
	 * @param books
	 * @throws Exception
	 */
	public static void displayBooks (List<Book> books) throws Exception{
		System.out.println("Number of Books in result :: "+books.size());
		for(Book book:books){
			System.out.println(book);;
		}
		System.out.println("\n");
	}
	
	/**
	 * This method is used to fetch the books result from given site with given search string
	 * @param searchString
	 * @return
	 * @throws Exception
	 */
	public static List<Book> getBooks(String searchString) throws Exception{
			
		Document doc = Jsoup.connect(url.toString()).get();
		//Retrieves the list of divs for each result as elements
		Elements bookObjs = doc.select(listExtractor);		
		
		
		Whitelist whitelist = Whitelist.none();
		List<Book> books = new ArrayList<Book>();
		for(Element bookObj:bookObjs){
			Book book = new Book(Jsoup.clean(bookObj.select(titleExtractor).html(), whitelist),
								 Jsoup.clean(bookObj.select(authorExtractor).html(), whitelist),
								 Jsoup.clean(bookObj.select(costExtractor).html(), whitelist));
			books.add(book);
		}
		return books.size()>0?books:null;

	}
	
	/**
	 * This method is used to fetch the books result from flip cart with given search string
	 * @param searchString
	 * @return
	 * @throws Exception
	 */
	public static List<Book> flipCart(String searchString) throws Exception{
		
		final String flipCartRemainingUrlHead = "http://www.flipkart.com/books/pr?q=";
		final String flipCartRemainingUrlTail = "&sid=bks&as=off&as-show=off&otracker=start"; 
		StringBuilder url = new StringBuilder(flipCartRemainingUrlHead);
		url.append(searchString).append(flipCartRemainingUrlTail);
		
		Document doc = Jsoup.connect(url.toString()).get();
		//Retrieves the list of divs for each result as elements
		Elements bookObjs = doc.select(ExtractorStrings.flipCartListExtractor);		
		
		
		Whitelist whitelist = Whitelist.none();
		List<Book> books = new ArrayList<Book>();
		for(Element bookObj:bookObjs){
			Book book = new Book(Jsoup.clean(bookObj.select(ExtractorStrings.flipCartBookTitleExtractor).html(), whitelist),
								 Jsoup.clean(bookObj.select(ExtractorStrings.flipCartBookAuthorExtractor).html(), whitelist),
								 Jsoup.clean(bookObj.select(ExtractorStrings.flipCartBookCostExtractor).html(), whitelist));
			books.add(book);
		}
		return books.size()>0?books:null;

	}
	
	/**
	 * This method is used to fetch the books result from cross word with given search string
	 * @param searchString
	 * @return
	 * @throws Exception
	 */
	public static List<Book> crossword(String searchString) throws Exception{
		
		final String crossWordBaseUrl = "http://www.crossword.in/books/search?q=";
		StringBuffer url = new StringBuffer(crossWordBaseUrl);
		url.append(searchString);
		
		Document doc = Jsoup.connect(url.toString()).get();
		//Retrieves the list of divs for each result as elements
		Elements bookObjs = doc.select(ExtractorStrings.crossWordListExtractor);
		Whitelist whitelist = Whitelist.none();	
		List<Book> books = new ArrayList<Book>();
		for(Element bookObj:bookObjs){
			Book book = new Book(Jsoup.clean(bookObj.select(ExtractorStrings.crossWordBookTitleExtractor).html(), whitelist),
								 Jsoup.clean(bookObj.select(ExtractorStrings.crossWordBookAuthorExtractor).html(), whitelist),
								 Jsoup.clean(bookObj.select(ExtractorStrings.crossWordBookCostExtractor).html(), whitelist));
			books.add(book);
		}		
		return books.size()>0?books:null;
	}
	
	/**
	 * This method will process the command, splits the values and then check for supported validation 
	 * @param cmd
	 * @return true if valid else returns false
	 */
	public static boolean processValidateCmd(String cmd){
		
		boolean res = false;
		site = cmd.split(" ")[0];
	    searchString = cmd.split(" ")[1];
	    if(site.length()>0 && searchString.length()>0){
	    	 if(site.equalsIgnoreCase("flipcart") || site.equalsIgnoreCase("crossword")){
	    		 res = true;
	    	 }else{
	    		 System.err.println("We are not supporting this site search now.");
	    		 return false;
	    	 }
	    }else{
	    	System.err.println("Please provide valid command");
	    	return false;
	    }
		return res;
		
		
	}
	
}
