package Open;

import Edit.Words;
import java.util.ArrayList;
import java.util.List;

public class WordChooser {
    OpenSaveDictionary openSaveDictionary = new OpenSaveDictionary();
    private List<Words> wordsList = openSaveDictionary.loadDictionary();

    public List<String > chooseWord () {
        int numberWord = (int) (Math.random() * wordsList.size());
        String englishWord = wordsList.get(numberWord).getEnglishWord();
        String polishWord = wordsList.get(numberWord).getPolishWord();

        List<String> engPolList = new ArrayList<>();
        engPolList.add(englishWord);
        engPolList.add(polishWord);
        return engPolList;
    }
}
