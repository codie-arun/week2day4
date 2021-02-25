package week2day4lab;

public class prgm14 {
	
	public static void main(String[] args) {
		
		SchoolStudent s1 = new SchoolStudent(10,"Tendulker");
		Exam e1 = new Exam(80,90,98);
		Result r1 = new Result(80,90,98);
		
		e1.s = s1;
		System.out.println(e1.s.name);
		r1.cal();
		
	}
	
}

class SchoolStudent{
	
	int rollno;
	String name;
	
	SchoolStudent(int rollno,String name){
		this.rollno = rollno;
		this.name = name;
	}
	
}

class Exam{
	
	SchoolStudent s;
	
	int sub1_mark;
	int sub2_mark;
	int sub3_mark;
	
	Exam(int m1,int m2,int m3){
		
		this.sub1_mark = m1;
		this.sub2_mark = m2;
		this.sub3_mark = m3;
	}
	
}
class Result extends Exam{
	SchoolStudent s;
	int total;
	Result(int sub1_mark,int sub2_mark,int sub3_mark)
	{
		super(sub1_mark,sub2_mark,sub3_mark);
		this.s = super.s;
	}
	
	public void cal() {
		this.total =  sub1_mark+sub2_mark+sub3_mark;
		System.out.println("Total marks : " + total);
	}
	
}