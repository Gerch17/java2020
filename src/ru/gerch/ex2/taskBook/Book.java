package ru.gerch.ex2.taskBook;

public class Book {
    private String author;
    private String name;
    private int year;
    private int pages;
    private Boolean isRecommended;

    public Book(String author, String name, int year, int pages, Boolean isRecommended) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.pages = pages;
        this.isRecommended = isRecommended;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public Boolean getRecommended() {
        return isRecommended;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setRecommended(Boolean recommended) {
        isRecommended = recommended;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Автор ='" + author + '\'' +
                ", Название книги ='" + name + '\'' +
                ", Год выпуска =" + year +
                ", Количество страниц =" + pages +
                ", Рекомендуют ли эту книгу =" + isRecommended +
                '}';
    }
}
