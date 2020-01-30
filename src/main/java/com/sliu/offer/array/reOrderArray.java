package com.sliu.offer.array;

import java.util.Arrays;

public class reOrderArray {
    public static void reOrderArray1(int[] array) {
        if (array == null || array.length == 1) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                // c从右向左，右边为奇数，左边为偶数，交换
                if (array[j] % 2 == 1 && array[j - 1] % 2 == 0) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(1);
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        reOrderArray1(array);
        System.out.println(Arrays.toString(array));

    }

}
