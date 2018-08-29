/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poushay.jwrike.models;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Colin
 */
public class Task {

    public static String getPathCreate(String folderId) {
        return "/folders/" + folderId + "/tasks";
    }

 

    private String id;
    private String accountId;
    private String title;
    private String description;
    private List<String> parentIds;
    private String status;
    private String importance;
    private String createdDate;
    private String updatedDate;
    private String completedDate;
    private TaskDate dates;
    private String scope;
    private List<String> authorIds;
    private List<String> responsibleIds;
    private List<String> sharedIds;
    private String customStatusId;
    private boolean hasAttachments;
    private int attachmentCount;
    private String permalink;
    private String priority;
    private boolean followedByMe;
    private List<String> followerIds;
    private boolean recurrent;
    private List<String> superTaskIds;
    private List<String> dependecyIds;
    private Map<String,String> metadata;
    private List<CustomField> customFields;
    public static String getPathForTasks() {
        return "/tasks";
    }

    public static String getPathForAccountTasks(String accountId) {
        return "/accounts/" + accountId + "/tasks";
    }

    public static String getPathForFolderTasks(String folderId) {
        return "/folders/" + folderId + "/tasks";
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getParentIds() {
        return parentIds;
    }

    public void setParentIds(List<String> parentIds) {
        this.parentIds = parentIds;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public void setCompletedDate(String completedDate) {
        this.completedDate = completedDate;
    }

    public void setDates(TaskDate dates) {
        this.dates = dates;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public void setCustomStatusId(String customStatusId) {
        this.customStatusId = customStatusId;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public String getImportance() {
        return importance;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public String getCompletedDate() {
        return completedDate;
    }

    public TaskDate getDates() {
        return dates;
    }

    public String getScope() {
        return scope;
    }

    public String getCustomStatusId() {
        return customStatusId;
    }

    public String getPermalink() {
        return permalink;
    }

    public String getPriority() {
        return priority;
    }

    public void setAuthorIds(List<String> authorIds) {
        this.authorIds = authorIds;
    }

    public void setHasAttachments(boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    public void setAttachmentCount(int attachmentCount) {
        this.attachmentCount = attachmentCount;
    }

    public void setFollowedByMe(boolean followedByMe) {
        this.followedByMe = followedByMe;
    }

    public void setFollowerIds(List<String> followerIds) {
        this.followerIds = followerIds;
    }

    public void setRecurrent(boolean recurrent) {
        this.recurrent = recurrent;
    }

    public void setSuperTaskIds(List<String> superTaskIds) {
        this.superTaskIds = superTaskIds;
    }

    public void setDependecyIds(List<String> dependecyIds) {
        this.dependecyIds = dependecyIds;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }

    public List<String> getAuthorIds() {
        return authorIds;
    }

    public boolean isHasAttachments() {
        return hasAttachments;
    }

    public int getAttachmentCount() {
        return attachmentCount;
    }

    public boolean isFollowedByMe() {
        return followedByMe;
    }

    public List<String> getFollowerIds() {
        return followerIds;
    }

    public boolean isRecurrent() {
        return recurrent;
    }

    public List<String> getSuperTaskIds() {
        return superTaskIds;
    }

    public List<String> getDependecyIds() {
        return dependecyIds;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public List<CustomField> getCustomFields() {
        return customFields;
    }

    public List<String> getResponsibleIds() {
        return responsibleIds;
    }

    public void setResponsibleIds(List<String> responsibleIds) {
        this.responsibleIds = responsibleIds;
    }

    public List<String> getSharedIds() {
        return sharedIds;
    }

    public void setSharedIds(List<String> sharedIds) {
        this.sharedIds = sharedIds;
    }

}
