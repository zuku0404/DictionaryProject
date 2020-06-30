package Edit;

public class FiszkiEditor {
    public static void main(String[] args) {
        CheckExistFile checkExistFile = new CheckExistFile();
        GuiEditor guiEditor = new GuiEditor(checkExistFile.checkFile());
        guiEditor.createGui();
    }
}
