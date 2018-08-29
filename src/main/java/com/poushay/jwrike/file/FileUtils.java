/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poushay.jwrike.file;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Colin
 */
public class FileUtils {

    public static void printJson(String fileName, Object src) {
        try (Writer writer = new java.io.FileWriter(fileName)) {
            Gson wgson = new GsonBuilder()
                             .setPrettyPrinting()
                             .create();

                             wgson.toJson(src, writer);
        } catch (IOException e) {
        };

    }
    
}
