package com.company;

import java.sql.*;

public class DB {
    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;

    //Подключение
    public static void Connection() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:TEST1.s3db");

        System.out.println("База данных подключена и готова к работе");
    }

    //Создание
    public static void Creation() throws SQLException {
        statement = connection.createStatement();
        statement.execute("CREATE TABLE if not exists 'users' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'author' text, 'book' text);");
        System.out.println("Таблица создана или уже существует.");
    }

    //Заполнение
    public static void  Write() throws SQLException {
        statement.execute("INSERT INTO 'users' ('author', 'book') VALUES ('А.С.Пушкин', 'Капитанская дочка'); ");
        statement.execute("INSERT INTO 'users' ('author', 'book') VALUES ('Л.Н.Толстой', 'Детство'); ");
        statement.execute("INSERT INTO 'users' ('author', 'book') VALUES ('М.Ю.Лермонтов', 'Смерть поэта'); ");

        System.out.println("Таблица заполнена");
    }

    //Вывод
    public static void Read() throws SQLException {
        resultSet = statement.executeQuery("SELECT * FROM users");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String  author = resultSet.getString("author");
            String  book = resultSet.getString("book");
            System.out.println("Номер = " + id);
            System.out.println("Имя автора = " + author);
            System.out.println("Название книги = " + book);
            System.out.println();
        }
        System.out.println("Таблица выведена полностью");
    }

    public static void Exit() throws SQLException {
        connection.close();
        statement.close();
        resultSet.close();
    }
}
