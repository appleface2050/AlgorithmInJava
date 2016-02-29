package basic;

import static java.lang.System.out;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(40);
		p.setName("li");

		out.println("success: " + p.getName());
	}
	
	

}
