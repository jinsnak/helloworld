package helloworld;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Goods g = new Goods();
		g.setName("coke");
		g.setPrice(2000);
		
		System.out.println(g.getName());
		System.out.println(g.getPrice());
		
		Goods g2 = new Goods("fanta", 3000);
		
		System.out.println(g2.getName());
		System.out.println(g2.getPrice());
	}
}
