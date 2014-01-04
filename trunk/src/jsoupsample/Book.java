package jsoupsample;

public class Book {
	
	private String title;
	private String authors;
	private String cost;
	
	public Book(){
		
	}
	
	public Book(String title, String authors, String cost){
		this.title = title;
		this.authors = authors;
		this.cost = cost;		
	}
	
	public String toString(){
		StringBuilder displayString = new StringBuilder("");		
		return displayString.append(title).append(" | ").append(authors).append(" | ").append(cost).toString();
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the authors
	 */
	public String getAuthors() {
		return authors;
	}
	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	/**
	 * @return the cost
	 */
	public String getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(String cost) {
		this.cost = cost;
	}

}
