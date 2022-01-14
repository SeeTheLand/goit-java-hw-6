import java.util.Arrays;

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}

class BigOrSmall {
    public String calculate(String text) {
        int smallLetters = (int) Arrays.stream(text.split("")).filter(s -> s.matches("[a-z]")).count();
        int bigLetters = (int) Arrays.stream(text.split("")).filter(s -> s.matches("[A-Z]")).count();
        if (smallLetters > bigLetters) {
            return "Small";
        } else if (smallLetters < bigLetters) {
            return "Big";
        } else {
            return "Same";
        }
    }
}