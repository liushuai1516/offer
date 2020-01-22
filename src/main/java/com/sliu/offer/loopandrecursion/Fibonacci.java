package com.sliu.offer.loopandrecursion;

/**
 *
 * @author: sliu
 * @date: 2020/1/21 18:20
 **/
public class Fibonacci {
    // F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*
    public static Integer fibonacciRecursion(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
    }

    // 循环
    public static int fibonacciFor(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int pre = 1;
        int prePre = 1;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = pre + prePre;
            prePre = pre;
            pre = result;
        }
        return result;
    }


    // 现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。

    public static void main(String[] args) {
        Integer integer = fibonacciRecursion(6);
        System.out.println(integer);
        int i = fibonacciFor(6);
        System.out.println(i);
    }

}
