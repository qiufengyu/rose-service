package com.pure.rose.utils;

public class MyObject extends BaseObject {

    private String myName;

    private int intValue;

    public MyObject() {
        super();
        myName = "Good";
    }

    @Override
    public String getValues() {
        return myName + " super : " + super.intValue + ", " + intValue + ", " + doubleValue;
    }
}
