package crazyjava;

public class Primitive2Wrapper {

	public static void main(String[] arsg) {

		String intStr = "123";

		int it1 = Integer.parseInt(intStr);
		int it2 = new Integer(intStr);
		System.out.println(it1);
		System.out.println(it2);

		String floatStr = "4.5";
		float ft1 = Float.parseFloat(floatStr);
		System.out.println(ft1);
		float ft2 = new Float(floatStr);
		System.out.println(ft2);

		String ftStr = String.valueOf(2.34f);
		System.out.println(ftStr);
		
		String b = String.valueOf(true);
		System.out.println(b);
		
		
	}
}
