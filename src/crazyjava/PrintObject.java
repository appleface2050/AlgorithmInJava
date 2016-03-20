package crazyjava;

class PPerson {
	private String name;

	public PPerson(String name) {
		this.name = name;
	}

	public void info() {
		System.out.println("name is" + name);

	}

}

public class PrintObject {

	public static void main(String[] args){
		PPerson p = new PPerson("sunwukong");
		System.out.println(p);;
	}
	
}
