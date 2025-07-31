public class BinaryPalindromeTwoPointer {

    /**
     * Checks if a given integer is a binary palindrome using the two-pointer approach.
     * A number is a binary palindrome if its binary representation reads the same forwards and backwards.
     *
     * @param n The integer to check.
     * @return true if the number is a binary palindrome, false otherwise.
     */
    public static boolean isBinaryPalindrome(int n) {
        // Convert the integer to its binary string representation
        String binaryString = Integer.toBinaryString(n);

        // Initialize two pointers: one at the beginning and one at the end of the string
        int left = 0;
        int right = binaryString.length() - 1;

        // Iterate while the left pointer is less than the right pointer
        while (left < right) {
            // If characters at the current pointers do not match, it's not a palindrome
            if (binaryString.charAt(left) != binaryString.charAt(right)) {
                return false; // Not a palindrome
            }
            // Move pointers inward
            left++;
            right--;
        }
        // If the loop completes, it means all characters matched, so it's a palindrome
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        
        int num6 = 6;  // Binary: 110 (Not a palindrome)
        int num7 = 0;  // Binary: 0 (Palindrome)
        int num8 = 1;  // Binary: 1 (Palindrome)

        System.out.println(num6 + " is binary palindrome: " + isBinaryPalindrome(num6));
        System.out.println(num7 + " is binary palindrome: " + isBinaryPalindrome(num7));
        System.out.println(num8 + " is binary palindrome: " + isBinaryPalindrome(num8));
    }
}
