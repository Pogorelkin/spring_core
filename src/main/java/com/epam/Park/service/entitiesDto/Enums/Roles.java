package com.epam.Park.service.entitiesDto.Enums;

public enum Roles {

    OWNER("OWNER"),
    FORESTER("FORESTER");

    private String role;

    Roles(String role){
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return role;
    }
}
