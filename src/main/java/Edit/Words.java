package Edit;

import java.io.Serializable;

public class Words implements Serializable {
    private String englishWord;
    private String polishWord;

    Words(String englishWord, String polishWord) {
        this.englishWord = englishWord;
        this.polishWord = polishWord;
    }
    public String getEnglishWord() {
        return englishWord;
    }
    public String getPolishWord() {
        return polishWord;
    }
}
