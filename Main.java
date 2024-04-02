package com.plagahoa22.hgjj;

import com.plagahoa22.hgjj.helpers.Calculator;
import com.plagahoa22.hgjj.helpers.DistanceConverter;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {
        //สร้าง frame
        JFrame frame = new JFrame("Harn gun jon jer");
        frame.setSize(640,480);
        frame.setLayout(null);

        //สร้าง input
        JTextField inputTextField = new JTextField();
        inputTextField.setBounds(20,20 ,550,50);
        frame.add(inputTextField);

        //สร้าง output
        JLabel outputLabel = new JLabel();
        outputLabel.setBounds(20,160 ,500,60);
        frame.add(outputLabel);

        //สร้าง button
        JButton button = new JButton("Calculate");
        button.setBounds(20,100 ,300,60);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputTextField.getText();
                    int inputNumber = Integer.parseInt(inputText);
                String output = Calculator.getDivisbleOutput(inputNumber);
                outputLabel.setText(output);
            }
        });
        frame.add(button);

        //แสดง
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}