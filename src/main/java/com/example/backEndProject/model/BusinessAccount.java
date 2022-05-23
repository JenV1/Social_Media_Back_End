package com.example.backEndProject.model;

public class BusinessAccount extends User {

    private String businessSector;

    public BusinessAccount(Long id, String company, String password, String businessSector){
        super(id, company, password);
        this.businessSector = businessSector;
    }

    public String getBusinessSector() {
        return businessSector;
    }

    public void setBusinessSector(String businessSector) {
        this.businessSector = businessSector;
    }
}
