package com.kerson.polymorphism3.tv;

public class TVFactory {
    
    public Object getInstance ( String id ) {
        if ( id.equals ( "LG" ) ) {
            return new LgTV();
            
        } else if ( id.equals("Samsung") ) {
            return new SamsungTV();
        }
        
        return new Object(); 
    }
}
