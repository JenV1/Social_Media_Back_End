package com.example.backEndProject.model;

public enum Interests {
    SOFTWARE_ENGINEERING("S"), MACHINE_LEARNING("M"), AI("A");

    private String code;

    private Interests(String code){
        this.code =code;
    }

    public String getCode() {
        return this.code;
    }
}
