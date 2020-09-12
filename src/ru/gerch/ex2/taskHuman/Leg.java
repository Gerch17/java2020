package ru.gerch.ex2.taskHuman;

public class Leg {
    private static int length;

    public Leg(int length) {
        Leg.length = length;
    }

    public static int getLength() {
        return length;
    }

    public static void setLength(int length) {
        Leg.length = length;
    }
}
