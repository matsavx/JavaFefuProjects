package com.company;

public class LoudDog extends Dog {
    private String myName;
    public LoudDog(String name){
        super(name);
        myName = name;
    }
    public String speak(){
        return "bark bark";
    }
}
