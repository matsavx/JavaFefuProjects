package com.company;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DB.Connection();
        DB.Creation();
        DB.Write();
        DB.Read();
        DB.Exit();
    }
}
