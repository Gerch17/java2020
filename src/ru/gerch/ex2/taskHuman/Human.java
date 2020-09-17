package ru.gerch.ex2.taskHuman;

public class Human {
    private Hand handRight = new Hand();
    private Hand handLeft = new Hand();
    private Leg legRight = new Leg();
    private Leg legLeft = new Leg();
    private Head head = new Head();

    public Human() {
    }

    public Human(Boolean isBrokenRight, Boolean isBrokenLeft, int legLeftLength, int legRightLength, String headColor) {
        handRight.setIsBroken(isBrokenRight);
        handLeft.setIsBroken(isBrokenLeft);
        legLeft.setLength(legLeftLength);
        legRight.setLength(legRightLength);
        head.setColor(headColor);
    }

    public void setHead(String  headColor) {
        head.setColor(headColor);
    }

    public void setLegLeft(int length) {
        legLeft.setLength(length);
    }

    public void setLegRight(int length) {
        legRight.setLength(length);
    }

    public void setHandLeft(Boolean isBroken) {
        handLeft.setIsBroken(isBroken);
    }

    public void setHandRight(Boolean isBroken) {
        handRight.setIsBroken(isBroken);
    }

    public String getHead() {
        return head.getColor();
    }

    public int getLegLeft() {
        return legLeft.getLength();
    }

    public int getLegRight() {
        return legRight.getLength();
    }

    public void getHandLeft() {
        handLeft.isIsBroken();
    }

    public void getHandRight() {
        handRight.isIsBroken();
    }
}
