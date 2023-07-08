package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        WordList myList = new WordList();

        myList.add();
        myList.printList();
        //System.out.println(myList.numWordsOfLength(3));

        myList.removeWordsOfLength(3);

        myList.printList();
        myList.removeWordsOfLength(4);
        myList.printList();

    }
}
