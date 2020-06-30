package Edit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class AddToDictionaryAction implements ActionListener {
    private List<Words> dictionary;

    public AddToDictionaryAction(List<Words> dictionary) {
        this.dictionary = dictionary;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        try {
            ObjectOutputStream word = new ObjectOutputStream(new FileOutputStream("slownik.ser"));
            word.writeObject(dictionary);
            word.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
