package com.algo.MaxSumSubArray;



public class MaxSumSubArray {
    public int findMaxSumSubArray(int[] arr,int k)
    {
        int maxValue=Integer.MIN_VALUE;
        int currentSumValue=0;
        for(int i=0;i<arr.length;i++)
        {
            currentSumValue+=arr[i];
            if(i>=(k-1))
            {
                maxValue=Math.max(maxValue,currentSumValue);
                currentSumValue-=arr[i-(k-1)];
            }

        }
        return currentSumValue;
    }
}
