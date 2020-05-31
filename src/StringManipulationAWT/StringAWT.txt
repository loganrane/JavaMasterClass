package StringManipulationAWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class StringAWT {
    StringAWT(){
        // Creating the frame class and setting the necessary size, and layout.
        Frame frame = new Frame("String Functions");

        // Labels for info about the text field.
        Label string1 = new Label("Enter String 1 : ");
        Label string2 = new Label("Enter String 2 : ");
        Label res  = new Label("Results : ");

        // Text fields for input of data and display of results.
        TextField s1 = new TextField();
        TextField s2 = new TextField();
        TextArea result = new TextArea();

        // Buttons to perform different tasks.
        Button b1 = new Button("LENGTH");
        Button b2 = new Button("CONCAT");
        Button b3 = new Button("EQUALITY");
        Button b4 = new Button("REVERSE");
        Button b5 = new Button("HAMMING DIST");
        Button b6 = new Button("SURPRISE");
        Button b7 = new Button("ALL CHAR");
        Button b8 = new Button("COMMON CHAR");
        Button b9 = new Button("DELETE CHAR");
        Button b0 = new Button("SUM OF ASCII");

        // Adding event listeners.
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp1 = s1.getText();
                String temp2 = s2.getText();
                result.setText("The length of String 1 : " + temp1.length() + "\n\nThe length of String 2 : " + temp2.length());
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp1 = s1.getText();
                String temp2 = s2.getText();
                result.setText(temp1 + " + " + temp2 + " is " + temp1.concat(temp2));
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp1 = s1.getText();
                String temp2 = s2.getText();
                if(temp1.equals(temp2)){
                    result.setText("Both the strings are equal.");
                }
                else{
                    result.setText("Both the strings are not equal.");
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp1 = s1.getText();
                String temp2 = s2.getText();
                StringBuilder ans1 = new StringBuilder();
                StringBuilder ans2 = new StringBuilder();
                for(int i=temp1.length() - 1; i>=0; i--){
                    ans1.append(temp1.charAt(i));
                }
                for(int i = temp2.length() -1; i>=0; i--){
                    ans2.append(temp2.charAt(i));
                }
                result.setText("The reverse of string 1 : " + ans1 + "\n\nThe reverse of string 2 : " + ans2);
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp1 = s1.getText();
                String temp2 = s2.getText();
                if(temp1.length() != temp2.length()){
                    result.setText("Enter string of equal length.");
                }
                else{
                    int count = 0;
                    for(int i=0; i<temp1.length();i++){
                        if(temp1.charAt(i) != temp2.charAt(i)) count++;
                    }
                    result.setText("The hamming distance of both strings is " + count);
                }
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int lucky;
                Random r = new Random();
                lucky = r.nextInt(10);
                result.setText("I couldn't think of any more string operations, \nSo, I added this. \n\nYour lucky number for today is : " + lucky);
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp1 = s1.getText();
                String temp2 = s2.getText();
                String ans = (temp1 + temp2).toLowerCase();
                int i = 0;
                while (i < ans.length()){
                    char c = ans.charAt(i);
                    if(i != ans.lastIndexOf(c)){
                        ans = ans.substring(0, i) + ans.substring(i+1, ans.length());
                    }
                    i++;
                }
                result.setText("All the characters in both the string is : " + ans);
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp1 = s1.getText();
                String temp2 = s2.getText();
                StringBuilder ans = new StringBuilder();
                for(char c : temp1.toCharArray()){
                    if(temp2.indexOf(c) != -1 && ans.toString().indexOf(c) == -1){
                        ans.append(c);
                    }
                }
                result.setText("The common characters in both the string is : " + ans);
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp1 = s1.getText();
                String temp2 = s2.getText();
                for(char c : temp2.toCharArray()){
                    while(temp1.indexOf(c) != -1){
                        int i = temp1.indexOf(c);
                        temp1 = temp1.substring(0, i) + temp1.substring(i+1, temp1.length());
                    }
                }
                result.setText("The string after deleting all characters : " + temp1);
            }
        });

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp1 = s1.getText();
                String temp2 = s2.getText();
                int ans1 = 0;
                int ans2 = 0;
                for(int i =0; i<temp1.length();i++){
                    int a = temp1.charAt(i);
                    ans1 += a;
                }
                for(int i=0; i<temp2.length(); i++){
                    int a = temp2.charAt(i);
                    ans2 += a;
                }
                result.setText("The sum of ASCII value of string 1 : " + ans1 + "\n\nThe sum of ASCII value of string 2 : " + ans2);
            }
        });


        // Adding all the elements to the frame.
        frame.add(string1); frame.add(s1);
        frame.add(string2); frame.add(s2);
        frame.add(res);  frame.add(result);
        frame.add(b1);   frame.add(b2);
        frame.add(b3);   frame.add(b4);
        frame.add(b5);   frame.add(b6);
        frame.add(b7);   frame.add(b8);
        frame.add(b9);   frame.add(b0);

        // Choosing the layout and setting the size of the frame.
        frame.setVisible(true);
        frame.setSize(800, 800);
        frame.setLayout(new GridLayout(8 , 2, 1, 1));

    }

    public static void main(String[] args) {
        new StringAWT();
    }
}
