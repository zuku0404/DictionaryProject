package editionAndSaveWord;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Editor {
    private List<Dictionary> listToShow;

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.creatGui();
    }
    public void creatGui() {
        listToShow = new ArrayList<>();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel labelEnglish = new JLabel("English: ");
        JTextField englishWorld = new JTextField(20);
        JLabel labelPolish = new JLabel("Polish: ");
        JTextField polishWord = new JTextField(20);
        JButton nextCardButton = new JButton("next Card");
        nextCardButton.addActionListener(new NextContent(englishWorld, polishWord)); // jak moge zwrocic liste Dictionary ktora
                                                                                    // bedzie mogla zostac przekazana nizej do zapisu
        JButton saveAll = new JButton("save");
        saveAll.addActionListener(new SaveContent(listToShow));

        JPanel panel = new JPanel();
        panel.add(labelEnglish);
        panel.add(englishWorld);
        panel.add(labelPolish);
        panel.add(polishWord);
        panel.add(nextCardButton);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
        frame.setSize(300, 300);
    }
}
