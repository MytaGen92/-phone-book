package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, ArrayList<Integer>> phoneBook = new HashMap<String, ArrayList<Integer>>();

    public void add(String name, String phone) {
        ArrayList savedNumbers = phoneBook.get(name);
        ArrayList newNumber = new ArrayList<Integer>();
        newNumber.add(Integer.parseInt(phone));
        if (savedNumbers != null) {
            newNumber.addAll(savedNumbers);
        }
        phoneBook.put(name, newNumber);
    }

    public void viewPhoneBook() {
        System.out.println("Телефонная книга");
        ArrayList numbers = new ArrayList<Integer>();
        ArrayList sortedNumbers = new ArrayList<Integer>();
        for (String key : phoneBook.keySet()) {
            numbers = phoneBook.get(key);
            Collections.sort(numbers, Collections.reverseOrder());
            System.out.println("Имя: " + key + ", Номера телефонов: " + numbers.toString());
        }
        ;
    }
}
