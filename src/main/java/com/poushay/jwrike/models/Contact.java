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
public class Contact {

    private String id;
    private String firstName;
    private String lastName;
    private String type;
    private List<UserProfile> profiles;
    private String avatarUrl;
    private String timezone;
    private String locale;
    private boolean deleted;
    private boolean me;
    private List<String> memberIds;
    private Map<String,String> metadata;
    private boolean myTeam;
    private String title;
    private String companyName;
    private String phone;
    private String location;

    public static String getPathForAllContacts() {

        return "/contacts";
    }

    public static String getPathForAllContactsByAccount(String accountId) {

        return "/accounts/" + accountId + "/contacts";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<UserProfile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<UserProfile> profiles) {
        this.profiles = profiles;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isMe() {
        return me;
    }

    public void setMe(boolean me) {
        this.me = me;
    }

    public List<String> getMemberIds() {
        return memberIds;
    }

    public void setMemberIds(List<String> memberIds) {
        this.memberIds = memberIds;
    }

    public Map<String, String> getMetaData() {
        return metadata;
    }

    public void setMetaData(Map<String, String> metaData) {
        this.metadata = metaData;
    }

    public boolean isMyTeam() {
        return myTeam;
    }

    public void setMyTeam(boolean myTeam) {
        this.myTeam = myTeam;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }



 
}
