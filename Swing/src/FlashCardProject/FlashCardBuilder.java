package FlashCardProject;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

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

        // Array List
        cardList = new ArrayList<>();

        // Button
        JButton nextButton = new JButton("Next Card");

        // Create Labels
        JLabel qJlabel = new JLabel("Question");
        JLabel aJlabel = new JLabel(" Answer ");

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu filemenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        filemenu.add(newMenuItem);
        filemenu.add(saveMenuItem);
        menuBar.add(filemenu);

        // Add event listeners
        newMenuItem.addActionListener(new NewMenuItemListener());
        saveMenuItem.addActionListener(new SaveMenuItemListener());
        nextButton.addActionListener(new NextCardListener());

        // Add components to main panel -
        mainPanel.add(qJlabel);
        mainPanel.add(qJScroll);
        mainPanel.add(aJlabel);
        mainPanel.add(aJScroll);
        mainPanel.add(nextButton);

        // Add to the frame
        frame.setJMenuBar(menuBar);
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

    class NextCardListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Create a flash card.
            FlashCard card = new FlashCard(question.getText(), answer.getText());
            cardList.add(card);
            clearCard();
        }
    }
    private void clearCard() {
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }

    class NewMenuItemListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Create a card and store in our array list.

        }
    }

    class SaveMenuItemListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            FlashCard card = new FlashCard(question.getText(), answer.getText());
            cardList.add(card);

            // Create a file dialogue with file chooser.
            JFileChooser fileSave = new JFileChooser();
            fileSave.showSaveDialog(frame);
            saveFile(fileSave.getSelectedFile());
        }
    }
    private void saveFile(File selectedFile){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile));
            Iterator<FlashCard> cardIterator = cardList.iterator();
            while(cardIterator.hasNext()){
                FlashCard card = (FlashCard)cardIterator.next();
                writer.write(card.getQuestion() + "/");
                writer.write(card.getAnswer() + "\n");
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Couldn't write to file.");
        }
    }

}
