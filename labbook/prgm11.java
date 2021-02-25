package week2day4lab;

public class prgm11 {
	public static void main(String[] args) {
		CCC c = new CCC(10);
	}
	
	
}

class AAA{
	
	AAA(int i){
		System.out.println("Class A");
	}
	
}

class BBB{
	BBB(int i){
		System.out.println("Class B");
	}
}

class CCC extends AAA{
	
	CCC(int i){
		super(10);
		System.out.println("Class C");
	}
	
	BBB b = new BBB(10);
	
}


/*
 * 
Class A
Class B
Class C
*
*/

