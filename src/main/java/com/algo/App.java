package com.algo;


import com.algo.MaxSumSubArray.MaxSumSubArray;
import com.algo.ShuntingYard.ShuntingYard;
import com.algo.ShuntingYard.ShuntingYard2;
import com.algo.ShuntingYard.ShuntingYard3;
import com.algo.ShuntingYard.ShuntingYard4;


public class App {
    public static int findMaxSumSubArray(int[] arr,int k)
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
        return maxValue;
    }
    public static void main(String[] args) {

        ShuntingYard formulaParser= new ShuntingYard();
        ShuntingYard2  s2 =new ShuntingYard2();
        ShuntingYard3 s3 =new ShuntingYard3();
        ShuntingYard4 s4 = new ShuntingYard4();
//        System.out.println(s2.calculate("1−(273+(15/100))"));
//        System.out.println(s3.calculate("1000−(273+(15/100))"));
        System.out.println(s4.calculate("0−(273+(15/100)"));
        //System.out.println(formulaParser.calculate2("0−(273+(15/100))"));




    }


}
