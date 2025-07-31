public class MaxProduct {

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // Or throw an IllegalArgumentException
        }

        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currentNum = nums[i];

            // When currentNum is negative, we swap maxSoFar and minSoFar
            // because multiplying a negative number with maxSoFar will give a small negative,
            // and multiplying with minSoFar will give a large positive.
            if (currentNum < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            // Update maxSoFar and minSoFar for the current position
            maxSoFar = Math.max(currentNum, maxSoFar * currentNum);
            minSoFar = Math.min(currentNum, minSoFar * currentNum);

            // Update the overall result
            result = Math.max(result, maxSoFar);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, -3, 4, -5};
        System.out.println("Maximum product of subarray: " + maxProduct(nums)); 
    }
}
