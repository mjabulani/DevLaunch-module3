import org.example.WordCount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class WordCountTest {

    WordCount testObject = new WordCount();

    @Test
    void ifMapsEqualTrue() {
        String text = "Ala ma kota, kota ma Ala";
        HashMap<String, Integer> textMap = new HashMap<>();

        textMap.put("Ala", 2);
        textMap.put("ma", 2);
        textMap.put("kota", 2);

        Assertions.assertEquals(textMap, testObject.wordCount(text));
    }

    @Test
    void ifNullAsParameter() {
        String text = "Ala ma kota, kota ma Ala";
        HashMap<String, Integer> textMap = new HashMap<>();

        textMap.put("Ala", 2);
        textMap.put("ma", 2);
        textMap.put("kota", 2);

        Assertions.assertNotEquals(textMap, testObject.wordCount(null));
    }
}
