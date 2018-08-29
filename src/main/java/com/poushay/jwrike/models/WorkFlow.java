/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poushay.jwrike.models;

import java.util.List;

/**
 *
 * @author Colin
 */
public class WorkFlow {

    private String id;
    private String name;
    private boolean standard;
    private boolean hidden;
    private List<CustomStatus> customStatuses;

    public static String getPathWorkFlowsInAccount(String accountId) {
        return "/accounts/" + accountId + "/workflows";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStandard() {
        return standard;
    }

    public void setStandard(boolean standard) {
        this.standard = standard;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public List<CustomStatus> getCustomStatuses() {
        return customStatuses;
    }

    public void setCustomStatuses(List<CustomStatus> customStatuses) {
        this.customStatuses = customStatuses;
    }
    
}
