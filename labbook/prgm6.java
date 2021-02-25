package week2day4lab;

public class prgm6 {

	static int i = 10;
	
	static 
	{
		met();
		System.out.println("Value of i "+i);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Values in main "+k+" "+i);
	}
	public static void met() {
		System.out.println("Value of k "+k);
	}
	
	static int k = 20;
	
	
}

