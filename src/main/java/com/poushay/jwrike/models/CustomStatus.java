/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poushay.jwrike.models;

/**
 *
 * @author Colin
 */
public class CustomStatus {

    private String id;
    private String name;
    private boolean standardName;
    private String color;
    private boolean standard;
    private String group;
    private boolean hidden;

    public static String getPathAllWorkFlowsInAccount(String accountID) {
        return "/accounts/{accountId}/workflows";
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStandardName(boolean standardName) {
        this.standardName = standardName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStandard(boolean standard) {
        this.standard = standard;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
    
    
}
