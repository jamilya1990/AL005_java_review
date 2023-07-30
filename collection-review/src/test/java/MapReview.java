import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Andrew");
        map.put(2, "Jane");
        map.put(3, "Steve");
        System.out.println(map.get(2));

        //Find first non-repeating char in String

        String str = "avaJ Developer";
        System.out.println(findFirstNonRepeatingChar(str));
        System.out.println(findFirstNonRepeatingChar("jaja"));
        int[] nums = {2, 3, 5, 7};

        System.out.println(Arrays.toString(indicesOfNumbers(nums, 9)));
        System.out.println(Arrays.toString(indicesOfNumbersSolution2(nums, 9)));
    }

    public static Character findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> charMap = new HashMap<>();
        int count;
        for (int i = 0; i < str.length(); i++) {
            if (charMap.containsKey(str.charAt(i))) {
                count = charMap.get(str.charAt(i));
                charMap.put(str.charAt(i), count + 1);

            } else {
                charMap.put(str.charAt(i), 1);
            }
        }
        for (Character ch :
                str.toCharArray()) {
            if (charMap.get(ch) == 1) {
                return ch;
            }
        }
        return null;
    }

    //solution 1
    public static int[] indicesOfNumbers(int[] arr, int target) {
        int[] result = new int[2];
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
    //solution 2

    public static int[] indicesOfNumbersSolution2(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int potentialMatch = target - arr[i];
            map.put(arr[i], i);
            if (map.containsKey(potentialMatch)){
                return new int[]{map.get(potentialMatch), map.get(arr[i])};
            }
        }
        return null;
    }
}
