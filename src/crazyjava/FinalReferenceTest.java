package crazyjava;

import java.util.Arrays;

class Person1 {
	private int age;

	@Override
	public String toString() {
		return "Person1 [age=" + age + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person1() {
	}

	public Person1(int age) {
		this.age = age;
	}

}

public class FinalReferenceTest {
	public static void main(String[] args) {
		final int[] iArr = { 5, 6, 12, 9 };
		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr);
		iArr[2] = -8;
		System.out.println(Arrays.toString(iArr));

		final Person1 p = new Person1(45);
		p.setAge(10);
		System.out.println(p.getAge());
	}
}
