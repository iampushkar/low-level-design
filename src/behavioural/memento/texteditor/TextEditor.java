package behavioural.memento.texteditor;

/**
 * Originator - the object whose state is saved
 */
public class TextEditor {
    StringBuilder currentText = new StringBuilder();

    public void write(String newText) {
        currentText.append(newText);
    }

    public String read() {
        return currentText.toString();
    }

    public TextMemento save() {
        return new TextMemento(currentText.toString());
    }

    public void restore(TextMemento memento) {
        currentText = new StringBuilder(memento.getSavedText());
    }
}
