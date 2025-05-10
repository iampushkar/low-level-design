package behavioural.memento;

public class Main {
    public static void main(String[] args) {
        System.out.println("------- Memento Design Pattern -------");

        TextEditor textEditor = new TextEditor();
        HistoryManager historyManager = new HistoryManager();

        historyManager.save(textEditor);
        textEditor.write("Hello Tony! ");

        historyManager.save(textEditor);
        textEditor.write("I am Peter");

        System.out.println("Current - " + textEditor.read());

        historyManager.undo(textEditor);
        System.out.println("Undo 1 - " + textEditor.read());

        historyManager.undo(textEditor);
        System.out.println("Undo 2 - " + textEditor.read());
    }
}
