package pizza;

public class Customer extends Person{
	
	// Attributes
	
	private String [] payMethods;
	
	private double availabeMoney;
	
	private boolean hasCoupon;
	
	
	// Encapsulation Methods (GETTER/SETTER or ACCESSOR/MUTATOR)
	
	
	public String[] getPayMethods() {
		return payMethods;
	}
	public void setPayMethods(String[] payMethods) {
		this.payMethods = payMethods;
	}
	public double getAvailabeMoney() {
		return availabeMoney;
	}
	public void setAvailabeMoney(double availabeMoney) {
		this.availabeMoney = availabeMoney;
	}
	
	public boolean isHasCoupon() {
		return hasCoupon;
	}
	public void setHasCoupon(boolean hasCoupon) {
		this.hasCoupon = hasCoupon;
	}
	// Constructor
	Customer(String name, double money){
		super (name, true); 
		this.availabeMoney = money;
	}
	
	// Methods
	public Pizza order() {
		Pizza p = Store.makePizza();
		return p;
	}
	public void pay() {}
	public void tip() {}

}
