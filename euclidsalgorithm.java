import java.util.Scanner;
public class euclidsalgorithm{
    public static int gcd(int a, int b){
        if (b==0)
        return a;
        return gcd(b, a%b);
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        int result = gcd(a, b);
        System.out.println("GCD is: " + result);
        sc.close();
    }
}

