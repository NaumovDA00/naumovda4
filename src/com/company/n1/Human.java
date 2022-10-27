package com.company.n1;

public class Human {
    public String name;
    public String surname;
    public int birthyear;
    public static int year = 2022;
    public int age;
    public int birth() {
        age = year - birthyear;
        return age;
    }
    public void vivod() {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Возраст: " + age);
    }
}
