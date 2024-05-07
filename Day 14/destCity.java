/*

Example 1:

Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo" 
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
Example 2:

Input: paths = [["B","C"],["D","B"],["C","A"]]
Output: "A"
Explanation: All possible trips are: 
"D" -> "B" -> "C" -> "A". 
"B" -> "C" -> "A". 
"C" -> "A". 
"A". 
Clearly the destination city is "A".
Example 3:

Input: paths = [["A","Z"]]
Output: "Z"

*/
class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> startingCities = new HashSet<>();
        
        // Store all starting cities in a set
        for (List<String> path : paths) {
            startingCities.add(path.get(0));
        }
        
        // Iterate over paths to find the destination city
        for (List<String> path : paths) {
            String destination = path.get(1);
            if (!startingCities.contains(destination)) {
                return destination;
            }
        }
        
        return ""; // No destination city found
    }
}
