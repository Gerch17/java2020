package ru.gerch.ex17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GameField extends JPanel implements ActionListener {
    private int score = 0;
    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private Image dot;
    private Image food;
    private int foodX;
    private int foodY;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame  =true;

    public GameField() {
        setBackground(Color.black);
        loadImages();
        initGame();
        addKeyListener(new FieldKeyListener());
        setFocusable(true);
    }

    public void initGame() {
        dots = 3;
        for (int i = 0; i < dots; i++)
        {
            x[i] = 48 - i * DOT_SIZE;
            y[i] = 48;
        }
        timer = new Timer(250, this);
        timer.start();
        createApple();
    }

    public void createApple()
    {
        foodX = new Random().nextInt(20)*DOT_SIZE;
        foodY = new Random().nextInt(20)*DOT_SIZE;
    }

    public void loadImages()
    {
        ImageIcon foodBurger = new ImageIcon("/home/gerch/Desktop/git/java/src/ru/gerch/ex17/Disk.png");
        food = foodBurger.getImage();
        ImageIcon snakeIcon = new ImageIcon("/home/gerch/Desktop/git/java/src/ru/gerch/ex17/User.png");
        dot = snakeIcon.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(inGame)
        {
            g.drawImage(food, foodX, foodY, this);
            for (int i = 0; i < dots; i++) {
                g.drawImage(dot, x[i], y[i], this);
            }
        }else
        {
            String str = "Game Over!";
            String strScore = "Your score = " + score;
            g.setColor(Color.blue);
            g.drawString(str,125,SIZE/2);
            g.drawString(strScore, 120, SIZE/2+20);
        }
    }

    public void move()
    {
        for (int i = dots; i > 0; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        if(left) x[0] -= DOT_SIZE;
        if(right) x[0] += DOT_SIZE;
        if(up) y[0] -= DOT_SIZE;
        if(down) y[0] += DOT_SIZE;
    }

    public void checkApple()
    {
        if(x[0] == foodX && y[0] == foodY)
        {
            dots++;
            score++;
            createApple();
        }
    }

    public void checkCollisions()
    {
        for (int i = dots; i > 0; i--) {
            if(i > 4 && x[0] == x[i] && y[i] == y[0])
            {
                inGame = false;
            }
        }
        if(x[0]>SIZE) inGame = false;
        if(x[0]<0) inGame = false;
        if(y[0]>SIZE) inGame = false;
        if(y[0]<0) inGame = false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(inGame)
        {
            checkCollisions();
            checkApple();
            move();
        }
        repaint();
    }

    class FieldKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int key = e.getKeyCode();
            if(key == KeyEvent.VK_LEFT && ! right) {
                left = true;
                up = false;
                down = false;
            }
            if(key == KeyEvent.VK_RIGHT && ! left) {
                right = true;
                up = false;
                down = false;
            }
            if(key == KeyEvent.VK_UP && ! down) {
                left = false;
                up = true;
                right = false;
            }
            if(key == KeyEvent.VK_DOWN && ! up) {
                left = false;
                right = false;
                down = true;
            }
        }
    }
}
