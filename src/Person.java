
public abstract class Person {
	private String name;
	private int age;
	private String address;
	
	public Person(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public abstract int SystemLogin();
}