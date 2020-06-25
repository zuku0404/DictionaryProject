package editionAndSaveWord;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveContent implements ActionListener {
    private List<Dictionary> wordsToSave;

    public SaveContent(List <Dictionary> wordsToSave) {
        this.wordsToSave = wordsToSave;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        try {
            ObjectOutputStream word = new ObjectOutputStream(new FileOutputStream("slownik.ser"));
            for (Dictionary a : wordsToSave) {
                word.writeObject(a);
            }
            word.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
