package com.kerson.polymorphism.tv;

public class LgTV implements TV {

    @Override
    public void turnOn() {
        System.out.println( "__KO__ LgTV turnOn()");
    }

    @Override
    public void turnOff() {
        System.out.println( "__KO__ LgTV turnOff()");
    }

    @Override
    public void changeChannel() {
        System.out.println( "__KO__ LgTV changeChannel()");
    }

    @Override
    public void soundUp() {
        System.out.println( "__KO__ LgTV soundUp()");
    }

    @Override
    public void soundDown() {
        System.out.println( "__KO__ LgTV soundUp()");
    }

}
