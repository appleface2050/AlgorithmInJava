package basic;

class Root {
	static {
		System.out.println("Root static");
	}
	{
		System.out.println("Root normal");
	}

}

class Mid extends Root {
	static {
		System.out.println("Mid static");
	}
	{
		System.out.println("Mid normal");
	}

	public Mid() {
		System.out.println("Mid constructor");
	}

	public Mid(String msg) {
		this();
		System.out.println("Mid constructor with args:" + msg);
	}
}

class Leaf extends Mid {

	static {
		System.out.println("Leaf static");
	}
	{
		System.out.println("Leaf normal");
	}

	public Leaf() {
		super("crezy java");
		System.out.println("Leaf contructor");
	}

}

public class TestMore {
	public static void main(String[] args) {
		new Leaf();
		System.out.println("--------------------");
		new Leaf();
	}

}
