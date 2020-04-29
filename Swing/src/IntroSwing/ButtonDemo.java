package IntroSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo implements ActionListener {
    JLabel myLabel;
    public ButtonDemo(){
        // Main shits.
        JFrame jFrame = new JFrame("Button");
        jFrame.setSize(200, 100);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Specify FLowLayout for the layout manager.
        jFrame.setLayout(new FlowLayout());

        // Make a button.
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");
        jFrame.add(upButton);
        jFrame.add(downButton);

        //Add EventListener
//        upButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Do the action needed.
//                System.out.println("UP clicked.");
//            }
//        });

        // Add EventListener without doing repetitive shits. Directly implementd in class.
        upButton.addActionListener(this);
        downButton.addActionListener(this);

        // Label
        myLabel = new JLabel("Hello There!!");
        jFrame.add(myLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Our Playground - Do anything when button clicked.
        if(e.getActionCommand().equals("Up")){
            myLabel.setText("Upppp!!");
        }
        else{
            myLabel.setText("Downnn!!");
        }
    }

    public static void main(String[] args) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });
    }
}
