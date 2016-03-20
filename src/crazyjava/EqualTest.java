package crazyjava;

public class EqualTest {

	public static void main(String[] args) {

		String i = new String("1");
		String j = new String("1");
		System.out.println(i == j);
		System.out.println(i.equals(j));
		int a = 1;
		System.out.println("------");
		System.out.println(Integer.toString(a) == i);
		System.out.println(Integer.toString(a).equals(i));

	}
}
