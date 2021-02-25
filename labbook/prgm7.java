package week2day4lab;

public class prgm7 {

	public static void main(String[] args) {
		Ball b1 = new Ball().changeSize().changeSize();
		System.out.println(b1);
		final Ball b2 = b1;
		System.out.println(b2);
		b2.changeSize();
		System.out.println(b2);
		Ball b3 = new Ball();
		// b2 = b3; no
	}
	
}


class Ball{
	
	int size = 10;
	String Color;
	
	public Ball changeSize() {
		this.size+=5;
		return this;
	}
	
	public int getSize() {
		return this.size;
	}

	@Override
	public String toString() {
		return "Ball [size=" + size + "]";
	}
	
	
	
}