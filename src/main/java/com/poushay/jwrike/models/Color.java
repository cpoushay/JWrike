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
public class Color {

    private String name;
    private String hex;

    public static String getPathAllColors() {
        return "/colors";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }


}
