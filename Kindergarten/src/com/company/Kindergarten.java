package com.company;

import com.company.Controllers.GroupController;
import com.company.Controllers.KidController;
import com.company.Entities.Group;
import com.company.Entities.Kid;

import java.util.ArrayList;

public class Kindergarten {

    private ArrayList<Kid> kidsList = new ArrayList<>();
    private ArrayList<Group> groupsList = new ArrayList<>();
    public KidController kc = new KidController(new KidRepositoryListImpl(kidsList));
    public GroupController gc = new GroupController(new GroupRepositoryListImpl(groupsList));

}

