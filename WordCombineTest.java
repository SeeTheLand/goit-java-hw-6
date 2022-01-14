import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}

class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
        String[] targetStrings = Arrays.stream(targetWord.toLowerCase(Locale.ROOT).split("")).distinct().toArray(String[]::new);
        String[] sourceStrings = Arrays.stream(sourceWord.toLowerCase(Locale.ROOT).split("")).distinct().toArray(String[]::new);
        for (String targetString:
             targetStrings) {
            if (!Arrays.stream(sourceStrings).anyMatch(s -> s.equals(targetString))) {
                return false;
            }
        }
        return true;
    }
}