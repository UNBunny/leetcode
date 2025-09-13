package neetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            arr.add(new int[] { entry.getKey(), entry.getValue() });
        }

        arr.sort((a, b) -> b[1] - a[1]);

        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = arr.get(i)[0];
        }

        return result;
    }
}
