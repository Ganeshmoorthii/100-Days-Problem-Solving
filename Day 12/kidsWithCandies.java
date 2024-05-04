import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>(); // Create an ArrayList instance
        int maxCandies = getMax(candies); // Get the maximum number of candies
        
        // Iterate through the candies array
        for(int i : candies){
            // Check if the current kid can have the maximum number of candies
            if(i + extraCandies >= maxCandies){
                res.add(true); // Add true to the result list if they can
            } else {
                res.add(false); // Add false otherwise
            }
        }
        return res; // Return the result list
    }
    
    // Helper method to get the maximum number of candies in the array
    private int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
