package com.company;

import java.util.ArrayList;

public class WordList {
    static public ArrayList<String> arrayList;

    WordList() {
        arrayList = new ArrayList<>();
    }

    public static void add() {
        arrayList.add("dog");
        arrayList.add("cat");
        arrayList.add("mouse");
        arrayList.add("frog");
        arrayList.add("Jack");
        arrayList.add("Joe");
        arrayList.add("James");
        arrayList.add("Me");
    }

    public static int numWordsOfLength(int value) {
        int count = 0;

        for (String s : arrayList) {
            if (s.length() == value)
                count++;
        }

        return count;
    }

    public static void removeWordsOfLength(int value) {
        arrayList.removeIf(s -> s.length() == value);
    }
    public static void printList() {
        for (int i = 0; i != arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println();
    }
}
