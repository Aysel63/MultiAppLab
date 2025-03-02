package stringalgorithms;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWordInString {

    public static String reverseWordsInString(final String s) {
        var words = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}
