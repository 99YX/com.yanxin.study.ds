package com.yanxin.study.ds.base.二分法;
/*
* 二分法1.0版本
*
*
*
* */
public class BinarySerch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};
        int target=7;
        binarySearchBase(arr,target);


    }
    public static int binarySearchBase(int [] arr,int target)
    {
        /*左半边初始变量*/
        int i=0;
        /*右半边初始变量*/
        int j=arr.length-1;

        /*判断数据*/
        while (i<=j)
        {
          /*寻找一个中间值*/
            int m=(i+j)/2;
            /*如果目标值<中间值*/
            if(target<arr[m])
            {
                /*j必须向左移动*/
                j=m-1;

            }
            /*如果目标值>中间值说明在右边找*/
            else if (target>arr[m]) {
                /*i向右移动*/
                i=m+1;
            }
            else
            {
                System.out.printf("---------->"+m);
                return m;
            }

        }

        /*未找到返回-1*/
        return -1;
    }
}
