public class TextAnalyzer {
    public static void main(String[] args) {
        String text = "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.";
        System.out.println("Word Count: " + countWords(text));
        System.out.println("Letter Count: " + countLetters(text));
        System.out.println("Longest Word: " + findLongestWord(text));
    }

    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] words = text.split("\\s+");

        int wordCount = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;
            }
        }

        return wordCount;
    }

    public static int countLetters(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int letterCount = 0;

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            }
        }

        return letterCount;

    }

    public static String findLongestWord(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        String longestWord = "";

        for (String word : text.split("\\s+")) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

}