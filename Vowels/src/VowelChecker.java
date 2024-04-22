public class VowelChecker {
    public static boolean containsAllVowels(String str) {
        str = str.toLowerCase();
        
        String vowels = "aeiou";
        
        for (char vowel : vowels.toCharArray()) {
            if (str.indexOf(vowel) == -1) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String input1 = "The quick brown fox jumps over the lazy dog";
        String input2 = "Hello, World!";

        System.out.println("Input: \"" + input1 + "\" Output: " + containsAllVowels(input1));
        System.out.println("Input: \"" + input2 + "\" Output: " + containsAllVowels(input2));
    }
}
