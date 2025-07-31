public class ToggleDoor {
    public static void main(String[] args) {
        int n = 10; // Number of doors
        boolean[] doors = new boolean[n + 1]; // Array to represent doors (initially all closed)

        // Iterate over each pass
        for (int i = 1; i <= n; i++) {
            // Toggle every i-th door
            for (int j = i; j <= n; j += i) {
                doors[j] = !doors[j]; // Toggle the door
            }
        }

        // Print the final state of the doors
        System.out.println("Doors that are open:");
        for (int i = 1; i <= n; i++) {
            if (doors[i]) {
                System.out.print(i + " ");
            }
        }
    }
}


