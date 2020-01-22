package com.sliu.offer.search;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author: sliu
 * @date: 2020/1/22 10:14
 **/
public class FindIn {

    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
     * @param target
     * @param array
     * @return
     */
    public static boolean find(int target, int[][] array) {
        if (array == null || array.length < 1 || array[0].length < 1) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (target <= array[i][array[0].length - 1]) {
                for (int j = 0; j < array[i].length; j++) {
                    if (target == array[i][j]) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     */
    public static int minNumberInRotateArray(int[] array) {
        if (array == null || array.length < 1) {
            return 0;
        }
        return 0;
    }


    public static void main(String[] args) {
//        int[][] array = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
//        boolean b = find(15, array);
//        System.out.println(b);
        int[] arr = {8, 9, 1, 2};
        int number = minNumberInRotateArray(arr);
        System.out.println(number);
    }
}
