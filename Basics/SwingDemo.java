package Basics;

import javax.swing.*;

public class SwingDemo {
    SwingDemo() {
        JFrame jf = new JFrame("My first application");
        jf.setSize(400, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jl = new JLabel("Welcome");
        jf.add(jl);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
