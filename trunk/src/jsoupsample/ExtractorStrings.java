package jsoupsample;

public abstract class ExtractorStrings {
	
	
	
	//FlipCart
	final static String flipCartListExtractor ="#products div.gd-row div.gd-col gu12 browse-product fk-inf-scroll-item, div.list-unit";
	final static String flipCartBookTitleExtractor ="a.lu-title";
	final static String flipCartBookAuthorExtractor ="span a";
	final static String flipCartBookCostExtractor =".pu-price div.pu-final";
	
	final static String flipCartUrlHead = "http://www.flipkart.com/books/pr?q=";	
	final static String flipCartUrlTail = "&sid=bks&as=off&as-show=off&otracker=start";
	
	//Cross Word
	final static String crossWordListExtractor ="#search-result-items .variant-desc";
	final static String crossWordBookTitleExtractor =".variant-title a";
	final static String crossWordBookAuthorExtractor =".contributors .ctbr-name a";
	final static String crossWordBookCostExtractor =".price .variant-final-price";
	
	final static String crossWordBaseUrl = "http://www.crossword.in/books/search?q=";
	
	// Youtube List links extractors
	final static String youtubeListExtractor ="#browse-items-primary li ul.pl-video-list, li";
	final static String youtubeListLinkExtractor ="data-video-id";
	
	//final static String crossWordBookTitleExtractor =".variant-title a";
	//final static String crossWordBookAuthorExtractor =".contributors .ctbr-name a";
	//final static String crossWordBookCostExtractor =".price .variant-final-price";
	
	final static String youtubeBaseUrl = "https://www.youtube.com/playlist?list=";
}
