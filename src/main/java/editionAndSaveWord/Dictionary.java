package editionAndSaveWord;
import java.io.Serializable;

public class Dictionary implements Serializable {
    private String englishWord;
    private String polishWord;

    Dictionary (String englishWord,String polishWord){
        this.englishWord = englishWord;
        this.polishWord = polishWord;
    }
}
