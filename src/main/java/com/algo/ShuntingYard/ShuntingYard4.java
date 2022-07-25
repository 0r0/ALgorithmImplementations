package com.algo.ShuntingYard;

import java.util.Stack;

public class ShuntingYard4 {

    char[] arr;
    int index =0;
    public double calculate(String s){
        arr= s.toCharArray();
        return  dfs();
    }
    private double dfs() {
        Stack<Double> stack = new Stack<Double>();
        char operator = '+';

        while (index < arr.length) {
            if (arr[index] != ' ')
            {
                if (Character.isDigit(arr[index])) {
                    StringBuilder buildNum = new StringBuilder();
                    while (index < arr.length && Character.isDigit(arr[index])) {
                        buildNum.append(arr[index++]);
                    }
                    index--;
                    int curNum = Integer.parseInt(buildNum.toString());
                    insertElement(stack, curNum, operator);

                } else if (arr[index] == '(') {
                    index++;
                    double curNum = dfs();
                    insertElement(stack, curNum, operator);
                } else if (arr[index] == ')') {
                    break;
                } else {
                    operator = arr[index];
                }
            }
            index++;
        }

        int total =0;
        while(!stack.isEmpty()) {
            total+=stack.pop();
        }
        return total;
    }
   private void insertElement(Stack<Double> stack,double curNum,char operator)
   {
           if(operator== '-') {
               curNum *= -1;
           }else if(operator == '*') {
               curNum *= stack.pop();
           }else if (operator =='/') {
               curNum = stack.pop() / curNum;
           }
           stack.push(curNum);
   }
    }

