package com.company;

public class Dog extends Pet {

    private String myName;
    public Dog(String name){
        super(name);
        myName = name;
    }
    public String getName(){
        return myName;
    }
    public String speak(){
        return "bark";
    }
}
