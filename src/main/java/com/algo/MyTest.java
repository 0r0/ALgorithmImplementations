package com.algo;

import com.algo.MaxSumSubArray.MaxSumSubArray;

public class MyTest {
    public static void main(String[] args) {

       System.out.println("this is test");
        MaxSumSubArray mssa=new MaxSumSubArray();
        var max=mssa.findMaxSumSubArray(new int[]{4,2,1,7,8,1,2,8,1,0},3);
        System.out.println("max is:"+max);


}

}
