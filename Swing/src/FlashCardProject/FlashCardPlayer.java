package FlashCardProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class FlashCardPlayer {

    private JTextArea display;
    private JTextArea answer;
    private ArrayList<FlashCard> cardArrayList;
    private Iterator cardIterator;
    private FlashCard currentCard;
    private int currentCardIndex;
    private JFrame frame;
    private boolean isShowAnswer;
    private JButton showButton;

    public FlashCardPlayer(){
        // Build UI
        frame = new JFrame("Flash Card Player");
        JPanel mainPanel = new JPanel();
        Font mFont = new Font("Helvetica", Font.BOLD, 22);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display = new JTextArea(10, 20);
        display.setFont(mFont);
        JScrollPane qJScrollPane = new JScrollPane(display);
        qJScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qJScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        showButton = new JButton("Show Answer");
        mainPanel.add(qJScrollPane);
        mainPanel.add(showButton);

        showButton.addActionListener(new NextCardListenerr());

        // Add menu
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem loadItem = new JMenuItem("Load Card Set");
        loadItem.addActionListener(new OpenMenuListener());

        file.add(loadItem);
        menuBar.add(file);
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(640, 500);
        frame.setVisible(true);
    }

    class NextCardListenerr implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(isShowAnswer) {
                display.setText(currentCard.getAnswer());
                showButton.setText("Next Card");
                isShowAnswer = false;
            }
            else {
                // Show next question
                if(cardIterator.hasNext()){
                    showNextCard();
                }
                else{
                    display.setText("No more cards available");
                    showButton.setEnabled(false);
                }
            }
        }
    }

    class OpenMenuListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileOpen = new JFileChooser();
            fileOpen.showOpenDialog(frame);
            loadFile(fileOpen.getSelectedFile());
        }
    }
    public void loadFile(File selectedFile){
        cardArrayList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
            String line = null;
            while((line = reader.readLine()) != null){
                makeCard(line);
            }
        } catch(Exception e){
            System.out.println("Couldn't read");
        }
        // Show the first card
        cardIterator = cardArrayList.iterator();
        showNextCard();
    }
    private void showNextCard() {
        currentCard = (FlashCard) cardIterator.next();
        display.setText(currentCard.getQuestion());
        showButton.setText("Show Answer");
        isShowAnswer = true;
    }

    private void makeCard(String lineToParse) {
//        String[] result = lineToParse.split("/"); // [question, answer]
//        FlashCard card = new FlashCard(result[0], result[1]);
//        cardArrayList.add(card);
//        System.out.println("Made a card");

        // Using String Tokenizer
        StringTokenizer result = new StringTokenizer(lineToParse, "/");
        if(result.hasMoreTokens()) {
            FlashCard card = new FlashCard(result.nextToken(), result.nextToken());
            cardArrayList.add(card);
            System.out.println("Made a card");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FlashCardPlayer();
            }
        });
    }
}
