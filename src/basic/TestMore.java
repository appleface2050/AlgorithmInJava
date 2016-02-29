package basic;


class Test
{
	public double size;
	public String name;
	public Test(double size, String name)
	{
		this.size = size;
		this.name = name;
	}
	public void tellName(){
		System.out.println(this.name);
	}

}

public class TestMore extends Test{

	public TestMore(double size, String name) {
		super(size, name);
		// TODO Auto-generated constructor stub
	}
	
	public void tellSize(){
		System.out.println(this.size);
	}

	public static void main(String[] args){
		Test a = new TestMore(1,"qq");
		System.out.println(a.size+" "+a.name);
//		a.tellsize();//不能调用子类的方法了
	}
}
