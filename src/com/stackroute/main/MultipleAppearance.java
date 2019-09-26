package com.stackroute.main;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;

public class MultipleAppearance {
    public void CheckBooleanForAppearance(){
        String[] stringArray={"a","b","c","d","a","c","c"};
        Map<String,Boolean> map= new HashMap<String,Boolean>();
        for (int i=0;i<stringArray.length;i++){
            if(map.containsKey(stringArray[i])){
                map.put(stringArray[i],true);
            }
            else {
                map.put(stringArray[i],false);
            }
        }
        System.out.println(map);
    }


    public static void main(String[] args) {
        MultipleAppearance multipleAppearance=new MultipleAppearance();
        multipleAppearance.CheckBooleanForAppearance();
    }
}
