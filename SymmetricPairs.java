import java.util.HashMap;

public class SymmetricPairs {

    public static void findSymmetricPairs(int[][] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Symmetric pairs found:");

        for (int i = 0; i < arr.length; i++) {
            int first = arr[i][0];
            int second = arr[i][1];
            Integer value = map.get(second);
            if (value != null && value == first) {
                System.out.println("(" + second + ", " + first + ")");
            } else {
                map.put(first, second);
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{10, 20}, {30, 40}, {50, 60}, {20, 10}, {40, 30}};
        findSymmetricPairs(arr);
    }
}
