/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poushay.jwrike.client;

import com.poushay.jwrike.file.FileUtils;
import com.poushay.jwrike.models.Task;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 *
 * @author Colin
 */
public class Program {

    private static String token = "xxx";
    private static String fileName = "Tasks.json";

    public static void main(String[] args) throws URISyntaxException, IOException {

        WrikeClient wrike = new WrikeClient(token);

        List<Task> allTasks = wrike.getAllTasks();

        FileUtils.printJson(fileName, allTasks);

    }

}
