package com.sliu.offer.loopandrecursion;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * @author: sliu
 * @date: 2020/1/22 9:32
 **/
public class FrogStep {
    public static int step(int n) {
        if (n <= 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return step(n - 1) + step(n - 2);
    }

    /**
     * 变态跳台阶：一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
     * @param target
     */
    public static int step4Crazy(int target) {
        int result = 1;
        for (int i = 1; i < target; i++) {
            result *= 2;
        }
        return result;
    }


    public static void main(String[] args) {
        int step = step(3);
        System.out.println(step);
        int i = step4Crazy(3);
        System.out.println(i);
    }

}
