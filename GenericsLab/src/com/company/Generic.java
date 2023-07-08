package com.company;

public class Generic<arr> {

    private final arr[] myArray;

    public Generic(arr[] myArray){
        this.myArray = myArray;
    }

    public boolean Search(arr data){
        try {
            if (myArray.length == 0)
                throw new Exception("Массив пуст");
            int counter = 0;
            for (arr tmp : myArray) {
                if(tmp == data)
                    counter ++;
            }
            if (counter == 0)
                throw new Exception("Такого элемента не существует");
                return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
