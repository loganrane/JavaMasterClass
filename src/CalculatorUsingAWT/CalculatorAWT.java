package CalculatorUsingAWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorAWT {
    CalculatorAWT(){
        // Creating the frame class and setting the necessary size, and layout.
        Frame frame = new Frame("Calculator");

        // Labels for info about the text field.
        Label num1 = new Label("Enter Number 1 : ");
        Label num2 = new Label("Enter Number 2 : ");
        Label res  = new Label("Results : ");

        // Text fields for input of data and display of results.
        TextField number1 = new TextField();
        TextField number2 = new TextField();
        TextArea number3 = new TextArea();

        // Buttons to perform different tasks.
        Button b1 = new Button("ADD");
        Button b2 = new Button("SUB");
        Button b3 = new Button("MUL");
        Button b4 = new Button("DIV");
        Button b5 = new Button("XOR");
        Button b6 = new Button("AND");
        Button b7 = new Button("OR");
        Button b8 = new Button("PERCENT");
        Button b9 = new Button("POWER");
        Button b0 = new Button("ROOT");

        // Adding event listeners to all the buttons.
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(number1.getText());
                    int num2 = Integer.parseInt(number2.getText());
                    int temp;
                    temp = num1 + num2;
                    number3.setText(num1 + " + "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    number3.setText("Enter valid Numbers.");
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(number1.getText());
                    int num2 = Integer.parseInt(number2.getText());
                    int temp;
                    temp = num1 - num2;
                    number3.setText(num1 + " - "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    number3.setText("Enter valid Numbers.");
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(number1.getText());
                    int num2 = Integer.parseInt(number2.getText());
                    int temp;
                    temp = num1 * num2;
                    number3.setText(num1 + " * "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    number3.setText("Enter valid Numbers.");
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(number1.getText());
                    float num2 = Float.parseFloat(number2.getText());
                    float temp;
                    temp = num1 / num2;
                    number3.setText(num1 + " / "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    number3.setText("Enter valid Numbers.");
                }
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(number1.getText());
                    int num2 = Integer.parseInt(number2.getText());
                    int temp;
                    temp = num1 ^ num2;
                    number3.setText(num1 + " XOR "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    number3.setText("Enter valid Numbers.");
                }
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(number1.getText());
                    int num2 = Integer.parseInt(number2.getText());
                    int temp;
                    temp = num1 & num2;
                    number3.setText(num1 + " AND "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    number3.setText("Enter valid Numbers.");
                }
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(number1.getText());
                    int num2 = Integer.parseInt(number2.getText());
                    int temp;
                    temp = num1 | num2;
                    number3.setText(num1 + " OR "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    number3.setText("Enter valid Numbers.");
                }
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(number1.getText());
                    float num2 = Float.parseFloat(number2.getText());
                    float temp;
                    temp = num1 * num2 / 100;
                    number3.setText(num1 + " % "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    number3.setText("Enter valid Numbers.");
                }
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(number1.getText());
                    int num2 = Integer.parseInt(number2.getText());
                    int temp;
                    temp = (int) Math.pow(num1, num2);
                    number3.setText(num1 + " powered "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    number3.setText("Enter valid Numbers.");
                }
            }
        });

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(number1.getText());
                    int num2 = Integer.parseInt(number2.getText());
                    float temp1 = (float) Math.sqrt(num1);
                    float temp2 = (float) Math.sqrt(num2);
                    number3.setText("Sqrt of number 1 : " + temp1 + "\n\nSqrt of number 2 : " + temp2);
                }
                catch (Exception exc){
                    number3.setText("Enter valid Numbers.");
                }
            }
        });

        // Adding all the elements to the frame.
        frame.add(num1); frame.add(number1);
        frame.add(num2); frame.add(number2);
        frame.add(res);  frame.add(number3);
        frame.add(b1);   frame.add(b2);
        frame.add(b3);   frame.add(b4);
        frame.add(b5);   frame.add(b6);
        frame.add(b7);   frame.add(b8);
        frame.add(b9);   frame.add(b0);

        // Choosing the layout and setting the size of the frame.
        frame.setVisible(true);
        frame.setSize(400, 800);
        frame.setLayout(new GridLayout(8 , 2, 1, 1));
    }

    public static void main(String[] args) {
        new CalculatorAWT();
    }
}
