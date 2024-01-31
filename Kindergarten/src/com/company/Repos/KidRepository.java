package com.company.Repos;

import com.company.Entities.Kid;

import java.util.ArrayList;

public interface KidRepository {

    Kid addKid(String name, int age, String gender, int section);

    void removeKid(int id);

    void changeInfo(String name, int age, String gender, int section, int id);

    ArrayList<Kid> getAllKids();

    ArrayList<Kid> getKidByGroup(int section);

    void getKidInfo(int id);

    int getNumKids();

    Kid getKidById(int id);

}
