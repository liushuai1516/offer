package com.sliu.offer.LeetCode;

import java.util.*;

/**
 *
 * @author: sliu
 * @date: 2020/4/28 0028 9:37
 **/
public class Solution {
    /**
     * 给定两个数组，编写一个函数来计算它们的交集。
     *
     * 示例 1:
     * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
     * 输出: [2]
     *
     * 示例 2:
     * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * 输出: [9,4]
     * 说明:
     * 输出结果中的每个元素一定是唯一的。
     * 我们可以不考虑输出结果的顺序。
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0) {
            return nums1;
        }
        if (nums2 == null || nums2.length == 0) {
            return nums2;
        }
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i], map1.getOrDefault(nums2[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        final Set<Integer> keySet1 = map1.keySet();
        final Set<Integer> keySet2 = map2.keySet();
        for (Integer integer : keySet1) {
            if (keySet2.contains(integer)) {
                for (int m = 0; m < Math.min(map1.get(integer), map2.get(integer)); m++) {
                    list.add(integer);
                }
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    /**
     * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
     * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
     * 你可以返回任何满足上述条件的数组作为答案。
     * 示例：
     * 输入：[4,2,5,7]
     * 输出：[4,5,2,7]
     * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
     */
    public static int[] sortArrayByParityII(int[] A) {
        if (A == null || A.length < 2) {
            return A;
        }
        int i = 0;
        int j = A.length - 1;
        if (j % 2 == 0) {
            j -= 1;
        }
        while (i < A.length && j > 0) {
            while (i < A.length && i % 2 == 0 && A[i] % 2 == 0) {
                i += 2;
            }
            while (j > 0 && j % 2 == 1 && A[j] % 2 == 1) {
                j -= 2;
            }
            if (i < A.length && j > 0) {

                swap(A, i, j);
            }
            i += 2;
            j -= 2;
        }
        return A;

    }

    public static int largestPerimeter(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i - 2] + A[i - 1] > A[i]) {
                return A[i - 2] + A[i - 1] + A[i];
            }

        }
        return 0;
    }

    /**
     * 给你两个数组，arr1 和 arr2，
     * arr2 中的元素各不相同
     * arr2 中的每个元素都出现在 arr1 中
     * 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾。
     * 示例：
     * 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
     * 输出：[2,2,2,1,4,3,3,9,6,7,19]
     */
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] re = new int[arr1.length];
        int left = 0;
        int right = re.length - 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                for (int j = 0; j < map.get(arr2[i]); j++) {
                    re[left++] = arr2[i];
                    map.remove(arr2[i]);
                }
            }
        }
        final Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            for (int i = 0; i < map.get(key); i++) {
                re[right--] = key;
            }
        }
        return re;
    }

    public static void swap(int[] arr, int i, int j) {
        final int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 2, 1};
//
//        int[] nums2 = {2};
//        final int[] intersection = intersection(nums1, nums2);
        final int[] ints = sortArrayByParityII(new int[]{2, 3});
    }
}
