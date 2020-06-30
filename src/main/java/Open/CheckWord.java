package Open;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckWord implements ActionListener {
    private JLabel  textToCompare;
    private JTextField textField;
    private JLabel result;

    public CheckWord (JLabel textToCompare, JTextField textField, JLabel result){
        this.textToCompare = textToCompare;
        this.textField = textField;
        this.result = result;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println(textToCompare );
        if (textToCompare.getText().equals(textField.getText())){
            result.setText("correct");
        }
        else {
            result.setText(" Not this time, correct answer is: " + textToCompare.getText());
        }
    }
}
