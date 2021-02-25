package week2day4lab;

public class prgm1 {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println("Value of roll no in student object "+s.rollno);
		Pass p = new Pass();
		p.changer(s.rollno);
		System.out.println("Value after passed to changer as primitive type "+s.rollno);
		p.changer(s);
		System.out.println("Value after passed to changer as object "+s.rollno);
	}
	
}

class Pass{
		
	public void changer(int x) {
		x = 200;
	}
	
	public void changer(Student s) {
		s.rollno = 200;
	}
	
}

class Student{
	
	int rollno = 101;
	String name = "mark";
}