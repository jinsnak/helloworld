package helloworld;

public class Goods {
	private String name;
	private int price;
	//자동으로 생성되는 생성자 (아무 생성자가 없는 경우)
	/*
	public Goods() {
		
	}
	*/
	public Goods() {
		
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//오버로딩
	public int calcDiscountPrice(double rate) {
		return (int)(price * rate);
	}
	public int calcDiscountPrice(int rate) {
		return (int)(price * rate);
	}
}
