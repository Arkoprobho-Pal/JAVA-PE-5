package com.stackroute.main;

import java.util.Set;
import java.util.TreeSet;

public class SortUsingSet {
    public void SetSort(){
        Set<String> stringSet=new TreeSet<>();
        stringSet.add("Harry");
        stringSet.add("Olive");
        stringSet.add("Alice");
        stringSet.add("Bluto");
        stringSet.add("Eugene");
        System.out.println(stringSet);
    }

    public static void main(String[] args) {
        SortUsingSet sortUsingSet=new SortUsingSet();
        sortUsingSet.SetSort();
    }
}
