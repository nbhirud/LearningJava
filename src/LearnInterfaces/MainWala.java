package LearnInterfaces;

public class MainWala {
	public static void main(String[] args) {
		Car c = new Car();
		Ford f = new Ford();
		System.out.print("c - ");
		c.drive();
		System.out.print("f - ");
		f.drive();
		c = f;
		System.out.print("cf - ");
		c.drive();
		
	}
}
