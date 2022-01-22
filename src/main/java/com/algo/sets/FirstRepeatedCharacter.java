package com.algo.sets;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {
    private String inputString;
    private Set<Character> inputStringAsSet=new HashSet<>();
    public FirstRepeatedCharacter(String inputString)
    {
        this.inputString=inputString;
    }
    public char findFirstRepeatedCharacter() {
        for (int i = 0; i < inputString.length(); i++)
        {
           if(inputStringAsSet.contains(inputString.charAt(i)))
               return inputString.charAt(i);
           inputStringAsSet.add(inputString.charAt(i));
        }
        return Character.MIN_VALUE;
    }
}
