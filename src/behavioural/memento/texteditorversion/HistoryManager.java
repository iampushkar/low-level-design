package behavioural.memento.texteditorversion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Caretaker - manages history
class HistoryManager {
    private final Stack<TextMemento> undoStack = new Stack<>();
    private final Stack<TextMemento> redoStack = new Stack<>();
    private final List<TextMemento> versionHistory = new ArrayList<>();

    public void save(TextEditor editor) {
        TextMemento snapshot = editor.save();
        undoStack.push(snapshot);
        versionHistory.add(snapshot);
        redoStack.clear(); // Clear redo on new save
    }

    public void undo(TextEditor editor) {
        if (!undoStack.isEmpty()) {
            TextMemento previous = undoStack.pop();
            redoStack.push(editor.save());
            editor.restore(previous);
        }
    }

    public void redo(TextEditor editor) {
        if (!redoStack.isEmpty()) {
            TextMemento next = redoStack.pop();
            undoStack.push(editor.save());
            editor.restore(next);
        }
    }

    public void listVersions() {
        for (int i = 0; i < versionHistory.size(); i++) {
            TextMemento m = versionHistory.get(i);
            System.out.println("Version " + i + " - " + m.getTimestamp() + " - " + m.getSavedText());
        }
    }

    public void restoreVersion(TextEditor editor, int versionIndex) {
        if (versionIndex >= 0 && versionIndex < versionHistory.size()) {
            TextMemento version = versionHistory.get(versionIndex);
            undoStack.push(editor.save());
            editor.restore(version);
        } else {
            throw new IllegalArgumentException("Invalid version index: " + versionIndex);
        }
    }
}
