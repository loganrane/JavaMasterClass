package IntroSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField implements ActionListener {
    JTextField jTextField;
    JButton reverseButton;
    JLabel promptLabel;
    JLabel contentLabel;

    public TextField(){
        // Main shits.
        JFrame jFrame = new JFrame("Enter Text");
        jFrame.setVisible(true);
        jFrame.setSize(220, 100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new FlowLayout());

        // Create TextField
        jTextField = new JTextField(10);

        jTextField.setActionCommand("textField");

        // Create a button
        reverseButton = new JButton("Reverse");
        reverseButton.addActionListener(this);

        // Label
        promptLabel = new JLabel("Enter Text : ");
        contentLabel = new JLabel("");

        // Add to frame
        jFrame.add(promptLabel);
        jFrame.add(jTextField);
        jFrame.add(reverseButton);
        jFrame.add(contentLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Reverse")){
            // Reverse the string logic
            String originalString = jTextField.getText();
            String holder = "";
            for(int i= originalString.length() - 1; i>=0; i--){
                holder += originalString.charAt(i);
            }
            contentLabel.setText(holder);
        }
        else if(e.getActionCommand().equals("textField")) {
            // Enter was pressed while focus was in the textfield.
            contentLabel.setText("You inputted the Text. Text is : " + jTextField.getText());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextField();
            }
        });
    }


}
