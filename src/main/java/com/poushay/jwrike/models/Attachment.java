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
public class Attachment {

    private String id;
    private String authorId;
    private String name;
    private String createdDate;
    private int version;
    private String type;
    private String contentType;
    private long size;
    private String taskId;
    private String folderId;
    private String commentId;
    private String currentAttachmentId;
    private String url;
    private List<String> reviewIds;

    public static String getPathAccountAttachments(String accountId) {
        return "/accounts/" + accountId + "/attachments";
    }

    public static String getPathFolderAttachments(String folderId) {
        return "/folders/" + folderId + "/attachments";
    }

    public static String getPathTaskAttachments(String taskId) {
        return "/tasks/" + taskId + "/attachments";
    }
}
