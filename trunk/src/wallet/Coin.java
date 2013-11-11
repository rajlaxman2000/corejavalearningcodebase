package wallet;

public class Coin implements Comparable<Coin>{
	
	String name;
	String value;
	
	public Coin(String name, String value){
		this.name=name;
		this.value=value;		
	}
	
	
	public int compareTo(Coin coin) {
		return this.getName().compareTo(getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
