public class Gcd {
    public static void main(String[] args) {
        while (true) {
            int a = 4;
            int b = 7;
        
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            
            System.out.println("GCD is: " + a);
            break; 
        }
    }
}
