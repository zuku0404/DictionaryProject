package Edit;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class NextContent implements ActionListener {
    private JTextField englishText;
    private JTextField polishText;
    private List<Words> dictionary;

    NextContent(JTextField englishTextLoad, JTextField polishTextLoad, List <Words> dictionary) {
        this.englishText = englishTextLoad;
        this.polishText = polishTextLoad;
        this.dictionary = dictionary;
    }
    public void actionPerformed(ActionEvent actionEvent) {
        Words coupleOfWord = new Words(englishText.getText(), polishText.getText());
        dictionary.add(coupleOfWord);
        englishText.setText("");
        polishText.setText("");
        englishText.requestFocus();
    }
}