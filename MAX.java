import java.util.ArrayList;
import java.util.Collections;

public class MAX {

    public static ArrayList<Integer> findLeaders(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new ArrayList<>();
        }

        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        int maxright = arr[n - 1];
        leaders.add(maxright);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxright) {
                maxright = arr[i];
                leaders.add(maxright);
            }
        }
        Collections.reverse(leaders);
        
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> leaders1 = findLeaders(arr1);
        System.out.println("Leaders in array 1: " + leaders1);
    }
}
