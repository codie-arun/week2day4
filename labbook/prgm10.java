package week2day4lab;

public class prgm10 {
	public static void main(String[] args) {
		CC c = new CC();
	}
	
	
}

class AA{
	
	AA(){
		System.out.println("Class A");
	}
	
}

class BB{
	BB(){
		System.out.println("Class B");
	}
}

class CC extends AA{
	
	BB b = new BB();
	
}


// Class A
// Class B





