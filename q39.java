import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class q39 {
    public static void main(String[] args) {
        String fileName = "myfile.txt";
        int palindromeCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (isPalindrome(word)) {
                        palindromeCount++;
                    }
                }
            }

            System.out.println("Number of palindromes: " + palindromeCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
