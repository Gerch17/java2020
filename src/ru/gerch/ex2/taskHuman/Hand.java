package ru.gerch.ex2.taskHuman;

public class Hand {
    private static boolean isBroken;

    public Hand(boolean isBroken) {
        Hand.isBroken = isBroken;
    }

    public static void isIsBroken() {
        if(isBroken == true)
        {
            System.out.println("Рука целая");
        }else
        {
            System.out.println("Рука сломана");
        }

    }

    public static void setIsBroken(boolean isBroken) {
        Hand.isBroken = isBroken;
    }
}
