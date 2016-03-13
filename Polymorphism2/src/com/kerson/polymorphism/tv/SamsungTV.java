package com.kerson.polymorphism.tv;

public class SamsungTV implements TV {

    @Override
    public void turnOn() {
        System.out.println( "__KO__ SamsungTV turnOn()");
    }

    @Override
    public void turnOff() {
        System.out.println( "__KO__ SamsungTV turnOff()");
    }

    @Override
    public void changeChannel() {
        System.out.println( "__KO__ SamsungTV changeChannel()");
    }

    @Override
    public void soundUp() {
        System.out.println( "__KO__ SamsungTV soundUp()");
    }

    @Override
    public void soundDown() {
        System.out.println( "__KO__ SamsungTV soundUp()");
    }
}
