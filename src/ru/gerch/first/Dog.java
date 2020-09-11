package ru.gerch.first;

public class Dog {
    private static string name;
    private static int age;

    public Dog(string name, int age) {
        this.name = name;
        this.age = age;
    }

    public static string getName() {
        return name;
    }

    public static void setName(string name) {
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
