package com.sda.messagesender;

public abstract class User {

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Contact getPreferableContact();


    public static enum Contact {
        SMS, MAIL, EMAIL
    }
}
