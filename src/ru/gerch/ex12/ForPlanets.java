package ru.gerch.ex12;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ForPlanets extends JFrame {

    private static final Random random = new Random();
    public static final int width = 400;
    public static final int height = 200;
    private static final int secret = random.nextInt(19) + 1;
    private static int count = 0;
    private static final double G = 6.67;
    public ForPlanets(){
        super("Task 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        JButton btn = new JButton("Click");
        JComboBox planetList = new JComboBox(Planets.values());
        JLabel label1 = new JLabel("Гравитации Земли = 9.8");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Planets planets = (Planets)planetList.getSelectedItem();

                double grav = planets.gravity() / 1000000000000.00;
                label1.setText("Гравитация " + planets.getName() + " = " + grav);
            }
        });
        panel.add(label1);
        panel.add(btn);
        panel.add(planetList);
        setContentPane(panel);
        setSize(width, height);
        setVisible(true);
        System.out.println(secret);
    }

}