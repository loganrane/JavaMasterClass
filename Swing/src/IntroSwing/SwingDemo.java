package IntroSwing;
import javax.swing.*;
public class SwingDemo {

    public SwingDemo() {
        // Create a new JFrame container.
        JFrame jFrame = new JFrame("First Swing Application");

        // Give it a size.
        jFrame.setSize(270, 100);

        // Show it in display.
        jFrame.setVisible(true);

        // Create a JLabel and putting it inside out JFrame.
        JLabel jLabel = new JLabel("Wow this is amazing!!");
        jFrame.add(jLabel);

        // Terminate the program when the user closes the application.
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
