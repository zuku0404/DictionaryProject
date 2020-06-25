package editionAndSaveWord;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class NextContent implements ActionListener {
    private JTextField englishText;
    private JTextField polishText;
    private List<Dictionary> wordsInDictionary = new ArrayList<>();

    NextContent(JTextField englishTextLoad, JTextField polishTextLoad) {
        this.englishText = englishTextLoad;
        this.polishText = polishTextLoad;
    }
    public void actionPerformed(ActionEvent actionEvent) {
        Dictionary coupleOfWord = new Dictionary(englishText.getText(), polishText.getText());
        wordsInDictionary.add(coupleOfWord);
        englishText.setText("");
        polishText.setText("");
        englishText.requestFocus();
    }

    public List<Dictionary> getWordsInDictionary() {
        return wordsInDictionary;

    }
}
