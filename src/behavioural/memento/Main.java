package behavioural.memento;

public class Main {
    public static void main(String[] args) {
        System.out.println("------- Memento Design Pattern -------");

        TextEditor editor = new TextEditor();
        HistoryManager history = new HistoryManager();

        // Save empty state first
        history.save(editor);  // ""
        editor.write("Hello");

        history.save(editor);  // "Hello"
        editor.write(" World!");

        // Don't save here, we already saved state before writing

        System.out.println("Current text: " + editor.read()); // Hello World!

        history.undo(editor);
        System.out.println("After 1 undo: " + editor.read()); // Hello

        history.undo(editor);
        System.out.println("After 2 undos: " + editor.read()); // (empty)
    }
}
