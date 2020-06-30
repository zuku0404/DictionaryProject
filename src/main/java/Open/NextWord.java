package Open;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class NextWord implements ActionListener {
    private JTextField textField;
    private JLabel textToCompare;
    private JLabel wordToTranslate;
    private WordChooser wordChooser;
    private List<String> listWordsToDislpay;

    NextWord (JTextField textField,JLabel wordToTranslate, JLabel textToCompare){
        this.textField = textField;
        this.wordToTranslate = wordToTranslate;
        this.textToCompare = textToCompare;
    }
    public void actionPerformed(ActionEvent actionEvent) {
        textField.setText("");
        wordChooser = new WordChooser();
        listWordsToDislpay = wordChooser.chooseWord();
        wordToTranslate.setText(listWordsToDislpay.get(0));
        textToCompare.setText(listWordsToDislpay.get(1));
    }
}
