package com.example.myapplication.factory;

/**
 * 工厂类
 */
public class PhoneFactory {
    public static Phone createPhone(String type) {
        if (type.equals("miPhone")) {
            return new MiPhone();
        } else if (type.equals("iPhone")) {
            return new IPhone();
        }
        return null;
    }

}