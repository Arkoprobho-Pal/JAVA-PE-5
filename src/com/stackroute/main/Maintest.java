package com.stackroute.main;

import com.sun.tools.javac.Main;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Maintest {
    public void mainFunction(ArrayList<Student> studentArrayList){
        Comparator<Student> studentComparator=new StudentSorter();
        Collections.sort(studentArrayList,studentComparator);
        System.out.println(studentArrayList);
    }

    public static void main(String[] args) {
        ArrayList<Student>  studentArrayList=new ArrayList<>();
        Student student1= new Student(1,"Aryan",22);
        Student student2= new Student(3,"Akansha",22);
        Student student3= new Student(5,"Messi",32);
        Student student4= new Student(2,"Ronaldo",34);
        Student student5= new Student(4,"Akruti",22);
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);
      //  System.out.println(studentArrayList);
        Maintest maintest=new Maintest();
        maintest.mainFunction(studentArrayList);

    }
}
