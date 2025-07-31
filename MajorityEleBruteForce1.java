public class MajorityEleBruteForce1 {

    public static int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1; // Or throw an IllegalArgumentException
        }

        int n = nums.length;
        // Iterate through each element to consider it as a potential majority element
        for (int i = 0; i < n; i++) {
            int currentElement = nums[i];
            int count = 0;
            // Count occurrences of the currentElement
            for (int j = 0; j < n; j++) {
                if (nums[j] == currentElement) {
                    count++;
                }
            }
            // If the count is greater than n/2, it's the majority element
            if (count > n / 2) {
                return currentElement;
            }
        }
        return -1; // No majority element found
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 3, 3, 2, 3}; // Example input
        System.out.println("The majority element is: " + majorityElement(nums1)); // Expected: 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("The majority element is: " + majorityElement(nums2)); // Expected: 2

        int[] nums3 = {1, 2, 3};
        System.out.println("The majority element is: " + majorityElement(nums3)); // Expected: -1

        int[] nums4 = {1};
        System.out.println("The majority element is: " + majorityElement(nums4)); // Expected: 1
    }
}
