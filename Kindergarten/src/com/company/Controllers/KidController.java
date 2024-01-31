package com.company.Controllers;

import com.company.Entities.Kid;
import com.company.Repos.KidRepository;

import java.util.ArrayList;

public class KidController {

    private KidRepository kr;

    public KidController(KidRepository kr) {
        this.kr = kr;
    }

    public void addKid(String name, int age, String gender, int section) {
        kr.addKid(name, age, gender, section);
    }

    public void removeKid(int id) {
        kr.removeKid(id);
    }

    public void changeKidInformation(String name, int age, String gender, int section, int id) {
        kr.changeInfo(name, age, gender, section, id);
    }

    public ArrayList<Kid> getAllKids() {
        return kr.getAllKids();
    }

    public ArrayList<Kid> getAllKidsInGroup(int section) {
        return kr.getKidByGroup(section);
    }

    public void getInformationAboutKid(int id) {
        kr.getKidInfo(id);
    }

    public int getNumberOfKids() {
        return kr.getNumKids();
    }

}
