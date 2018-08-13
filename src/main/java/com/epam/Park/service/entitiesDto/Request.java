package com.epam.Park.service.entitiesDto;

public class Request {
    private int id;
    private String activity;
    private int treeId;
    private int ownerId;
    private int foresterId;
    private String status; // enum:undone,done,checked;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getTreeId() {
        return treeId;
    }

    public void setTreeId(int treeId) {
        this.treeId = treeId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getForesterId() {
        return foresterId;
    }

    public void setForesterId(int foresterId) {
        this.foresterId = foresterId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
