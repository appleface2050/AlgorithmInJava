package crazyjava;

public class Apple {
	public String name;
	public String color;
	public double weight;

	public Apple() {
	}

	public Apple(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public Apple(String name, String color, double weight) {
		this(name, color); // this用来调用重载重载的构造函数
		this.weight = weight;
	}

}
