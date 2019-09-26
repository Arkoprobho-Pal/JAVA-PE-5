package com.stackroute.main;

public class Student {
    private int id;
    private String Name;
    private int  age;

    public Student(int id, String name, int age) {
        this.id = id;
        Name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "{Name: "+Name+" Age: "+age+" Id: "+id+"} ";
    }
}
