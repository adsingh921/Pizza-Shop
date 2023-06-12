package pizza;

public class Start {

	public static void main(String[] args) {
		
		Person p = new Person("Jack");
		System.out.println(p.getName());
		System.out.println(p.isHungry());
		
		Customer c1 = new Customer("Bob", 200.00);
		System.out.println(c1.isHungry());
		Pizza pizza = c1.order();
		
		System.out.println(c1.getName() + " order the following pizza:");
		System.out.println(pizza);
		
		}
}
