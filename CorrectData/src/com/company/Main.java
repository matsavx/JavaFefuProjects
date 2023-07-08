package com.company;

public class Main {

    public static void main(String[] args) {
        //ул "название" д "номер" кв "номер"
        System.out.println(Validation.isCorrectAddress("Ул большая д 9 кв 2"));

        //"Серия" "номер" ул "название" д "номер" кв "номер" "СНИЛС"
        System.out.println(Validation.isCorrectPersonalDocuments("sdfsd 449956 Ул большая д 9 кв 2 12345678910"));

        //"Фамилия" "Имя" "Отчество" "дд.мм.гггг" "Город"
        System.out.println(Validation.isCorrectPersonData("Савченко Матвей Евгеньевич 26.06.2001 Свободный"));

        //"Автор" "назание произведения" "издательство" "год" "кол-во страниц"
        System.out.println(Validation.isCorrectBookData("А.С.Пушкин Евгений Онегин Москва 1830 736"));
    }
}
