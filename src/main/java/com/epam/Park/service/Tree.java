package com.epam.Park.service;

import org.springframework.stereotype.Component;

@Component
public class Tree {
    private String tree_kind;
    private String tree_color = "natural";
    private int treeID;

    public Tree() {
    }

    public Tree(String tree_color) {
        this.tree_color = tree_color;
    }

    public Tree(int treeID, String tree_kind) {
        this.tree_kind = tree_kind;
        this.treeID = treeID;
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

    @Override
    public String toString() {
        return "Tree{ " + "id = " + getTreeID() + "; " +
                "tree type = " + getTree_kind() + "; " +
                "tree color = " + getTree_color() + ";} ";
    }
}
