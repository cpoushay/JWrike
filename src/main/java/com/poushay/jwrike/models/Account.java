/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poushay.jwrike.models;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Colin
 */
public class Account {

    private static String Get_All_Path = "/accounts";

    private String id;
    private String name;
    private String dateFormat;
    private String firstDayOfWeek;
    private List<String> workDays;
    private String rootFolderId;
    private String recycleBinId;
    private String createdDate;
    private AccountSubscription subscription;
    private Map<String, String> metadata;
    private List<CustomField> customFields;
    private String joinedDate;

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

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getFirstDayOfWeek() {
        return firstDayOfWeek;
    }

    public void setFirstDayOfWeek(String firstDayOfWeek) {
        this.firstDayOfWeek = firstDayOfWeek;
    }

    public List<String> getWorkDays() {
        return workDays;
    }

    public void setWorkDays(List<String> workDays) {
        this.workDays = workDays;
    }

    public String getRootFolderId() {
        return rootFolderId;
    }

    public void setRootFolderId(String rootFolderId) {
        this.rootFolderId = rootFolderId;
    }

    public String getRecycleBinId() {
        return recycleBinId;
    }

    public void setRecycleBinId(String recycleBinId) {
        this.recycleBinId = recycleBinId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(String joinedDate) {
        this.joinedDate = joinedDate;
    }

    public static String getPathAllAcounts() {
        return Get_All_Path;
    }

    public AccountSubscription getSubscription() {
        return subscription;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public List<CustomField> getCustomFields() {
        return customFields;
    }




}
