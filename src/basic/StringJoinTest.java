package basic;

public final class StringJoinTest {

	public static void main(String[] args) {
		String s1 = "crazy java";
		String s2 = "crazy " + "java";

		System.out.println(s1 == s2);

		final String str1 = "crazy ";
		final String str2 = "java";

		String s3 = str1 + str2;
		System.out.println(s1 == s3);

		StringJoinTest a = new StringJoinTest();
		System.out.println(a.getClass());

		Double d = new Double(6.5);
		d = 1.1;
		
		
	}

}
