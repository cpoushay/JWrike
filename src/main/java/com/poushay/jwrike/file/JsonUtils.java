/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poushay.jwrike.file;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 *
 * @author Colin
 */
public class JsonUtils {

    public static JsonObject stringToJson(String s) {
        
        JsonParser parser = new JsonParser();     
        return parser.parse(s)
                     .getAsJsonObject();
    }
}
  