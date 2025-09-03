import java.util.Scanner;

public class HyphensToBeginning {

    public static String moveHyphens(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder hyphens = new StringBuilder();
        StringBuilder characters = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '-') {
                hyphens.append(c);
            } else {
                characters.append(c);
            }
        }
        return hyphens.toString() + characters.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = moveHyphens(input);

        System.out.println("Original string: " + input);
        System.out.println("String with hyphens at the beginning: " + result);

        scanner.close();
    }
}
