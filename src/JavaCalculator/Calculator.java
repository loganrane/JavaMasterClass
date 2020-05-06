package JavaCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel mainPanel;
    private JButton XORButton;
    private JButton rootButton;
    private JButton ORButton;
    private JButton ANDButton;
    private JButton powerButton;
    private JButton multButton;
    private JButton divButton;
    private JButton percentButton;
    private JButton subButton;
    private JButton addButton;
    private JTextField enterFirstNumber;
    private JTextField enterSecondNumber;
    private JTextArea resultWillBeDisplayed;


    Calculator(){
        JFrame frame = new JFrame("Calculator APP");
        frame.setSize(700,500);
        frame.setVisible(true);
        frame.getContentPane().add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(enterFirstNumber.getText());
                    int num2 = Integer.parseInt(enterSecondNumber.getText());
                    int temp;
                    temp = num1 + num2;
                    resultWillBeDisplayed.setText(num1 + " + "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    resultWillBeDisplayed.setText("Enter valid Numbers.");
                }
            }
        });
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(enterFirstNumber.getText());
                    int num2 = Integer.parseInt(enterSecondNumber.getText());
                    int temp;
                    temp = num1 - num2;
                    resultWillBeDisplayed.setText(num1 + " - "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    resultWillBeDisplayed.setText("Enter valid Numbers.");
                }
            }
        });
        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(enterFirstNumber.getText());
                    int num2 = Integer.parseInt(enterSecondNumber.getText());
                    int temp;
                    temp = num1 * num2;
                    resultWillBeDisplayed.setText(num1 + " * "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    resultWillBeDisplayed.setText("Enter valid Numbers.");
                }
            }
        });
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(enterFirstNumber.getText());
                    float num2 = Float.parseFloat(enterSecondNumber.getText());
                    float temp;
                    temp = num1 / num2;
                    resultWillBeDisplayed.setText(num1 + " / "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    resultWillBeDisplayed.setText("Enter valid Numbers.");
                }
            }
        });
        XORButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(enterFirstNumber.getText());
                    int num2 = Integer.parseInt(enterSecondNumber.getText());
                    int temp;
                    temp = num1 ^ num2;
                    resultWillBeDisplayed.setText(num1 + " XOR "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    resultWillBeDisplayed.setText("Enter valid Numbers.");
                }
            }
        });
        ANDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(enterFirstNumber.getText());
                    int num2 = Integer.parseInt(enterSecondNumber.getText());
                    int temp;
                    temp = num1 & num2;
                    resultWillBeDisplayed.setText(num1 + " AND "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    resultWillBeDisplayed.setText("Enter valid Numbers.");
                }
            }
        });
        ORButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(enterFirstNumber.getText());
                    int num2 = Integer.parseInt(enterSecondNumber.getText());
                    int temp;
                    temp = num1 | num2;
                    resultWillBeDisplayed.setText(num1 + " OR "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    resultWillBeDisplayed.setText("Enter valid Numbers.");
                }
            }
        });
        powerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(enterFirstNumber.getText());
                    int num2 = Integer.parseInt(enterSecondNumber.getText());
                    int temp;
                    temp = (int) Math.pow(num1, num2);
                    resultWillBeDisplayed.setText(num1 + " powered "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    resultWillBeDisplayed.setText("Enter valid Numbers.");
                }
            }
        });
        rootButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(enterFirstNumber.getText());
                    int num2 = Integer.parseInt(enterSecondNumber.getText());
                    float temp1 = (float) Math.sqrt(num1);
                    float temp2 = (float) Math.sqrt(num2);
                    resultWillBeDisplayed.setText("Sqrt of number 1 : " + temp1 + " // Sqrt of number 2 : " + temp2);
                }
                catch (Exception exc){
                    resultWillBeDisplayed.setText("Enter valid Numbers.");
                }
            }
        });
        percentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(enterFirstNumber.getText());
                    float num2 = Float.parseFloat(enterSecondNumber.getText());
                    float temp;
                    temp = num1 * num2 / 100;
                    resultWillBeDisplayed.setText(num1 + " % "  + num2 + " = " + temp);
                }
                catch (Exception exc){
                    resultWillBeDisplayed.setText("Enter valid Numbers.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator();
            }
        });
    }
}
