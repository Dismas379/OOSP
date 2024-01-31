package com.company;

import com.company.Entities.Kid;
import com.company.Repos.KidRepository;

import java.util.ArrayList;

public class KidRepositoryListImpl implements KidRepository {

    private ArrayList<Kid> kids = new ArrayList<Kid>();
    private int id = 0;

    public KidRepositoryListImpl(ArrayList<Kid> kidList) {
        this.kids = kidList;
    }

    @Override
    public Kid addKid(String name, int age, String gender, int section) {
        int id = this.id;
        kids.add(new Kid(name, age, gender, section, id));
        this.id += 1;
        return null;
    }

    @Override
    public void removeKid(int id) {
        for (int i = 0; i < kids.size(); i++) {
            if (kids.get(i).id == id) {
                kids.remove(i);
                break;
            }
        }
    }

    @Override
    public void changeInfo(String name, int age, String gender, int section, int id) {
        getKidById(id).setName(name);
        getKidById(id).setAge(age);
        getKidById(id).setGender(gender);
        getKidById(id).setGroup(section);
    }

    @Override
    public ArrayList<Kid> getAllKids() {
        ArrayList<Kid> kidList = new ArrayList<>(kids);
        return kidList;
    }

    @Override
    public ArrayList<Kid> getKidByGroup(int group) {
        ArrayList<Kid> kidList = new ArrayList<>();
        for (Kid kid : kids) {
            if (kid.groupId == group) {
                kidList.add(kid);
            }
        }
        return kidList;
    }

    @Override
    public void getKidInfo(int id) {
        for (Kid kid : kids) {
            if (kid.id == id) {
                System.out.println("Имя ребенка = " + kid.name + "  Возраст ребенка - " + kid.age + "  Пол ребенка - " + kid.gender + "  группа ребенка - " + kid.groupId);
                break;
            }
        }
    }

    @Override
    public int getNumKids() {
        return kids.size();
    }

    public Kid getKidById(int id) {
        for (Kid kid : kids) {
            if (kid.id == id) {
                return kid;
            }
        }
        return null;
    }

}

