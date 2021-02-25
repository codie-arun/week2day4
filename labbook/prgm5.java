package week2day4lab;

public class prgm5 {

	public static void main(String[] args) {
		Creator c1 = new Creator();
		System.out.println("Count : "+c1.count);
		Creator c2 = new Creator();
		System.out.println("Count : "+c2.count);
		Creator c3 = new Creator();
		System.out.println("Count : "+c3.count);
		Creator c4 = new Creator();
		Creator c5 = new Creator();
		Creator c6 = new Creator();
		System.out.println("Count : "+c6.count);
	}
	
	
}

class Creator{
	
	static int count = 0;
	{
		count++;
	}
	
}