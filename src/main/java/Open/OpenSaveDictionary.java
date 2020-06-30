package Open;

import Edit.Words;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class OpenSaveDictionary {
    private ObjectInputStream word = null;

    public List<Words> loadDictionary() {
        try {
            word = new ObjectInputStream(new FileInputStream("slownik.ser"));
            List<Words> words = (List<Words>) word.readObject();
            return words;
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            if(word != null){
                try {
                    word.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}