package week2day4lab;

public class prgm2 {
	
	public static void main(String[] args) {
		Complex c1 = new Complex(10,15);
		Complex c2 = new Complex(20,25);
		System.out.println(c1.add(c2));
	}
	
}

class Complex
{
	int real;
	int imaginary;
	
	Complex(int real,int imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public Complex add(Complex c) {
		return new Complex(this.real+c.real,this.imaginary+c.imaginary);
		
	}

	@Override
	public String toString() {
		return real + " + " + imaginary + "i";
	}
	
	
}