package crazyjava;

class BaseClass {
	public int book = 6;
	
	public void base(){
		System.out.println("father normal");
	}
	public void test()
	{
		System.out.println("father class test");
	}
}

public class SubClass extends BaseClass {

	public String book = "java";
	public void test()
	{
		System.out.println("sub class test");
	}
	
	public void sub()
	{
		System.out.println("sub normal");
	}

	public static void main(String[] args) {

		BaseClass t = new SubClass();
		t.test(); //成员函数具有多态性，运行时调用的事子类的成员函数
		t.base(); 
		//t.sub(); //编译不过，按理说是可以运行的
		System.out.println(t.book); //成员变量不具有多态性，所以按照编译时的类型走
		
	}
}
