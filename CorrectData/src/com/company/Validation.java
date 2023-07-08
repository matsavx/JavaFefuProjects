package com.company;

import java.util.regex.Pattern;

public class Validation {
    static boolean isCorrectAddress(String str) {
        return Pattern.matches("(([Уу]л)(.+)( д )[0-9]( кв )[0-9])",str);
    }
    static boolean isCorrectPersonalDocuments(String str) {
        return Pattern.matches("[0-9]{4}(\\s)[0-9]{6}(\\s)([Уу]л)(.+)(\\sд)(\\s)[0-9](\\sкв)(\\s)[0-9](\\s)[0-9]{11}", str);
    }
    static boolean isCorrectPersonData(String str) {
        return Pattern.matches("[А-Я][а-я]+(\\s)[А-Я][а-я]+(\\s)[А-Я][а-я]+(\\s)[0-3][0-9](.)[0-3][0-9](.)[0-9]{4}(\\s)[А-Я][а-я]+",str);
    }
    static boolean isCorrectBookData(String str) {
        return Pattern.matches("[А-Я](.)[А-Я](.)[А-Я][а-я]+(\\s)([А-Я][а-я]+(\\s))+[А-Я][а-я]+(\\s)[0-9]{4}(\\s)[0-9]+", str);
    }
}
