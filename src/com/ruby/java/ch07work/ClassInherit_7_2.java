package com.ruby.java.ch07work;

//Item 클래스
class Item2 {
	private String name;
	private double price;
	private int stockQuantity;

	// 생성자
	public Item2(String name, double price, int stockQuantity) {
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}

	// Getter
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void increaseStock(int quantity) {

	}

	public void reduceStock(int quantity) {

	}

	@Override
	public String toString() {
		return null;
	}
}

//Electronics 클래스 (Item 클래스를 상속)
class Electronics extends Item2 {
	private int warranty; // 제품 보증 기간

	// 생성자
	public Electronics(String name, double price, int stockQuantity, int warranty) {
		super(name, price, stockQuantity);
		this.warranty = warranty;
	}
	
	

	public int getWarranty() {
		return warranty;
	}



	@Override
	public String toString() {
		return null;
	}
}

//Clothing 클래스 (Item 클래스를 상속)
class Clothing extends Item2 {
	private String size;
	private String color;

	// 생성자
	public Clothing(String name, double price, int stockQuantity, String size, String color) {
		super(name, price, stockQuantity);
		// TODO Auto-generated constructor stub
		this.size = size;
		this.color = color;
	}

	
	
	public String getSize() {
		return size;
	}



	public String getColor() {
		return color;
	}



	@Override
	public String toString() {
		return null;
	}

}

//Customer 추상 클래스 정의
abstract class Customer2 {
	private String name;
	private String city;
	private int age;

	// 생성자
	public Customer2(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return null;
	}

	abstract double getDiscountRate();

	abstract double applyDiscount(double totalAmount);
}

//RegularCustomer 클래스: Customer 클래스를 상속받음
class RegularCustomer extends Customer2 {
	static final double REGULARDISCOUNT_RATE = 0.03;

	public RegularCustomer(String name, String city, int age) {
		super(name, city, age);
	}

	@Override
	double applyDiscount(double totalAmount) {
		// 일반 고객 할인 적용
		return totalAmount * (1 - REGULARDISCOUNT_RATE);
	}

	@Override
	double getDiscountRate() {
		return REGULARDISCOUNT_RATE;
	}
}

//PremiumCustomer 클래스: Customer 클래스를 상속받음
class PremiumCustomer extends Customer2 {
	static final double PREMIUMDISCOUNT_RATE = 0.1;

	public PremiumCustomer(String name, String city, int age) {
		super(name, city, age);
	}

	@Override
	double applyDiscount(double totalAmount) {
		return totalAmount * (1 - PREMIUMDISCOUNT_RATE);
	}

	@Override
	double getDiscountRate() {
		return PREMIUMDISCOUNT_RATE;
	}
}

//Order 클래스
class Order2 {
	private Customer2 customer;
	private Item2[] items;
	private int[] quantities;
	private int itemCount;

	// 생성자

	public Order2(Customer2 customer, int itemCount) {
		this.customer = customer;
		this.items = new Item2[itemCount];
		this.quantities = new int[itemCount];
		this.itemCount = itemCount;
	}

	public void addItem(Item2 item, int quantity) {
		for (int i = 0; i < itemCount; i++) {
			if (items[i] == null)
			{
				items[i] = item;
				quantities[i] = quantity;
				break;
			}
			/*
			 * if (items[i] == null) { if(item instanceof Electronics) items[i] = new
			 * Electronics(item.getName(), item.getPrice(), item.getStockQuantity(),
			 * ((Electronics)item).getWarranty()); else if(item instanceof Clothing)
			 * items[i] = new Clothing(item.getName(), item.getPrice(),
			 * item.getStockQuantity(), ((Clothing)item).getSize(),
			 * ((Clothing)item).getColor()); items[i] = item; quantities[i] = quantity;
			 * break; }
			 */
		}

	}

	private double calculateTotal() {
		double total = 0.0;
		for (int i = 0; i < itemCount; i++) {
			if (items[i] == null)
				break;
			total += items[i].getPrice() * quantities[i];
		}
		return total;
	}

	public void printOrderSummary() {
		/*
		 * 할인된 가격의 합계 출력 할인 금액 합계 출력
		 */
		System.out.println(
				"고객정보 : " + "고객명:" + customer.getName() + ", 도시:" + customer.getCity() + ", 나이:" + customer.getAge());
		for (int i = 0; i < itemCount; i++) {
			if (items[i] == null)
				break;
			System.out.println("제품명 : " + items[i].getName() + ", 단가 : " + items[i].getPrice() + ", 개수 : "
					+ quantities[i] + " ==> 가격 : " + items[i].getPrice() * quantities[i]);
		}
		System.out.println("총액 : " + calculateTotal()+", 할인율 : " + customer.getDiscountRate() + ", 할인금액: " + (-calculateTotal()*customer.getDiscountRate()) + ",  할인 후 총액: "
				+ customer.applyDiscount(calculateTotal()));
		System.out.println("-".repeat(20));
	}
}

public class ClassInherit_7_2 {

	public static void main(String[] args) {

		// 의류 및 전자제품 생성
		Item2 laptop = new Electronics("노트북", 1200.00, 10, 24);
		Electronics phone = new Electronics("휴대폰", 800.00, 30, 12);
		Clothing tshirt = new Clothing("티셔츠", 20.00, 50, "M", "Blue");
		Clothing jacket = new Clothing("자켓", 80.00, 20, "L", "Black");

//		  고객 생성 
		PremiumCustomer premiumCustomer = new PremiumCustomer("홍길동", "부산", 30);
		RegularCustomer regularCustomer = new RegularCustomer("계백", "양산", 25);

		// 주문 생성
		Order2 order1 = new Order2(premiumCustomer, 4);
		order1.addItem(laptop, 1);
		order1.addItem(tshirt, 2);

		Order2 order2 = new Order2(regularCustomer, 4);
		order2.addItem(phone, 1);
		order2.addItem(jacket, 1);

		// 주문 요약 출력
		System.out.println("Premium Customer Order:");
		order1.printOrderSummary();

		System.out.println("Regular Customer Order:");
		order2.printOrderSummary();

		/*
		 * 출력 결과 예시
		 * 
		 * Premium Customer Order: 고객정보 : 고객명:홍길동, 도시:부산, 나이:30 제품명 : 노트북, 단가 : 1200.0,
		 * 개수 : 1 ==> 가격 : 1200.0 제품명 : 티셔츠, 단가 : 20.0, 개수 : 2 ==> 가격 : 40.0 총액:1240.0,
		 * 할인율:0.1, 할인금액:-124.0 할인 후 총액:1116.0
		 * ------------------------------------------------------- Regular Customer
		 * Order: 고객정보 : 고객명:계백, 도시:양산, 나이:25 제품명 : 휴대폰, 단가 : 800.0, 개수 : 1 ==> 가격 :
		 * 800.0 제품명 : 자켓, 단가 : 80.0, 개수 : 1 ==> 가격 : 80.0 총액:880.0, 할인율:0.03,
		 * 할인금액:-26.399999999999977 할인 후 총액:853.6
		 * -------------------------------------------------------
		 */
	}
}