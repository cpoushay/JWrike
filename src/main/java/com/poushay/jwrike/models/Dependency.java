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
public class Dependency {

    public static String getPathTaskDependencies(String taskId) {
        return "/tasks/" + taskId + "/dependencies";
    }

    private String id;
    private String predecssorID;
    private String sucessorId;
    private String relationType;

    public void setId(String id) {
        this.id = id;
    }

    public void setPredecssorID(String predecssorID) {
        this.predecssorID = predecssorID;
    }

    public void setSucessorId(String sucessorId) {
        this.sucessorId = sucessorId;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

}
