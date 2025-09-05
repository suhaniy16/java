public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Case 1: Palindrome with an odd number of characters (e.g., "aba")
            int len1 = expandFromCenter(s, i, i);
            
            // Case 2: Palindrome with an even number of characters (e.g., "abba")
            int len2 = expandFromCenter(s, i, i + 1);
            
            int len = Math.max(len1, len2);
            
            if (len > end - start) {
                
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    
    private static int expandFromCenter(String s, int left, int right) {
        
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return right - left - 1;
    }
    
    public static void main(String[] args) {
        String input = "cdzaazef";
        String longestPalindrome = longestPalindrome(input);
        System.out.println("The longest palindrome substring for the input \"" + input + "\" is: " + longestPalindrome);
    }
}