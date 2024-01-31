package com.company.Controllers;

import com.company.Entities.Group;
import com.company.Repos.GroupRepository;

import java.util.ArrayList;

public class GroupController {

    private GroupRepository gr;

    public GroupController(GroupRepository gr) {
        this.gr = gr;
    }

    public void createGroup(String name) {
        gr.createGroup(name);
    }

    public void deleteGroup(int id) {
        gr.deleteGroup(id);
    }

    public void changeGroupName(String name, int id) {
        gr.changeName(name, id);
    }

    public Group getGroup(int id) {
        return gr.getGroup(id);
    }

    public ArrayList<Group> getAllGroups() {
        return gr.getAllGroups();
    }

}
