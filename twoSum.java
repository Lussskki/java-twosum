import java.util.HashMap;
import java.util.Map;

class twoSum {
    public static void main(String[] args) {
        int[] numbers = new int[] {2, 3, 7, 4, 8};
        int targer = 6;
        int[] result = getTwoSum(numbers, targer);
        System.out.println(result[0] + " " + result[1]);
    }
    public static int[] getTwoSum(int[] numbers, int target) {
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int delta = target - numbers[i];
            if (visitedNumbers.containsKey(delta)) {
                return new int[] {i, visitedNumbers.get(delta)};
            }
            visitedNumbers.put(numbers[i], i);
        }
        return new int[] { -1, -1};
    }
}