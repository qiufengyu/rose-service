package com.pure.rose.utils;

import com.fasterxml.jackson.databind.ser.Serializers;

public class BaseObject {
    public int intValue;
    protected double doubleValue;

    public BaseObject() {
        this.intValue = 1;
        this.doubleValue = 2.0;
    }

    public String getValues() {
        return "" + intValue + ", " + doubleValue;
    }
}
