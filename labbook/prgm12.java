package week2day4lab;

public class prgm12 {

	
	public static void main(String[] args) {
		
		Haaris h[] = new Haaris[5];
		h[0] = new HaarisInfotech();
		h[1] = new HaarisTechnologies();
		h[2] = new HaarisPharma();
		h[3] = new HaarisTechnologies();
		h[4] = new HaarisInfotech();
		
		h[0].finance();
		h[1].finance();
		h[2].finance();
		h[3].finance();
		h[4].finance();
		
		h[0].marketing();
		h[1].marketing();
		h[2].marketing();
		h[3].marketing();
		h[4].marketing();
		
		
	}
	
}

class Haaris{
	
	void finance() {
		System.out.println("Financial Management for Haaris");
	}
	
	void marketing() {
		System.out.println("Marketing Management for Haaris");
	}
	
}

class HaarisInfotech extends Haaris{

	@Override
	void finance() {
		// TODO Auto-generated method stub
		System.out.println("Financial Management for HaarisInfotech");
		super.finance();
	}

	@Override
	void marketing() {
		// TODO Auto-generated method stub
		System.out.println("Marketing Management for HaarisInfotech");
		super.marketing();
	}
	
}

class HaarisTechnologies extends Haaris{
	
	@Override
	void finance() {
		// TODO Auto-generated method stub
		System.out.println("Financial Management for HaarisTechnologies");
		super.finance();
	}

	@Override
	void marketing() {
		// TODO Auto-generated method stub
		System.out.println("Marketing Management for HaarisTechnologies");
		super.marketing();
	}
	
}

class HaarisPharma extends Haaris{
	
	@Override
	void finance() {
		// TODO Auto-generated method stub
		System.out.println("Financial Management for HaarisPharma");
		super.finance();
	}

	@Override
	void marketing() {
		// TODO Auto-generated method stub
		System.out.println("Marketing Management for HaarisPharma");
		super.marketing();
	}
	
	
/*
 Financial Management for HaarisInfotech
Financial Management for Haaris
Financial Management for HaarisTechnologies
Financial Management for Haaris
Financial Management for HaarisPharma
Financial Management for Haaris
Financial Management for HaarisTechnologies
Financial Management for Haaris
Financial Management for HaarisInfotech
Financial Management for Haaris
Marketing Management for HaarisInfotech
Marketing Management for Haaris
Marketing Management for HaarisTechnologies
Marketing Management for Haaris
Marketing Management for HaarisPharma
Marketing Management for Haaris
Marketing Management for HaarisTechnologies
Marketing Management for Haaris
Marketing Management for HaarisInfotech
Marketing Management for Haaris	
 */
	
	
	
	
	
	
	
}

