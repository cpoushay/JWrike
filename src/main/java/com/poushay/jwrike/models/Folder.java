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
public class Folder {
    private String id;
    private String title;
    private String color;
    private List<String> childIds;
    private String scope;
    private Project project;

    
    public static String getPathFolders() {
        return "/folders";
    }

    public static String getPathFolderTreeByAccount(String accountId) {
        return "/accounts/" + accountId + "/folders";
    }

    public static String getPathFolderTreeByFolder(String folderId) {
        return "/folders/" + folderId + "/folders";
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setChildIds(List<String> childIds) {
        this.childIds = childIds;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getColor() {
        return color;
    }

    public List<String> getChildIds() {
        return childIds;
    }

    public String getScope() {
        return scope;
    }

    public Project getProject() {
        return project;
    }
    
    
}
