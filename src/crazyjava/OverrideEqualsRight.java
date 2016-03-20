package crazyjava;

class OER {
	private String name;
	private String idStr;

	public OER() {
	}

	public OER(String name, String idStr) {
		this.name = name;
		this.idStr = idStr;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj != null && obj.getClass() == OER.class) {
			OER personObj = (OER) obj;
			if (this.idStr.equals(personObj.idStr))
				return true;

		}
		return false;

	}

}

public class OverrideEqualsRight {

	public static void main(String[] args) {
		OER p1 = new OER("sunwukong", "123");
		OER p2 = new OER("sunxingzhe", "123");
		OER p3 = new OER("sunwufan", "099");

		System.out.println("p1 equals p2 ?  " + p1.equals(p2));
		System.out.println("p2 equals p3 ?  " + p2.equals(p3));

	}

}
