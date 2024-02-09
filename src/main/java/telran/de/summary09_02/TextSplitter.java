package telran.de.summary09_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TextSplitter {
    public List<Word> splitText(String text) {
        List<Word> result = new ArrayList<>();
        String[] words = text.split(" ");
        for (String word : words) {
            result.add(new Word(word.toLowerCase(Locale.ROOT)));
        }
        return result;

    }
}
