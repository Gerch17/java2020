package ru.gerch.ex3.taskHuman;

public class Head {
    private static String color;

    public Head() {
    }

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
