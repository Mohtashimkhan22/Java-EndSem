public class q30 {
    public static void main(String[] args) {
        String input = "Hello, this is a sample string with vowels.";

        StringBuffer output = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!isVowel(ch)) {
                output.append(ch);
            }
        }

        System.out.println("Original string: " + input);
        System.out.println("String after deleting vowels: " + output.toString());
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}