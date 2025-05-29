package behavioural.memento.texteditor;

/**
 * Memento - Holds the State
 */
public class TextMemento {
    private final String text;

    public TextMemento(String text) {
        this.text = text;
    }

    public String getSavedText() {
        return text;
    }
}
