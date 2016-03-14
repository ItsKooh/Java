package com.kerson.polymorphism3.tv;

public class TVClient {
	public static void main(String[] args) {
	    /*
	     * 1.인스턴스를 생성하기 위해 Factory를 사용
	     * 2.인스턴스 생성을 위해 new LgTV()와 같이 특정 TV를 명시하지 않음.
	     * 3.단순히 TV 객체를 리턴해주는 Factory 인스턴스만 생성 후, getInstance() 메서드로 객체를 리턴받음.
	     * 4.SamsungTV 생성에 대한 객체가 변경되더라도 개별 client소스는 수정할 필요없이 Factory 소스만 변경하면 됨.
	     * 5.객체 변경에 따른 영향도 감소함. 
	     */
	    TVFactory tvFactory = new TVFactory();
	    TV tv = (TV) tvFactory.getInstance("Samsung");
	    
	    tv.turnOn();
	    tv.changeChannel();
	    tv.soundDown();
	    tv.turnOff();  
	}

}
