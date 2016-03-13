package com.kerson.polymorphism.tv;

public class TVClient {
	public static void main(String[] args) {
	    TV tv = new SamsungTV();   
	    
	    tv.turnOn();
	    tv.changeChannel();
	    tv.soundDown();
	    tv.turnOff();  
	}

}
