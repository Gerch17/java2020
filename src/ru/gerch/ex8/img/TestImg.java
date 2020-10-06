package ru.gerch.ex8.img;


import javax.swing.*;

///home/gerch/Desktop/git/java/src/ru/gerch/ex8/img/apple.png

class TestImg extends JFrame {
    public TestImg(String[] args){
        super("Task 2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setSize(1500, 1300);
        setVisible(true);
        imgCmp img = new imgCmp(args[0]);
        add(img);
        validate();
        repaint();
    }

    public static void main(String[] args) {
        new TestImg(args);
    }


}
