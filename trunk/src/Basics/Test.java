package Basics;

public class Test {
	
	public Test(String msg){
		//System.out.println("I am constructor for Test class");
		System.out.println(msg);
	}
	
	protected  Test(String msg, String x){
		//System.out.println("I am constructor for Test class");
		System.out.println(msg);
	}
	
	static{
		System.out.println("Test class");
	}
	
	public void printName(String name){
		System.out.println(name);		
	}
	
	public void add(int x, int y){
		System.out.println(x+y);
	}
	
	public void multiplication(int a, int b){
		System.out.println(a*b);
	}

}
