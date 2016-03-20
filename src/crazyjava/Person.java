package crazyjava;

class Name {
	private String firstName;
	private String lastName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Name() {
	}

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

}

public class Person {
	private final Name name;

	public Person(Name name) {
//		this.name = name;
		this.name = new Name(name.getFirstName(), name.getLastName());
		
	}

	public Name getName() {
//		return this.name;
		return new Name(this.name.getFirstName(), this.name.getLastName());
	}

	public static void main(String[] args) {
		Name n = new Name("wukong", "sun");
		Person p = new Person(n);
		System.out.println(p.getName().getFirstName());
		
		n.setFirstName("bajie");
		
		System.out.println(p.getName().getFirstName());
		
		
	}

}
