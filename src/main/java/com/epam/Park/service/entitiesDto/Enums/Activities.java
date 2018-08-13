package com.epam.Park.service.entitiesDto.Enums;

public enum Activities {

    PLANT("PLANT"),
    PAINT("PAINT"),
    CUT("CUT"),
    HEAL("HEAL");

    private String activity;

    Activities(String activity){
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return activity;
    }
}
