import java.util.ArrayList;
import java.util.List;

public class q32 {
    // Data member
    private String strdata;

    // Parameterized Constructor
    public q32(String strdata) {
        // Store the sentence after trimming and ensuring it's in upper case
        this.strdata = strdata.trim().toUpperCase();
    }

    // Method to count the number of words beginning and ending with a vowel
    public void countWord() {
        String[] words = strdata.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                count++;
            }
        }
        System.out.println("Number of words beginning and ending with a vowel: " + count);
    }

    // Method to place words beginning and ending with a vowel at the beginning
    public void placeWord() {
        String[] words = strdata.split("\\s+");
        List<String> vowelWords = new ArrayList<>();
        List<String> otherWords = new ArrayList<>();
        
        for (String word : words) {
            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                vowelWords.add(word);
            } else {
                otherWords.add(word);
            }
        }

        // Combine the vowel words and other words
        vowelWords.addAll(otherWords);
        
        // Print the rearranged sentence
        String result = String.join(" ", vowelWords);
        System.out.println("Rearranged sentence: " + result);
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char ch) {
        return "AEIOU".indexOf(ch) != -1;
    }

    // Main method to test the class
    public static void main(String[] args) {
        q32 example = new q32("APPLE EAGLE ASK ORANGE ELEPHANT?");
        example.countWord();
        example.placeWord();
    }
}
