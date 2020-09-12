package ru.gerch.ex2.taskHuman;

public class Human {
    private static Hand handRight;
    private static Hand handLeft;
    private static Leg legRight;
    private static Leg legLeft;
    private static Head head;

    public Human(Hand handRight, Hand handLeft, Leg legLeft, Leg legRight, Head head) {
        Human.handRight = handRight;
        Human.handLeft = handLeft;
        Human.legLeft = legLeft;
        Human.legRight = legRight;
        Human.head = head;
    }

    public static void setHead(Head head) {
        Human.head = head;
    }

    public static void setLegLeft(Leg legLeft) {
        Human.legLeft = legLeft;
    }

    public static void setLegRight(Leg legRight) {
        Human.legRight = legRight;
    }

    public static void setHandLeft(Hand handLeft) {
        Human.handLeft = handLeft;
    }

    public static void setHandRight(Hand handRight) {
        Human.handRight = handRight;
    }

    public static Head getHead() {
        return head;
    }

    public static Leg getLegLeft() {
        return legLeft;
    }

    public static Leg getLegRight() {
        return legRight;
    }

    public static void getHandLeft() {
        handLeft.isIsBroken();
    }

    public static void getHandRight() {
        handRight.isIsBroken();
    }
}
