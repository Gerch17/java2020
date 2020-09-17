package ru.gerch.ex2.taskHuman;

public class Hand {
    private boolean isBroken = true;

    public Hand(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public Hand() {
    }

    public void isIsBroken() {
        if(isBroken)
        {
            System.out.print("Рука целая");
        }
        if(!isBroken)
        {
            System.out.print("Рука сломана");
        }

    }

    public void setIsBroken(boolean isBroken) {
        this.isBroken = isBroken;
    }
}
