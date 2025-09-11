package org.example;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Task26 {
//    public int removeDuplicates(int[] nums) {
//        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(LinkedHashSet::new));
//        int i = 0;
//        for (Integer num : set) {
//            nums[i++] = num;
//        }
//        return set.size();
//    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int insertIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return  insertIndex;
    }
}
