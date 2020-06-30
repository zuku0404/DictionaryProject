package Edit;

import Open.OpenSaveDictionary;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CheckExistFile {
    public List<Words> checkFile(){
        if (new File ("slownik.ser").exists()){
            OpenSaveDictionary openSaveDictionary = new OpenSaveDictionary();
            List<Words> words = openSaveDictionary.loadDictionary();
            return words;
        }
        return new ArrayList<>();
    }
}

