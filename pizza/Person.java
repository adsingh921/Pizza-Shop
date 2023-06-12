package pizza;

public class Person {
	private String name;
	private boolean isHungry = false;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}	
	public boolean isHungry() {
			return isHungry;
	}
	public void setHungry(boolean isHungry) {
			this.isHungry = isHungry;
	}
	Person(String name){
		this.name = name;
	}
	
	Person(String name, boolean hungry){
		this.name = name;
		this.isHungry = hungry;
	}
	

}
