package telran.de.summary09_02;

import java.util.HashMap;
import java.util.Map;

public class DocumentIndex {
    private long lastId = 0;
    private final Map<DocumentId,Document> storage = new HashMap<>();

    public Document getDocument(DocumentId documentId) {

        return storage.get(documentId);
    }

    public DocumentId save(Document document) {
        DocumentId id = new DocumentId(lastId ++);
        storage.put(id,document);
        return id;
    }
}

