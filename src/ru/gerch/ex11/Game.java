package ru.gerch.ex11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class Game extends JFrame {

    private static final Random random = new Random();
    public static final int width = 200;
    public static final int height = 100;
    private static final int secret = random.nextInt(19) + 1;
    private static int count = 0;
    public Game(){
        super("Task 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        JButton button = new JButton("Проверить");
        button.setBounds(10, 10, 50, 50);
        JTextField textField = new JTextField("", 10);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userNum = Integer.parseInt(textField.getText());
                if (userNum == secret){
                    JOptionPane.showMessageDialog(Game.this, "Вы угадали число!!!");
                    System.exit(0);
                } else if (userNum > secret){
                    JOptionPane.showMessageDialog(Game.this,"Загаданное число меньше");
                } else {
                    JOptionPane.showMessageDialog(Game.this, "Загаданное число больше");
                }
                count++;
                if (count >= 3){
                    JOptionPane.showMessageDialog(Game.this, "У вас закончились попытки");
                    System.exit(0);
                }
            }
        });
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        panel.add(textField);
        panel.add(button);
        setContentPane(panel);
        setSize(width, height);
        setVisible(true);
        System.out.println(secret);
    }
}