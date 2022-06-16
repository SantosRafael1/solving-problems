
public class WordCount {
    public static void main(String[] args) {
        System.out.println(countWords("Looks easy..."));
        System.out.println(countWords("Hello, World! "));
        System.out.println(countWords("This is a test"));
    }

    public static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}