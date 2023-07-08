package com.company;
public class WordList {
    private static String[] myList = {"dog", "cat", "frog", "mouse", "dog"};

    public static int numWordsOfLength (int length) {
        int count = 0;
        String str;

        for (int i = 0; i < 5; i++) {
            str = myList[i];
            if (str.length() == length)
                count++;
        }
        return count;
    }
    public static void main() {
        System.out.println(numWordsOfLength(3));
    }
}
