class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}

class AvgWordLength {
    public double count(String phrase) {
        String[] words = phrase.split("\\s+");
        int totalLength = 0;
        for (String word:
             words) {
            totalLength += word.length();
        }
        return (double) totalLength/words.length;
    }
}