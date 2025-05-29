package behavioural.memento.texteditorversion;

public class MementoMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        HistoryManager manager = new HistoryManager();

        editor.write("Hello");
        manager.save(editor);

        editor.write(" World");
        manager.save(editor);

        editor.write("!");
        manager.save(editor);

        System.out.println("Current text: " + editor.read());

        System.out.println("\nAvailable versions:");
        manager.listVersions();

        manager.undo(editor);
        System.out.println("\nAfter 1 undo: " + editor.read());

        manager.undo(editor);
        System.out.println("After 2 undos: " + editor.read());

        manager.undo(editor);
        System.out.println("After 3 undos: " + editor.read());

        manager.redo(editor);
        System.out.println("After 1 redo: " + editor.read());

        manager.restoreVersion(editor, 0);
        System.out.println("\nRestored to version 0: " + editor.read());
    }
}

