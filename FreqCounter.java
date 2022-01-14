class FreqCounterTest {
    public float countFreq(String phrase, String word) {
        String phraseLowCase= phrase.toLowerCase();
        String wordLowCase=word.toLowerCase();
        String[] phraseArr = phraseLowCase.split("\\s+");
        float count = 0f;
        float phraseLength = phraseArr.length;

        for (int i = 0; i < phraseArr.length; i++) {
            if (phraseArr[i].equals(wordLowCase)) {
                count++;
            }
        }
        return count/phraseLength;
    }
}


class FreqCounter {
    public static void main(String[] args) {
        FreqCounterTest freqCounter = new FreqCounterTest();

        //0.5
        System.out.println(freqCounter.countFreq("viebnuen fypik Niciri dizodipou co", "Niciri"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}