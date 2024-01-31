package com.company;

import com.company.Entities.Group;
import com.company.Repos.GroupRepository;

import java.util.ArrayList;

public class GroupRepositoryListImpl implements GroupRepository {

    private ArrayList<Group> groups = new ArrayList<Group>();
    private int id = 0;

    public GroupRepositoryListImpl(ArrayList<Group> groups) {
        this.groups = groups;
    }

    @Override
    public Group createGroup(String name) {
        int id = this.id;
        groups.add(new Group(name, id));
        this.id += 1;
        return null;
    }

    @Override
    public void deleteGroup(int id) {
        groups.remove(id);
        for (int i = 0; i < groups.size(); i++) {
            if (groups.get(i).id == id) {
                groups.remove(i);
            }
        }
    }

    @Override
    public void changeName(String name, int id) {
        getGroup(id).setName(name);
    }

    @Override
    public Group getGroup(int id) {
        for (Group group : groups) {
            if (group.id == id) {
                return group;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Group> getAllGroups() {
        ArrayList<Group> groupList = new ArrayList<>(groups);
        return groupList;
    }

}
