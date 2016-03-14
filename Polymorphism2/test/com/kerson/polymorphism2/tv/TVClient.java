package com.kerson.polymorphism2.tv;

public class TVClient {
	public static void main(String[] args) {
	    /* 
	     * 1.new로 지정되는 객체의 변경만으로 TV를 바꿀 수 있음.
	     * 2.new xxTv() 라인 이후의 라인은 수정할 필요가 없음.
	     * 3.이로인해 TV변경에 따른 소스수정 라인이 대폭 감소함.
	     * 4.하지만, 그래도 TV를 변경하려면 new xxTV()를 변경해야만 함.
	     */
	    TV tv = new SamsungTV(); 
	    //TV tv = new LgTv();
	    
	    tv.turnOn();
	    tv.changeChannel();
	    tv.soundDown();
	    tv.turnOff();  
	}

}
