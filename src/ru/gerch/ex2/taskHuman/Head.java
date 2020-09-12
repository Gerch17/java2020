package ru.gerch.ex2.taskHuman;

public class Head {
    private static String color;

    public Head(String color) {
        Head.color = color;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Head.color = color;
    }
}
