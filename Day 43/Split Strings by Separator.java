class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for(String s : words){
            String[] temp = s.split("\\"+separator);
            for(String k:temp){
                if(!k.isEmpty())
                res.add(k);
            }
        }
        return res;
    }
}
