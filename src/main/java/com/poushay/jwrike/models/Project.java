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
public class Project {

    private String authorId;
    private List<String> ownerIds;
    private String status;
    private String startDate;
    private String endDate;
    private String createdDate;
    private String completedDate;

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public void setOwnerIds(List<String> ownerIds) {
        this.ownerIds = ownerIds;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public void setCompletedDate(String completedDate) {
        this.completedDate = completedDate;
    }
    
    
}
