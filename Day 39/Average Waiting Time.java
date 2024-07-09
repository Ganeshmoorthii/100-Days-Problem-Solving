class Solution {
    public double averageWaitingTime(int[][] customers) {
        int t = 0;
        double total = 0; // Changed total to double to ensure proper division at the end

        for (int[] arr : customers) {
            int arrival = arr[0];
            int order = arr[1];
            
            // Update the time t to the maximum of current time t or arrival time of the customer
            if (t < arrival) {
                t = arrival;
            }
            
            // Calculate the waiting time for the current customer
            total += t + order - arrival;
            
            // Update the current time t to when the current customer's order is completed
            t += order;
        }
        
        // Return the average waiting time
        return total / customers.length;
    }
}
