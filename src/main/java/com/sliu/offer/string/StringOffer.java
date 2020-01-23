package com.sliu.offer.string;

/**
 *
 * @author: sliu
 * @date: 2020/1/23 11:00
 **/
public class StringOffer {
    /**
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     */

    public String replaceSpace1(StringBuffer str) {

        if (str == null) {
            return "";
        }
        return str.toString().replaceAll(" ", "%20");
    }

    /**
     * 在当前字符串替换，怎么替换才更有效率
     * 从前往后替换，后面的字符要不断往后移动，要多次移动，所以效率低下
     * 从后往前，先计算需要多少空间，然后从后往前移动，则每个字符只为移动一次，这样效率更高一点
     * @param str
     * @return
     */
    public static String replaceSpace2(StringBuffer str) {
        if (str == null) {
            return "";
        }
        int usedLength = str.length();
        int spaceNum = 0;
        for (int i = 0; i < usedLength; i++) {
            if (str.charAt(i) == ' ') {
                spaceNum++;
            }
        }
        int newLength = usedLength + spaceNum * 2;
        str.setLength(newLength);
        int j = newLength - 1;
        for (int i = usedLength - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                str.setCharAt(j--, '0');
                str.setCharAt(j--, '2');
                str.setCharAt(j--, '%');
            } else {
                str.setCharAt(j--, str.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = replaceSpace2(new StringBuffer("StringBuffer str"));
        System.out.println(s);
    }
}
