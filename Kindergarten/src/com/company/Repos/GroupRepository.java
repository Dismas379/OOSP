package com.company.Repos;

import com.company.Entities.Group;

import java.util.ArrayList;

public interface GroupRepository {

    Group createGroup(String name);

    void deleteGroup(int id);

    void changeName(String name, int id);

    Group getGroup(int id);

    ArrayList<Group> getAllGroups();

}
