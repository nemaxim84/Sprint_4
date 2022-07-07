package com.example;
public class Account {
    private final String name;
    public Account(String name) throws NullPointerException {
        this.name = name;
        try {
            name = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        boolean checkNameToEmboss;
        if (name.matches("[^\\s]*\\w+\\s\\w+")&&name.matches("[\\w\\s]{3,19}")){
            return true;
        }
        else return false;
    }
}
