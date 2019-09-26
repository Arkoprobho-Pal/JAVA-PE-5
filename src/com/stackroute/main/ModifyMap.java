package com.stackroute.main;

import java.util.HashMap;
import java.util.Map;

public class ModifyMap {
    public void MapMethod(Map<String, String> map){
        String value2;
        value2=map.get("val1");
        map.put("val1"," ");
        map.put("val2",value2);
        System.out.println("Output: "+map);
    }

    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");
        System.out.println("Input:" +map);
        ModifyMap modifyMap=new ModifyMap();
        modifyMap.MapMethod(map);
    }
}
