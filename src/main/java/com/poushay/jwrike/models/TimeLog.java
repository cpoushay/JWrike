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
public class TimeLog {

    private String id;
    private String taskId;
    private String userId;
    private String categoryId;
    private double hours;
    private String createdDate;
    private String updatedDate;
    private String trackedDate;
    private String comment;

    public static String getPathAllTimeLogs() {
        return "/timelogs";

    }

    public static String getPathTimeLogsByUser(String contactId) {
        return "/contacts/" + contactId + "/timelogs";

    }

    public static String getPathTimeLogsByAccount(String accountId) {
        return "/accounts/" + accountId + "/timelogs";

    }

    public static String getPathTimeLogsByFolder(String folderId) {
        return "/folders/" + folderId + "/timelogs";

    }

    public static String getPathTimeLogsByTask(String taskId) {
        return "/tasks/" + taskId + "/timelogs";

    }

    public static String getPathTimeLogsByCategory(String timelogCategoryId) {
        return "/timelog_categories/" + timelogCategoryId + "/timelogs";
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public void setTrackedDate(String trackedDate) {
        this.trackedDate = trackedDate;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
}
