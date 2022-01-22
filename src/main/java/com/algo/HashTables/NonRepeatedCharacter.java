package com.algo.HashTables;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharacter {
    private String inputString;
    private Map<Character, Integer> hashCharacter=new HashMap<Character, Integer>();
    public NonRepeatedCharacter(String inputString)
    {
        this.inputString = inputString;
    }

    public char findNonRepeatedCharacter(){
        var chars=inputString.toCharArray();
        for(char c:chars)
        {
             var count=hashCharacter.containsKey(c) ? hashCharacter.get(c) :0;
             hashCharacter.put(c,count+1);
        }

        System.out.println(hashCharacter);
        for(char c:chars)
        {
            if(hashCharacter.get(c)==1)
                return c;
        }
        return  Character.MIN_VALUE;

    }

}
