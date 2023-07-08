package com.company;

import java.io.Serializable;
import java.util.Arrays;

public class PersonData implements Serializable {
    private static final long serialVersionUID = 1L;

    private String[] firstName;
    private String[] lastName;
    private String[] date;

    public PersonData(String[] firstName, String[] lastName, String[] date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
    }
    public String[] getFirstName(){
        return firstName;
    }
    public void setFirstName(){
        this.firstName = firstName;
    }
    public String[] getLastName() {
        return lastName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }
    public String[] getDate(){
        return date;
    }
    public void setDate(){
        this.date = date;
    }

    @Override
    public String toString() {
        return "Личные данные {" + "Имя=" + Arrays.toString(firstName) + " Фамилия=" + Arrays.toString(lastName) + " дата=" + Arrays.toString(date) + '}';
    }
}
