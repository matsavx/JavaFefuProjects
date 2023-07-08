package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String[] firstName = {"Матвей", "Слава", "Миша"};
        String[] lastName = {"Савченко", "Лебедев", "Зыков"};
        String[] date = {"26.06.2001", "07.03.2000", "29.11.2000"};

        PersonData personData = new PersonData(firstName, lastName, date);

        //Сериализация
        FileOutputStream outputStream = new FileOutputStream("C:\\myfiles\\JavaProjects\\serialization\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(personData);
        objectOutputStream.close();

        //Десериализация
        FileInputStream fileInputStream = new FileInputStream("C:\\myfiles\\JavaProjects\\serialization\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        PersonData personData1 = (PersonData) objectInputStream.readObject();
        System.out.println(personData1);
    }
}
