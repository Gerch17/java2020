package ru.gerch.ex3.taskHuman;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human(true, false, 51, 50, "Белая");

        System.out.print("Человек: " + "\nЦвет головы - " + human.getHead() + "\nСостояние правой руки - ");
        human.getHandRight();
        System.out.print("\nСостояние левой руки - ");
        human.getHandLeft();
        System.out.println("\nДлина правой ноги - " + human.getLegRight() + "\nДлина левой ноги - " + human.getLegLeft());
    }
}
