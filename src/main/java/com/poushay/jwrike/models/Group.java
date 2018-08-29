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
public class Group {

    private String contactId;
    private String accountId;
    private String title;
    private List<String> memberIds;
    private List<String> childIds;
    private List<String> parentIds;
    private String avatarUrl;
    private boolean myTeam;
    private Map<String, String> metadata;

    public String getContactId() {
        return contactId;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getMemberIds() {
        return memberIds;
    }

    public List<String> getChildIds() {
        return childIds;
    }

    public List<String> getParentIds() {
        return parentIds;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public boolean isMyTeam() {
        return myTeam;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

}
