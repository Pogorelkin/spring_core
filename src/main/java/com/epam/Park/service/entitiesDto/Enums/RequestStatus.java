package com.epam.Park.service.entitiesDto.Enums;

public enum RequestStatus {
    UNDONE("UNDONE"),
    DONE("DONE"),
    CHECKED("CHECKED");


    private String reqStatus;

    RequestStatus(String activity){
        this.reqStatus = activity;
    }

    public String getReqStatus() {
        return reqStatus;
    }

    public void setReqStatus(String reqStatus) {
        this.reqStatus = reqStatus;
    }

    @Override
    public String toString() {
        return reqStatus;
    }
}
