import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounter {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Word Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Create the text area
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Create the button
        JButton countButton = new JButton("Count Words");
        frame.add(countButton, BorderLayout.SOUTH);

        // Create the label to display word count
        JLabel wordCountLabel = new JLabel("Word Count: 0");
        frame.add(wordCountLabel, BorderLayout.NORTH);

        // Add action listener to the button
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                int wordCount = countWords(text);
                wordCountLabel.setText("Word Count: " + wordCount);
            }
        });

        // Show the frame
        frame.setVisible(true);
    }

    // Method to count words
    private static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
}