package ru.gerch.ex2;

public class Dog {
    private static String name;
    private static int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Dog.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Dog.age = age;
    }

    public static int ageConvert()
    {
        return age*7;
    }

    @Override
    public String toString() {
        return "Собака по имени " + name + ". Возраст " + age;
    }
}
