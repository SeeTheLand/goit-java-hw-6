import java.util.Arrays;
import java.util.Locale;

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}

class PalindromeCounter {
    public int count(String phrase) {
        int countPalindroms = (int) Arrays.stream(phrase.split("\\s+"))
                .filter(s -> s.toLowerCase(Locale.ROOT).equals(new StringBuilder(s).reverse().toString().toLowerCase(Locale.ROOT)))
                .count();
        return countPalindroms;
    }
}