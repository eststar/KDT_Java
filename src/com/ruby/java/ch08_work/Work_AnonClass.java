package com.ruby.java.ch08_work;

interface WorkFile {
	public void fileUpload();
	public void fileDownload();
}

interface Messenger2 {
	int MIN_SIZE=1;
	int MAX_SIZE=10000;
	public String getMessage();
	public void setMessage(String msg);
	//추상 클래스와 마찬가지로 상속받는 클래스들에서 공통적으로 사용하는 메서드. 상속받는 클래스들의 객체가 만들어지면 사용 가능
	public default void setLogin(boolean login) {
		if (login) {
			System.out.println("login");
		}
		else {
			System.out.println("logout");
		}
	}
	//인터페이스라도 static 메소드 사용 가능. Messenger2.getConnection()
	public static void getConnection() {
		System.out.println("network 연결");
	}
}
class GraphicIOS {
	public void draw_textBox() {
		System.out.println("텍스트 상자");
	}
	public void draw_submitButton() {
		System.out.println("전송버튼");
	}

}
class IPhoneMessenger extends GraphicIOS implements Messenger2  {//extends를 먼저 기술
	public String getMessage() {
		return "iPhone";

	}

	public void setMessage(String msg) {
		System.out.println("메시지" + msg);
	}
	public void clearMessage() {
		System.out.println("문자열 지우기");
	}

}
class GalaxyMessenger implements Messenger2, WorkFile {
	@Override
	public String getMessage() {
		return "galaxy";
	}
	@Override
	public void setMessage(String msg) {
		System.out.println("galaxy 메시지 설정" + msg);
	}
	@Override
	public void fileUpload() {
		System.out.println("file uploaded");
	}
	@Override
	public void fileDownload() {
		System.out.println("file downloaded");
	}

}
public class Work_AnonClass {
public static void main(String[] args) {
	Messenger2.getConnection();
	
	IPhoneMessenger iphone = new IPhoneMessenger();
	iphone.setLogin(false);
	
	GalaxyMessenger galaxy = new GalaxyMessenger();
	iphone.draw_submitButton();
	iphone.draw_textBox();
	galaxy.getMessage();
	galaxy.setMessage("갤럭시");
	Messenger2 test = new Messenger2() {
		public String getMessage() {
			return "test 메시지";

		}
		public void setMessage(String msg) {
			System.out.println("test 메시지: " + msg);
		}
	};
	System.out.println(test.getMessage());
	test.setMessage("익명클래스");
}
}
