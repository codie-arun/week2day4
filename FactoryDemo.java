package base;

// Loose Couple Shoe and Factory

import java.util.Scanner;
public class FactoryDemo {
	public static void main(String[] args)throws Exception {
		while(true) {
		System.out.println("..........................................");
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the shop class name..:");
		String shopClass=scan.next();
		System.out.println("Please enter the factory class name..:");
		String factoryClass=scan.next();
		ShoeShop shop=Container.getShoeShop(shopClass,factoryClass);
		System.out.println("Please enter the type of shoe...:");
		String type=scan.next();
		Shoe shoe=shop.sellShoe(new ShoeCustomer("ramu"),type);
		System.out.println("Shoe....:"+shoe);
		System.out.println("..........................................");
		
		}
	}
}
abstract class Shoe{
	
	
}



class LeatherShoe extends Shoe{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is leather shoe";
	}
}
class SportsShoe extends Shoe{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is sports shoe";
	}
}







interface Manufacturer{
	
}
interface ShoeManufacturer extends Manufacturer{
	public Shoe makeShoe(String s) throws Exception;
}
abstract class ShoeFactory implements ShoeManufacturer{
	
}
class BataShoeFactory extends ShoeFactory{
	@Override
	public Shoe makeShoe(String s) throws Exception{
		Shoe bata = (Shoe)Class.forName(s).newInstance();
		System.out.println(bata);
		return bata;
	}
}
class LakhaniShoeFactory extends ShoeFactory{
	@Override
	public Shoe makeShoe(String s) throws Exception {
		Shoe lak = (Shoe)Class.forName(s).newInstance();
		System.out.println(lak);
		return lak;
	}
}
abstract class Customer{
	private String name;
	public Customer(String name) {
		this.setName(name);
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
}
class ShoeCustomer extends Customer{
	public ShoeCustomer(String name) {
		super(name);
	}
}
interface Seller{
	
}
interface ShoeSeller extends Seller{
	public Shoe sellShoe(Customer customer,String s) throws Exception;
}
abstract class ShoeShop implements ShoeSeller{
	private ShoeFactory factory;
	public final ShoeFactory getFactory() {
		return factory;
	}
	public final void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
}
class GokulShoeShop extends ShoeShop{
	@Override
	public Shoe sellShoe(Customer customer,String s) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Shoe bought by...:"+customer.getName());
		return getFactory().makeShoe(s);
	}
}
class Container{
	public static ShoeShop getShoeShop(String shopclass,String factoryclass)throws Exception {
		ShoeFactory factory=(ShoeFactory)Class.forName(factoryclass).newInstance();
		ShoeShop shop=(ShoeShop)Class.forName(shopclass).newInstance();
		//dependency injection
		shop.setFactory(factory);
		return shop;
	}
}