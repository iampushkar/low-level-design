package behavioural.memento;

import java.util.Stack;

public class HistoryManager {
    private final Stack<TextMemento> history = new Stack<>();

    public void save(TextEditor textEditor) {
        TextMemento memento = textEditor.save();
        history.push(memento);
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            TextMemento memento = history.pop();
            editor.restore(memento);
        }
    }
}
