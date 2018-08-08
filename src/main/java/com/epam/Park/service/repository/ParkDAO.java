package com.epam.Park.service.repository;

import com.epam.Park.service.Tree;

import java.util.List;

public interface ParkDAO<LIST> {
    List<LIST> findAllTrees();

    void findTreeByID(int treeID);

    void plantTree(Tree tree);

    void paintTree(int treeID, String new_color);

    void cutTreeByID(int treeID);

    List<LIST> findTreesByType(String type);

}
