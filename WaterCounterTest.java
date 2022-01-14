import java.util.Arrays;

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}

class WaterCounter {
    public double count(String text) {
        double spacesNumber = Arrays.stream(text.split("")).filter(s -> s.matches("\\s?")).count();
        double symbolsNumber = Arrays.stream(text.split("")).filter(s -> s.matches("\\S?")).count();
        return spacesNumber/text.length();
    }
}