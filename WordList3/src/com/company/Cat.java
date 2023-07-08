package com.company;

public class Cat extends Pet {

    private String myName;
    public Cat(String name){
        super(name);
        myName = name;
    }
    public String getName(){
        return myName;
    }
    public String speak(){
        return "meow";
    }
}
