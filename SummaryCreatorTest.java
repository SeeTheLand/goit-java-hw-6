class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "wusovumyjycoyta deoxd";
        System.out.println(summaryCreator.create(longPhrase));
    }
}

class SummaryCreator {
    public String create(String text) {
        if (text.length() <= 15) {
            return text;
        } else  {
            String shortText = text.substring(0, 15);
            if (!String.valueOf(text.charAt(15)).equals(" ")) {
             return shortText + "...";
            } else {
                return shortText;
            }
        }
    }
}