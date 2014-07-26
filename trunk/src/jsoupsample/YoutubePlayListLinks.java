package jsoupsample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Whitelist;
import org.jsoup.select.Elements;

/*
 *youtube PL92E89440B7BFD0F6
 * div browse-items-primary 
	<ul id="pl-video-list" class=" pl-video-list" dat
		li class="pl-video yt-uix-tile " data-set-video-id="None" data-video-id="al7bRZzz4oU"
		
		
		http://www.flipkart.com/books/pr?q=java&sid=bks&as=off&as-show=off&otracker=start";
		ul.browse-items-primary 
		#browse-items-primary, ul. pl-video-list, li.pl-video yt-uix-tile 
		final static String flipCartListExtractor ="#products div.gd-row div.gd-col gu12 browse-product fk-inf-scroll-item, div.list-unit";
																gd-col gu12 browse-product fk-inf-scroll-item
	final static String flipCartBookTitleExtractor ="a.lu-title";
	final static String flipCartBookAuthorExtractor ="span a";
	final static String flipCartBookCostExtractor =".pu-price div.pu-final";
	"#browse-items-primary li ul. pl-video-list, li
	
	
	https://www.youtube.com/playlist?list=PL92E89440B7BFD0F6
 */
public class YoutubePlayListLinks {
	
	static String site;	
	static String searchString;	
	static String url;
	
	static String urlLinkExtractor;
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
		try{
			do{		          
		        String command = scanner.nextLine();  
		        command =  command.trim(); 
		        if(command.equalsIgnoreCase("exit")){
		        	break;
		        }
		        /*Validating the command with basic validations and available sites */
		        res = processValidateCmd(command); 
		        if(!res) break;
		        
		        
		        List<String> links = null;
		        
		        //Building the details based on the given site
		        buildDetails(site);
		        
		        //Getting the details from the given site and search String, this method will be using the details built by above step
		        links = getLinksList();
		        
		        if(links!=null && links.size()>0){
		        	//Displaying the books result
	    			displayLinks(links);
	    		}else{
	    			System.out.println("There are no books for the given search criteria");
	    		}
			}while(res);
		}catch (Exception ex) {
			System.err.println("There seems to be some problem with excetuion, Can you please try again");
			System.err.println(ex.getMessage());
		}	
	}
	
	/**
	 * This method is used to fetch the books result from given site with given search string
	 * @param searchString
	 * @return
	 * @throws Exception
	 */
	public static List<String> getLinksList() throws Exception{
		List<String> links=new ArrayList<String>();
		try{
			Document doc = Jsoup.connect(url.toString()).get();
			//Retrieves the list of divs for each result as elements
			Elements linkObjs = doc.select(listExtractor);	
			Whitelist whitelist = Whitelist.none();
			
			for(Element linkObj:linkObjs){
				
				String link = new String(Jsoup.clean(linkObj.select(titleExtractor).html(), whitelist));
				links.add(link);
			}
		}catch (Exception e) {
			throw new Exception(e.getMessage(), e);
		}	
		return links.size()>0?links:null;

	}
	
	/**
	 * This method is used to fetch the books result from given site with given search string
	 * @param searchString
	 * @return
	 * @throws Exception
	 */
	public static List<Book> getBooks() throws Exception{
		List<Book> books=new ArrayList<Book>();
		try{
			Document doc = Jsoup.connect(url.toString()).get();
			//Retrieves the list of divs for each result as elements
			Elements bookObjs = doc.select(listExtractor);	
			Whitelist whitelist = Whitelist.none();
			
			for(Element bookObj:bookObjs){
				Book book = new Book(Jsoup.clean(bookObj.select(titleExtractor).html(), whitelist),
									 Jsoup.clean(bookObj.select(authorExtractor).html(), whitelist),
									 Jsoup.clean(bookObj.select(costExtractor).html(), whitelist));
				books.add(book);
			}
		}catch (Exception e) {
			throw new Exception(e.getMessage(), e);
		}	
		return books.size()>0?books:null;

	}
	
	/**
	 * This method will build the extractor strings and url based the given site
	 * @param site
	 * @throws Exception
	 */
	public static void buildDetails (String site) throws Exception{
		StringBuilder urlString;
		try{
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
	        }else if(site.equalsIgnoreCase("youtube")){
	        	listExtractor = ExtractorStrings.youtubeListExtractor;
	        	titleExtractor = ExtractorStrings.youtubeListLinkExtractor;
	        	//authorExtractor = ExtractorStrings.crossWordBookAuthorExtractor;
	        	//costExtractor = ExtractorStrings.crossWordBookCostExtractor;
	        	        	
	    		urlString = new StringBuilder(ExtractorStrings.youtubeBaseUrl);
	    		urlString.append(searchString);
	    		url = urlString.toString();  
	        }
		}catch (Exception e) {
			throw new Exception(e.getMessage(), e);
		}
		
	}
	
	/**
	 * This method prints the result by taking books
	 * @param books
	 * @throws Exception
	 */
	public static void displayLinks (List<String> links) throws Exception{
		try{
			System.out.println("Number of Books in result :: "+links.size());
			for(String link:links){
				System.out.println(link);;
			}
			System.out.println("\n");
		}catch (Exception e) {
			throw new Exception(e.getMessage(), e);
		}
	}
	
	/**
	 * This method prints the result by taking books
	 * @param books
	 * @throws Exception
	 */
	public static void displayBooks (List<Book> books) throws Exception{
		try{
			System.out.println("Number of Books in result :: "+books.size());
			for(Book book:books){
				System.out.println(book);;
			}
			System.out.println("\n");
		}catch (Exception e) {
			throw new Exception(e.getMessage(), e);
		}
	}

	/**
	 * This method will process the command, splits the values and then check for supported validation 
	 * @param cmd
	 * @return true if valid else returns false
	 */
	public static boolean processValidateCmd(String cmd) throws Exception{
		
		boolean res = false;
		try{
			site = cmd.split(" ")[0];
		    searchString = cmd.split(" ")[1];
		    if(site.length()>0 && searchString.length()>0){
		    	 if(site.equalsIgnoreCase("flipcart") || site.equalsIgnoreCase("crossword") || site.equalsIgnoreCase("youtube") ){
		    		 res = true;
		    	 }else{
		    		 System.err.println("We are not supporting this site search now.");
		    		 return false;
		    	 }
		    }else{
		    	System.err.println("Please provide valid command");
		    	return false;
		    }
		}catch (Exception e) {
			throw new Exception(e.getMessage(), e);
		}    
		return res;
	}
	
}
