class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}

class WordDeleter {
    public String remove(String phrase, String[] words) {
        String result;
        for (String word : words
             ) {
            phrase = phrase.replaceAll("(?<!\\w)" + word + "(?!\\w)", " ");
            }
        result = phrase.replaceAll("\\s+", " ").trim();
        return result;
    }
}