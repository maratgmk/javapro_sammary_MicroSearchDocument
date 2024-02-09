package telran.de.summary09_02;

public class Document {
    private final String text;

    public Document(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Document{" +
                "text='" + text + '\'' +
                '}';
    }
}
