package ru.gerch.ex2.taskBook;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("German", "Best book", 2020, 420, true);
        System.out.printf(book.toString());
    }
}
