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
		t.test(); //��Ա�������ж�̬�ԣ�����ʱ���õ�������ĳ�Ա����
		t.base(); 
		//t.sub(); //���벻��������˵�ǿ������е�
		System.out.println(t.book); //��Ա���������ж�̬�ԣ����԰��ձ���ʱ��������
		
	}
}
