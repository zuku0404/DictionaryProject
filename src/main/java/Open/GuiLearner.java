package Open;

import javax.swing.*;
import java.awt.*;

public class GuiLearner {
    public void createGui() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        JPanel upPanel = new JPanel();
        JPanel centrePanel = new JPanel();
        JPanel downPanel = new JPanel();
        JPanel resultPanel = new JPanel();

        JLabel englishText = new JLabel("english: ");
        JLabel wordToTranslate = new JLabel("click next to begin");
        JLabel result = new JLabel();
        JLabel textToCompare = new JLabel();

        JLabel polishText = new JLabel("polish: ");
        JTextField textField = new JTextField(15);

        JButton nextWordButton = new JButton("next");
        nextWordButton.addActionListener(new NextWord(textField, wordToTranslate, textToCompare));

        JButton checkWordButton = new JButton("check");
        checkWordButton.addActionListener(new CheckWord(textToCompare, textField, result));

        upPanel.add(englishText);
        upPanel.add(wordToTranslate);
        centrePanel.add(polishText);
        centrePanel.add(textField);
        downPanel.add(nextWordButton);
        downPanel.add(checkWordButton);
        resultPanel.add(result);
        mainPanel.add(upPanel);
        mainPanel.add(centrePanel);
        mainPanel.add(downPanel);
        mainPanel.add (resultPanel);
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
        frame.getContentPane().add(mainPanel);


        frame.setSize(300, 300);
        frame.setVisible(true);

    }
}
