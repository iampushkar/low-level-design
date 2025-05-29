package behavioural.memento.texteditorversion;

// Originator - the editor
class TextEditor {
    private StringBuilder currentText = new StringBuilder();

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
