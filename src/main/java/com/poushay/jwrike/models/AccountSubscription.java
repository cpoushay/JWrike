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
public class AccountSubscription {

    private String type;
    private boolean paid;
    private long userLimit;

    public void setType(String type) {
        this.type = type;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public void setUserLimit(long userLimit) {
        this.userLimit = userLimit;
    }

}
