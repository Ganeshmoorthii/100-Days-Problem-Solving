class Solution {
    public int minOperations(String[] logs) {
        int place = 0;
        
        for (String log : logs) {
            if (log.equals("./")) {
                continue;
            } else if (log.equals("../")) {
                if (place > 0) {
                    place--;
                }
            } else {
                place++;
            }
        }
        
        return place;
    }
}
