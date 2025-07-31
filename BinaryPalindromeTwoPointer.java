public class BinaryPalindromeTwoPointer {

    public static boolean isBinaryPalindrome(int n) {
        
        String binaryString = Integer.toBinaryString(n);

        
        int left = 0;
        int right = binaryString.length() - 1;

        
        while (left < right) {
            
            if (binaryString.charAt(left) != binaryString.charAt(right)) {
                return false; 
            }
            
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        
        
        int num6 = 6;  
        int num7 = 0;  
        int num8 = 1;  

        System.out.println(num6 + " is binary palindrome: " + isBinaryPalindrome(num6));
        System.out.println(num7 + " is binary palindrome: " + isBinaryPalindrome(num7));
        System.out.println(num8 + " is binary palindrome: " + isBinaryPalindrome(num8));
    }
}
