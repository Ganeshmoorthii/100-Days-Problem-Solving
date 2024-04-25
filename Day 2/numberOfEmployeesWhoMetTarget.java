class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        // Initialize a counter to keep track of the number of employees who met the target
        int count = 0;
        
        // Iterate through the array of hours worked by each employee
        for (int i = 0; i < hours.length; i++) {
            // Check if the hours worked by the current employee matches the target
            if (target == hours[i]) {
                // If so, increment the count
                count++;
            }
        }
        
        // Return the total count of employees who met the target
        return count;
    }
}
