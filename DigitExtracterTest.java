import java.util.Arrays;

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}

class DigitExtracter {
    public int[] extract(String text) {
        int[] result = Arrays.stream(text.split(""))
                .filter(s -> s.matches("\\d"))
                .mapToInt(v -> Integer.parseInt(v))
                .toArray();

        return result;
    }
}