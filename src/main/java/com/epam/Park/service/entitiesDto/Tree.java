package com.epam.Park.service.entitiesDto;

import com.epam.Park.service.entitiesDto.Enums.TreeStatus;
import org.springframework.stereotype.Component;

@Component
public class Tree {
    private String tree_kind;
    private String tree_color = "natural";
    private int treeID;
    private TreeStatus status;

    public Tree() {
    }

    public Tree(String tree_color) {
        this.tree_color = tree_color;
    }


    public Tree(int treeID, String tree_kind, TreeStatus status) {
        this.treeID = treeID;
        this.tree_kind = tree_kind;
        this.status = status;

    }

    public Tree(int treeID, String tree_kind) {
        this(treeID, tree_kind, status.HEALTHY);
    }

    public String getTree_kind() {
        return tree_kind;
    }

    public void setTree_kind(String tree_kind) {
        this.tree_kind = tree_kind;
    }

    public String getTree_color() {
        return tree_color;
    }

    public void setTree_color(String tree_color) {
        this.tree_color = tree_color;
    }

    public int getTreeID() {
        return treeID;
    }

    public void setTreeID(int treeID) {
        this.treeID = treeID;
    }

    public TreeStatus getStatus() {
        return status;
    }

    public void setStatus(TreeStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tree{ " + "id = " + getTreeID() + "; " +
                "tree type = " + getTree_kind() + "; " +
                "tree color = " + getTree_color() + "; " +
                "tree status = " + getStatus() + ";} ";
    }
}
