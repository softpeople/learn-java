package 算法题;

import java.util.Random;
/*
给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。

如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。

假设环境不允许存储 64 位整数（有符号或无符号）。
 

示例 1：

输入：x = 123
输出：321
示例 2：

输入：x = -123
输出：-321
示例 3：

输入：x = 120
输出：21
示例 4：

输入：x = 0
输出：0
 

提示：

-231 <= x <= 231 - 1

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-integer
 */
class Solution {
    public int reverse(int x) {

        return (x+"").length();
    }
}
public class 反转字符 {
    public static void main(String[] args) {
        Solution a=new Solution();
        Random rdm=new Random();
        int stra=rdm.nextInt();
        System.out.println(stra);
        int strb=a.reverse(stra);
        System.out.println(strb);
    }
}
