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
public class CustomField {

    private String id;
    private String accountId;
    private String title;
    private String type;
    private List<String> sharedIds;
    private String value;
    public static final String Get_All_Path = "/customfields";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getSharedIds() {
        return sharedIds;
    }

    public void setSharedIds(List<String> sharedIds) {
        this.sharedIds = sharedIds;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    
    
}
