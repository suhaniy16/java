public class BinaryPalindromeBuiltIn {
    public static boolean isBinaryPalindrome(int n) {
        
        String binaryString = Integer.toBinaryString(n);
        StringBuilder reversedBinaryString = new StringBuilder(binaryString);
        reversedBinaryString.reverse();
        return binaryString.equals(reversedBinaryString.toString());
    }

    public static void main(String[] args) {
        int num1 = 9;  
        int num2 = 10; 
        int num3 = 5;  

        System.out.println(num1 + " is binary palindrome: " + isBinaryPalindrome(num1));
        System.out.println(num2 + " is binary palindrome: " + isBinaryPalindrome(num2));
        System.out.println(num3 + " is binary palindrome: " + isBinaryPalindrome(num3));
    }
}
