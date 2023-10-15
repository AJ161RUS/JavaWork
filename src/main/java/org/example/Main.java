package org.example;

//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами,
//их необходимо считать, как одного человека с разными телефонами.
//Вывод должен быть отсортирован по убыванию числа телефонов.
public class Main {
    public static void main(String[] args) {
       PhoneBook.addCont("Андрей", "89885620869");
        PhoneBook.addCont("Андрей", "89385698563");
        PhoneBook.addCont("Максим", "89863569851");
        PhoneBook.addCont("Дима", "89886420766");
        PhoneBook.addCont("Андрей", "89889682822");
        PhoneBook.addCont("Дима", "89283698657");

       PhoneBook.printContact();


    }
}