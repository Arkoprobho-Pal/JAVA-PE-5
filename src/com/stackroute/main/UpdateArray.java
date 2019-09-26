package com.stackroute.main;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateArray {
    public void UpdateArrayElement(){
        //code here
        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("Apple");
        stringArrayList.add("Grape");
        stringArrayList.add("Melon");
        stringArrayList.add("Berry");

        System.out.println("Input: "+stringArrayList);
        stringArrayList.set(0,"Kiwi");
        stringArrayList.set(2,"Mango");
        System.out.println("Output: "+stringArrayList);
        stringArrayList.clear();
        System.out.println("ArrayList after removing all elements : "+stringArrayList);
        //   Scanner input=new Scanner(System.in);
       // System.out.println("Enter the element you want to change with updated value: ");
      //  String tarString=input.nextLine();
      //  String[] stringArray=inputString.split("\\s+");

    }

    public static void main(String[] args) {
        UpdateArray updateArray=new UpdateArray();
        updateArray.UpdateArrayElement();
    }
}
