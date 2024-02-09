package telran.de.summary09_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertIndex {
    private final Map<Word,List<DocumentId>> storage = new HashMap<>();


    public List<DocumentId> getDocumentIds(Word word) {
        List<DocumentId> documentIds = storage.get(word);
        if(documentIds == null) {
            return List.of();
        }
        return documentIds;

    }

    public void save(DocumentId documentId, List<Word> words) {
        for (Word word : words) {
            List<DocumentId> documentIds = storage.get(word);
            if(documentIds == null) {
                documentIds = new ArrayList<>();
            }
            documentIds.add(documentId);
            storage.put(word,documentIds);
        }
    }
}

