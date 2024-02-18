package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        PhoneBook phoneBook = new PhoneBook();
        while (running) {
            System.out.println("Введите имя ");
            String name = scanner.nextLine();
            System.out.println("Введите телефон ");
            String phone = scanner.nextLine();

            if (!isNumeric(phone)) {
                System.out.println("Введенное значение не является числом");
                System.out.println("Номер не был введен");
            } else {
                phoneBook.add(name, phone);
            } ;
            System.out.println("Для окончания ввода номера введите 'q'");
            System.out.println("Для продолжения нажмите любую клавишу");
            String command = scanner.nextLine();
            if (command.toLowerCase().equals("q")){
                running = false;
            }
        }
        phoneBook.viewPhoneBook();
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}