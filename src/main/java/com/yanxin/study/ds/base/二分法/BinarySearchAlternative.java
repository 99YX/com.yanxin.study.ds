package com.yanxin.study.ds.base.二分法;
/*
* 二分查找升级版*/
public class BinarySearchAlternative {




    public static int binarySearchBaseAlternative(int [] arr,int target)
    {
        /*左半边初始变量*/
        int i=0;
        /*右半边初始变量*/
        int j=arr.length;

        /*判断数据*/
        while (i<j)
        {
            /*寻找一个中间值 >>>：无符号右移位 >>:带符号右移*/
            int m=(i+j)>>>1;
            /*如果目标值<中间值*/
            if(target<arr[m])
            {
                /*j必须向左移动*/
                j=m;

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






        return -1;
    }
}
