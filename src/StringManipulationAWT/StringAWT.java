package StringManipulationAWT;

import java.awt.*;

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

    }
}
