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
public class Comment {

    private String id;
    private String authorId;
    private String text;
    private String createdDate;
    private String taskId;
    private String folderId;

    public static String getPathAllComments() {
        return "/comments";
    }

    public static String getPathAccountComments(String accountId) {
        return "/accounts/" + accountId + "/comments";
    }

    public static String getPathTaskComments(String taskId) {
        return "/tasks/" + taskId + "/comments";
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

}
