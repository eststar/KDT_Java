package com.ruby.java.ch08.innerClass;

class Room2 {
	private String roomName; // 방 이름

	// Room 클래스의 생성자
	public Room2(String roomName) {
		this.roomName = roomName;
	}

	// 방의 정보와 함께, 속해 있는 집의 정보도 출력하는 메소드
	public void show() {
		System.out.println("방 이름: " + roomName);
	}
}

class House2 {
	private String address; // 집 주소
	private Room2[] rooms;
	private int numRooms;
	private int count;

	// House 클래스의 생성자
	public House2(String address, int numRooms) {
		this.address = address;
		this.numRooms = numRooms;
		rooms = new Room2[this.numRooms];
		count = 0;
	}

	// 집의 정보를 출력하는 메소드
	public void show() {
		System.out.println("집 주소: " + address);
		System.out.println("집 방수: " + numRooms);
		for (Room2 rm: rooms) {
			rm.show();
		}
	}
	void makeRoom(String name) {
		if (count > numRooms) {
			System.out.println("방 없어요");
			 return;
		}
		rooms[count++] = new Room2(name);
	}


}
public class House_OuterClass {
	public static void main(String[] args) {

		House2 myHouse = new House2("부산시 부산대학로 63번길의2", 2);
		myHouse.makeRoom("아빠");	myHouse.makeRoom("엄마");
		myHouse.show();
		
		Room2 myRoom = new Room2("부엌");//오류
		//House.Room myRoom = new House.Room("내방");//오류

		myRoom.show();
	}
}