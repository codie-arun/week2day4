package week2day4;

public class Container {
	
	public static void main(String[] args) {
		
		MyContainer cont = new MyContainer();
		
		System.out.println(cont.shoe);
		
	}
	
}


class MyContainer{
	
	ShoeShop ss = MyContainer.getShoeShop();
	Customer cust = new ShoeCustomer("ramu");
	ShoeFactory sf = new Lakhani();
	Shoe shoe = ss.sellShoe(cust,sf);
	
	public static ShoeShop getShoeShop() {
		return new GokulShoeShop();
	}
	
}


// ShoeFactory

interface Manufacturer{
	
}


interface ShoeManufacturer extends Manufacturer{
	
	public Shoe makeshoe();
	
}

abstract class ShoeFactory implements ShoeManufacturer{
	public Shoe shoe;
}

class Bata extends ShoeFactory{
	
	public Shoe makeshoe() {
		return new LeatherShoe();
	}
	
}
class Lakhani extends ShoeFactory{
	
	public Shoe makeshoe() {
		return new SportsShoe();
	}
}









// Shoe Shop

interface Seller{
	
}

interface ShoeSeller extends Seller {
	Shoe sellShoe(Customer c,ShoeFactory sf);
}

abstract class ShoeShop implements ShoeSeller{
	Shoe shoe;
}

class GokulShoeShop extends ShoeShop{
	
	Shoe shoe = new LeatherShoe();
	ShoeFactory sf;
	
	public Shoe sellShoe(Customer c,ShoeFactory sf) {
		return sf.makeshoe();
	}

	
}







// Shoe

abstract class Shoe{
	
}

class LeatherShoe extends Shoe{
	
}
class SportsShoe extends Shoe{
	
}


// Customer

abstract class Customer{
	String name;
	Customer(String name){
		this.name = name;
	}
	Shoe shoe;
}
class ShoeCustomer extends Customer{
	
	ShoeCustomer(String name){
		super(name);
	}
	
}
