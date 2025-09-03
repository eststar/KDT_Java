package edu;

public class Test03 {
	public static void main(String[] args) {
		byte age; //1byte
		short point; //2byte
		int price; //4byte
		long totalSales; //8byte
		
		age = 23;
		point = 32000;
		price = 3500000;
		totalSales = 2147483648L;
		
		System.out.println(age);
		System.out.println(point);
		System.out.println(price);
		System.out.println(totalSales);
		
	}

}
