import java.util.Arrays;
import java.util.Locale;

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}

class WordSplitter {
    public String[] split(String phrase) {
        String[] newStr = phrase.toLowerCase(Locale.ROOT).split("\\s+");
        return newStr;
    }
}