package org.example;

import java.util.Arrays;

/*
    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.

    Example 1:

    Input: nums = [1,3,5,6], target = 5
    Output: 2
    Example 2:

    Input: nums = [1,3,5,6], target = 2
    Output: 1
    Example 3:

    Input: nums = [1,3,5,6], target = 7
    Output: 4


    Constraints:

    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    nums contains distinct values sorted in ascending order.
    -104 <= target <= 104
 */
public class Task35 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) end = mid - 1;
            else if (nums[mid] < target) start = mid + 1;
            else return mid;
        }
        return start;
    }
}
