package com.company.Entities;

public class Kid {

    public String name;
    public int age;
    public String gender;
    public int groupId;
    public int id;

    public Kid(String name, int age, String gender, int section, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.groupId = section;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGroup(int section) {
        this.groupId = section;
    }

}
