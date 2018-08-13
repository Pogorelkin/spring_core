package com.epam.Park.service.entitiesDto.Enums;

public enum TreeStatus {
    HEALTHY("HEALTHY"),
    SICK("SICK");

    private String status;

    TreeStatus(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}
