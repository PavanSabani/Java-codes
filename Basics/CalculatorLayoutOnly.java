package Basics;

import javax.swing.*;
import java.awt.*;

public class CalculatorLayoutOnly extends JFrame {

    public CalculatorLayoutOnly() {
        setTitle("Simple Arithmetic Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // Set layout manager - 5 rows, 2 columns
        setLayout(new GridLayout(5, 2, 10, 10));

        // Components
        JLabel num1Label = new JLabel("Enter Number 1:");
        JTextField num1Field = new JTextField();

        JLabel num2Label = new JLabel("Enter Number 2:");
        JTextField num2Field = new JTextField();

        JButton addButton = new JButton("Add (+)");
        JButton subButton = new JButton("Subtract (-)");

        JButton mulButton = new JButton("Multiply (×)");
        JButton divButton = new JButton("Divide (÷)");

        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false); // Just for display

        // Add components to frame (in order)
        add(num1Label);
        add(num1Field);

        add(num2Label);
        add(num2Field);

        add(addButton);
        add(subButton);

        add(mulButton);
        add(divButton);

        add(resultLabel);
        add(resultField);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorLayoutOnly();
    }
}
