import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        char[] arr1 = {'a', 'a', 'a', 'a', 'b', 'b'};
        char[] arr2 = {'c', 'c', 'c', 'd', 'c', 'd'};

        System.out.println(areBalanced(arr1, arr2)); // Output: true
    }

    public static boolean areBalanced(char[] arr1, char[] arr2) {
        Map<Character, Integer> freqMap1 = getFrequencyMap(arr1);
        Map<Character, Integer> freqMap2 = getFrequencyMap(arr2);

        return freqMap1.equals(freqMap2);
    }

    private static Map<Character, Integer> getFrequencyMap(char[] arr) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : arr) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        return freqMap;
    }
}
