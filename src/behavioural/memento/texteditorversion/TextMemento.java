package behavioural.memento.texteditorversion;

import java.time.LocalDateTime;

// Memento class to hold state
class TextMemento {
    private final String text;
    private final LocalDateTime timestamp;

    public TextMemento(String text) {
        this.text = text;
        this.timestamp = LocalDateTime.now();
    }

    public String getSavedText() {
        return text;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
