package com.epam.Park.service.repository;

import com.epam.Park.service.entitiesDto.Tree;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TreeDAO_Impl implements TreeDAO {
    private List<Tree> trees = new ArrayList<>();


    @Override
    public List<Tree> findAllTrees() {
        System.out.println(trees);
        return trees;
    }

    @Override
    public void findTreeByID(int treeID) {
        System.out.println(trees.get(treeID));
    }

    @Override
    public void plantTree(Tree tree) {
        trees.add(new Tree(tree.getTreeID(), tree.getTree_kind()));

    }


    @Override
    public void paintTree(int treeID, String new_color) {
        trees.set(treeID, new Tree(new_color));

    }

    @Override
    public void cutTreeByID(int treeID) {
        trees.remove(treeID);

    }

    @Override
    public List<Tree> findTreesByType(String type) {
        List<Tree> list = null;
        for (Tree tree : trees) {
            if (tree.getTree_kind() == type) {
                list.add((tree));
            }

        }

        return list;
    }
}
