import java.util.Arrays;
import java.util.Locale;

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}

//class WordFreqCounter {
//    public float countFreq(String phrase, String word) {
//        int index = 0;
//        float count = 0;
//
//        while (index != -1) {
//            index = phrase.toLowerCase(Locale.ROOT).indexOf(word.toLowerCase(Locale.ROOT), index);
//
//            if (index != -1) {
//                count++;
//                index += word.length();
//            }
//        }
//
//        return count;
//    }
//}

class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        String[] words = phrase.toLowerCase(Locale.ROOT).split("\\s+");
        float count = Arrays.stream(words).filter(c -> c.equals(word.toLowerCase(Locale.ROOT))).count();
        return count/words.length;
    }
}