package Edit;

import javax.swing.*;
import java.util.List;

public class GuiEditor {
    private List <Words> dictionary;

    public GuiEditor (List <Words> dictionary){
        this.dictionary = dictionary;
    }
    public void createGui() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel labelEnglish = new JLabel("English: ");
        JTextField englishText = new JTextField(20);
        JLabel labelPolish = new JLabel("Polish: ");
        JTextField polishText = new JTextField(20);
        JButton nextCardButton = new JButton("next Card");
        nextCardButton.addActionListener(new NextContent(englishText, polishText, dictionary));
        JButton saveAll = new JButton("save");
        saveAll.addActionListener(new AddToDictionaryAction(dictionary));

        JPanel panel = new JPanel();
        panel.add(labelEnglish);
        panel.add(englishText);
        panel.add(labelPolish);
        panel.add(polishText);
        panel.add(nextCardButton);
        panel.add(saveAll);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
        frame.setSize(300, 300);
    }
}
