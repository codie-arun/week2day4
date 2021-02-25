package week2day4lab;

public class Single {
	
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.Singleton(); 
	    Singleton s2 = Singleton.Singleton(); 
	    
	    s1.i = 20;
	    
	    System.out.println("i in s1 is " + s1.i); 
	    System.out.println("i in s2 is " + s2.i); 
	    	   
	    s2.i = 40; 

	    System.out.println("i in s1 is " + s1.i); 
	    System.out.println("i in s2 is " + s2.i); 
		
	}
	
	
	
}

class Singleton 
{ 
	public int i; 
	
	private static Singleton instance = null; 
  
  
    private Singleton() 
    { 
        i = 10; 
    } 
  
    public static Singleton Singleton() 
    { 
        if (instance == null) 
            instance = new Singleton(); 
        return instance; 
    } 
} 