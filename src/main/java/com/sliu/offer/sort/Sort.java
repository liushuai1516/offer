package com.sliu.offer.sort;

import java.util.Arrays;

/**
 *
 * @author: sliu
 * @date: 2020/4/27 0027 14:43
 **/
public class Sort {


    public static void main(String[] args) {

        int[] arr = new int[]{3, 2, 5, 6, 1, 4};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right || arr == null || arr.length <= 1) {
            return;
        }
        int base = arr[left];
        int i = left;
        int j = right;
        while (i < j && arr[j] >= base) {
            j--;
        }
        while (i < j && arr[i] <= base) {
            i++;
        }
        if (i < j) {
            swap(arr, i, j);
        }
        System.out.println(String.format("i=%d,j=%d,arr=%s", i, j, Arrays.toString(arr)));
        //最终将基准数归位
        arr[left] = arr[i];
        arr[i] = base;
        System.out.println(String.format("arr=%s", Arrays.toString(arr)));
        //继续处理左边的，这里是一个递归的过程
        quickSort(arr, left, i - 1);
        //继续处理右边的 ，这里是一个递归的过程
        quickSort(arr, i + 1, right);


    }

    public static void swap(int[] array, int m, int n) {
        int temp = array[m];
        array[m] = array[n];
        array[n] = temp;
    }
}
