package FlashCardProject;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FlashCardBuilder {
    private JTextArea question;
    private JTextArea answer;
    private ArrayList<FlashCard> cardList;
    private JFrame frame;

    public FlashCardBuilder(){
        // Necessary things to include.
        JFrame frame = new JFrame("Flash Card");
//        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(new FlowLayout());

        // Panel to hold everything.
        JPanel mainPanel = new JPanel();

        // Create font
        Font greatFont = new Font("Helvetica Neue", Font.BOLD, 21);
        question = new JTextArea(6, 20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(greatFont);

        // Question Area
        JScrollPane qJScroll = new JScrollPane(question);
        qJScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        qJScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        // Answer Area
        answer = new JTextArea(6, 20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(greatFont);

        // JScroll Pane
        JScrollPane aJScroll = new JScrollPane(answer);
        aJScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aJScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        // Button
        JButton nextButton = new JButton("Next Card");

        // Create Labels
        JLabel qJlabel = new JLabel("Question");
        JLabel aJlabel = new JLabel(" Answer ");

        // Add components to main panel -
        mainPanel.add(qJlabel);
        mainPanel.add(qJScroll);
        mainPanel.add(aJlabel);
        mainPanel.add(aJScroll);
        mainPanel.add(nextButton);

        // Add to the frame
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500, 500);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FlashCardBuilder();
            }
        });
    }
}
