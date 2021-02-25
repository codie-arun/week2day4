package week2day4lab;

public class prgm15 {
	
	public static void main(String[] args) {
		
		House h = new House(new Door(10,10),new Window(5,5));
		System.out.println("Area of Door : "+h.area(h.door));
		System.out.println("Area of Window : "+h.area(h.window));
		
	}
	
	
	
}

class House{
	
	Door door;
	Window window;
	
	House(Door d,Window w){
		this.door = d;
		this.window = w;
	}
	
	int area(Props p) {
		return p.length*p.breadth;
	}
	

}

abstract class Props{
	int length;
	int breadth;
}



class Door extends Props{
	
	Door(int l,int b){
		this.breadth = b;
		this.length = l;
	}
	
}

class Window extends Props{
	
	
	
	Window(int l,int b){
		this.breadth = b;
		this.length = l;
	}
	
}

