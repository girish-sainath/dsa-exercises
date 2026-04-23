import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharactersBruteForce {

        public int longestSubstringWithoutRepeatingCharacters(String s) {
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n; i += 1) {
            for (int j = i; j < n; j += 1) {
                if (checkForRepetition(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }
    
    public boolean checkForRepetition(String s, int start, int end) {
        Set<Character> chars = new HashSet<>();
        for (int i = start; i <= end; i += 1) {
            Character c = s.charAt(i);
            if (chars.contains(c)) {
                return false;
            }
            chars.add(c);
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        LongestSubstringWithoutRepeatingCharactersBruteForce main = new LongestSubstringWithoutRepeatingCharactersBruteForce();
        String s = "abcabcbb";
        System.out.println(s);
        System.out.println(main.longestSubstringWithoutRepeatingCharacters(s));
        s = "bbbbb";
        System.out.println(s);
        System.out.println(main.longestSubstringWithoutRepeatingCharacters(s));
        s = "pwwkew";
        System.out.println(s);
        System.out.println(main.longestSubstringWithoutRepeatingCharacters(s));
    }
}
