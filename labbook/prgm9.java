package week2day4lab;

public class prgm9 {
	public static void main(String[] args) {
		
		B b = new B();
		b.access();
		
	}
}


class A {
	public int a;
	int b;
	protected int c;
	private int d;
	
	public void met1(){
		System.out.println("public");
	}
		void met2(){
			System.out.println("no modifier");
	}
	protected void met3(){
		System.out.println("protected");
	}
	private void met4(){
		System.out.println("private");
	}
	
}

class B extends A{
	
	public void access(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(d);// private
		
		met1();
		met2();
		met3();
		//met4(); private
		
	}
	
}
