package com.stackroute.main;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge()==o2.getAge()){
           return o1.getName().compareTo(o2.getName());
        }
        if (o1.getAge()<o2.getAge()){
            return 1;
        }
        else{
            return -1;
        }

    }
}
