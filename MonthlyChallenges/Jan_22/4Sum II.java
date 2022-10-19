import java.util.HashMap;
import java.util.Map;

class FourSum {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int a : A) {
            for (int b : B) {
                int index = a + b;
                map.put(index, map.getOrDefault(index, 0) + 1);
            }
        }
        for (int c : C) {
            for (int d : D) {
                int index = -(c + d);

                if (map.containsKey(index)) {
                    result += map.get(index);
                }
            }
        }

        return result;
    }
}