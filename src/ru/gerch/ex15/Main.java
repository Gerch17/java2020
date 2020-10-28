package ru.gerch.ex15;

public class Main {
    public static void main(String[] args) {
        IntList arr = new IntList(10);
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        System.out.println(arr.size());
        System.out.println(arr.get(4));
        System.out.println(arr.search(4));
        System.out.println(arr);
        arr.set(6, 420);
        arr.set(9, -69);
        System.out.println(arr);
        System.out.println(arr.getMax());
        System.out.println(arr.getMin());
        System.out.println(arr.avg());
        arr.remove(4);
        System.out.println(arr);
    }
}