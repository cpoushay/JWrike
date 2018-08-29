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
public class User {
    
    private String id;
    private String firstName;
    private String lastName;
    private String type;
    private List<UserProfile> profiles;
    private String avatar;
    private String timezone;
    private String avatarUrl;
    private String locale;
    private boolean deleted;
    private boolean me;
    private List<String> memberIds;
    private Map<String, String> metadata;
    private boolean myTeam;
    private String title;
    private String companyName;
    private String phone;
    private String location;

    
    public static String getPathUserInfo(String userId){
        return "/users/" + userId;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setProfiles(List<UserProfile> profiles) {
        this.profiles = profiles;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public void setMe(boolean me) {
        this.me = me;
    }

    public void setMemberIds(List<String> memberIds) {
        this.memberIds = memberIds;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public void setMyTeam(boolean myTeam) {
        this.myTeam = myTeam;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
