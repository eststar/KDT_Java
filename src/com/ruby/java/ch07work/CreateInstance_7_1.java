package com.ruby.java.ch07work;

import java.time.LocalDate;

class Item { // 제품
	private String name; // 제품명
	private double price; // 제품 가격
	private int stockQuantity; // 재고량
	
	// 생성자 작성
	public Item(String name, double price, int stockQuantity) {
		
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}
	
	// Getter 작성
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	
	@Override
	public String toString() {
		return "이름:" + name + ", 가격:" + price + ", 재고:" + stockQuantity;
	}
	
}

class Customer {
	private String name;
	private String city;
	private int age;
	
	// 생성자 작성
	public Customer(String name, String city, int age) {
		
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

	// toString 작성
	@Override
	public String toString() {
		return null;
	}
	
}

class Order {
	private Customer customer; // 고객
	private Item[] items; // 주문 제품들
	private int[] quantities; // 주문 제품 수량들
	private int count; // 아이템 개수
	private String orderDates = LocalDate.now().toString(); // 주문일

	// 생성자 작성
	public Order(Customer customer, int count) {
		this.customer = customer;
		this.items = new Item[count];
		this.quantities = new int[count];
		this.count = count;
	}
	
	
	// 아이템 추가 메소드
	public void addItem(Item item, int orderQuantity) {
		for(int i = 0; i < count; i++) {
			
			if (items[i] == null)
			{
				items[i] = item;
				quantities[i] = orderQuantity;
				break;
			}
			
			/*
			 * if(items[i] == null) { items[i] = new Item(item.getName(), item.getPrice(),
			 * item.getStockQuantity()); quantities[i] = orderQuantity; break; }
			 */	
		}
		
	}
	

	// 총액 계산 메소드
	private double calculateTotal() {
		double total = 0.0;
		for(int i = 0; i< count; i++) {
			if(items[i] == null)
				break;
			total += items[i].getPrice() * quantities[i]; 
		}
		
		return total;
	}

    // 주문 요약 출력 메소드
	public void printOrderSummary() {
		System.out.println("고객정보 : 이름: "+customer.getName()+", 도시: "+customer.getCity()+", 나이:"+customer.getAge() +", 주문일: "+ orderDates);
		
		for(int i = 0; i < count; i++) {
			if(items[i] == null)
				break;
			System.out.println("제품명 :" +items[i].getName()+", 단가 : "+items[i].getPrice()+", 개수 : "+quantities[i] +"==> 가격 : "+(items[i].getPrice()*quantities[i]));
		}
		System.out.println(calculateTotal());
		System.out.println("-".repeat(20));
	}
}

public class CreateInstance_7_1 {
	public static void main(String[] args) {
		
		// 아이템 생성
		Item laptop = new Item("노트북", 1200.00, 10);
		Item tshirt = new Item("티셔츠", 20.00, 50);
		Item phone = new Item("휴대폰", 800.00, 30);
		Item headphones = new Item("헤드폰", 150.00, 20);
		Item mouse = new Item("마우스", 30.00, 15);
		
		// 고객 생성
		Customer boy = new Customer("홍길동", "부산", 21);
		Customer girl = new Customer("계백", "양산", 22);
		
		// 주문 생성
		Order order1 = new Order(boy, 5); // 최대 5개 아이템
		order1.addItem(laptop, 1);
		order1.addItem(tshirt, 2);
		order1.addItem(phone, 1);
		order1.addItem(headphones, 1);
		order1.addItem(mouse, 1);
		
		Order order2 = new Order(girl, 5); // 최대 5개 아이템
		order2.addItem(laptop, 1);
		order2.addItem(tshirt, 1);
		order2.addItem(phone, 1);
		order2.addItem(headphones, 1);
		order2.addItem(mouse, 1);
		
		// 주문 요약 출력
		order1.printOrderSummary();
		order2.printOrderSummary();

		/*
		 * 출력 결과 예시
		 * 
		고객정보 : 이름:홍길동, 도시:부산, 나이:21, 주문일: 2025-09-10
		제품명 : 노트북, 단가 : 1200.0, 개수 : 1 ==> 가격 : 1200.0
		제품명 : 티셔츠, 단가 : 20.0, 개수 : 2 ==> 가격 : 40.0
		제품명 : 휴대폰, 단가 : 800.0, 개수 : 1 ==> 가격 : 800.0
		제품명 : 헤드폰, 단가 : 150.0, 개수 : 1 ==> 가격 : 150.0
		제품명 : 마우스, 단가 : 30.0, 개수 : 1 ==> 가격 : 30.0
		총액 : 2220.0
		-------------------------------------------------------
		고객정보 : 이름:계백, 도시:양산, 나이:22, 주문일: 2025-09-10
		제품명 : 노트북, 단가 : 1200.0, 개수 : 1 ==> 가격 : 1200.0
		제품명 : 티셔츠, 단가 : 20.0, 개수 : 1 ==> 가격 : 20.0
		제품명 : 휴대폰, 단가 : 800.0, 개수 : 1 ==> 가격 : 800.0
		제품명 : 헤드폰, 단가 : 150.0, 개수 : 1 ==> 가격 : 150.0
		제품명 : 마우스, 단가 : 30.0, 개수 : 1 ==> 가격 : 30.0
		총액 : 2200.0
		-------------------------------------------------------
		 */
	}
}
