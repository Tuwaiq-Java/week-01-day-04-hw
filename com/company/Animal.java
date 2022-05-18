package com.company;

public abstract class Animal {
    private String name;


    public Animal(String name) {
        this.name = name;
    }

    //abstract method has nobody and overridden in subclass
    public abstract void greets();

}
