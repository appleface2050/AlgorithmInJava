package basic;

import java.util.ArrayList;
import java.util.Arrays;

class DataWrap{
	public int a;
	public int b;
	
}

class PersonC
{
	public String name;
	public static int eyeNum;
}

public class TestCode{

	
	public static void main(String[] args)
	{

//		String[] stringArray = { "a", "b", "c", "d", "e" };
//		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
//		System.out.println(arrayList);
////		// [a, b, c, d, e]
//		DataWrap dw = new DataWrap();
//		dw.a = 1;
//		dw.b = 2;
//		Person.swap(dw);
//		System.out.println("out the swap:  "+dw.a+"  "+dw.b);
		
		System.out.println("Person's eyeNum's Field value:"+PersonC.eyeNum);
		PersonC p = new PersonC();
		System.out.println("p's name Field value:"+p.name+"p's object's eyeNum Field value"+p.eyeNum);
		
	}

}