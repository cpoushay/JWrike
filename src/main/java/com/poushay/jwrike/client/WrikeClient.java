/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poushay.jwrike.client;

import com.poushay.jwrike.file.JsonUtils;
import com.poushay.jwrike.models.Account;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.poushay.jwrike.models.Comment;
import com.poushay.jwrike.models.Contact;
import com.poushay.jwrike.models.CustomField;
import com.poushay.jwrike.models.Dependency;
import com.poushay.jwrike.models.Folder;
import com.poushay.jwrike.models.Task;
import com.poushay.jwrike.models.TimeLog;
import com.poushay.jwrike.models.Version;
import com.poushay.jwrike.models.WorkFlow;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;

/**
 *
 * @author Colin
 */
public class WrikeClient extends AbstractClient {

    private final String BASE_URL = "www.wrike.com/api/v3";
    private String TOKEN;
    private final Gson gson = new Gson();
    private static Type TASK_LIST = new TypeToken<ArrayList<Task>>() {}.getType();
    
    @Override
    public String getBaseURL() {
        return BASE_URL;
    }

    @Override
    protected HttpGet makeHttpGet(URI uri) {
        HttpGet httpget = new HttpGet(uri);
        httpget.addHeader("Authorization", TOKEN);
        return httpget;
    }

    @Override
    protected HttpPost makeHttpPost(URI uri) {
        HttpPost httpPost = new HttpPost(uri);
        httpPost.addHeader("Authorization", TOKEN);
        return httpPost;
    }

    public WrikeClient(String token) {
        initToken(token);
    }

    public List<Folder> getFolders() throws URISyntaxException, IOException {
        List<Folder> folders = new ArrayList<>();

        URI uri = uriBuilderWithHostAndScheme()
                .setPath(Folder.getPathFolders())
                .build();

        String responseString = getResponseString(makeHttpGet(uri));

        JsonObject o = JsonUtils.stringToJson(responseString);
        
        Type taskType = new TypeToken<ArrayList<Folder>>() {
        }.getType();

        folders.addAll(gson.fromJson(o.get("data"), taskType));

        return folders;
    }
    
    public Folder getFolder(String folderId) throws URISyntaxException, IOException {
        Folder folder;

        URI uri = uriBuilderWithHostAndScheme()
                .setPath(Folder.getPathFolderTreeByFolder(folderId))
                .build();

        String responseString = getResponseString(makeHttpGet(uri));

        JsonObject o = JsonUtils.stringToJson(responseString);

        Type taskType = new TypeToken<Folder>() {
        }.getType();

        folder = (gson.fromJson(o.get("data"), taskType));

        return folder;
    }

    public List<Comment> getComments() throws URISyntaxException, IOException {
        List<Comment> comments = new ArrayList<>();

        URI uri = uriBuilderWithHostAndScheme()
                .setPath(Comment.getPathAllComments())
                .build();

        String responseString = getResponseString(makeHttpGet(uri));

        JsonObject o = JsonUtils.stringToJson(responseString);

        Type taskType = new TypeToken<ArrayList<Comment>>() {
        }.getType();

        comments.addAll(gson.fromJson(o.get("data"), taskType));

        return comments;
    }

    public List<Contact> getContacts() throws URISyntaxException, IOException {
        List<Contact> contactList = new ArrayList<>();

        URIBuilder uri = uriBuilderWithHostAndScheme()
                .setPath(Contact.getPathForAllContacts());

        JsonObject responseAsJson = getJsonFromURI(uri.build());

        Type taskType = new TypeToken<ArrayList<Contact>>() {
        }.getType();

        contactList.addAll(gson.fromJson(responseAsJson.get("data"), taskType));

        return contactList;
    }

    public List<Task> getAllTasks() throws URISyntaxException, IOException {
        List<Task> tasks = new ArrayList<>();

        getTasks(tasks, Optional.empty());

        return tasks;
    }

    private void getTasks(List<Task> taskList,Optional<String> pageToken) 
                          throws URISyntaxException, IOException {

        URIBuilder baseBuilder = uriBuilderWithHostAndScheme()
                                 .setPath(Task.getPathForTasks())
                                 .addParameter("pageSize", "1000");

        pageToken.ifPresent(x
                -> baseBuilder.addParameter("nextPageToken", x));

        JsonObject responseAsJson = getJsonFromURI(baseBuilder.build());

        taskList.addAll(gson.fromJson(responseAsJson.get("data"), TASK_LIST));

        if (null != responseAsJson.get("nextPageToken")) {

            getTasks(taskList,
                    Optional.of(responseAsJson.get("nextPageToken").getAsString()));
        }
    }
    
    public List<CustomField> getCustomFields() throws URISyntaxException, IOException {
        List<CustomField> customFields = new ArrayList<>();

        URI uri = uriBuilderWithHostAndScheme()
                .setPath(CustomField.Get_All_Path)
                .build();

        String responseString = getResponseString(makeHttpGet(uri));

        JsonObject o = JsonUtils.stringToJson(responseString);

        Type taskType = new TypeToken<ArrayList<CustomField>>() {
        }.getType();

        customFields.addAll(gson.fromJson(o.get("data"), taskType));

        return customFields;

    }

    public List<Account> getAccounts() throws URISyntaxException, IOException {
        List<Account> accounts = new ArrayList<>();

        URI uri = uriBuilderWithHostAndScheme()
                .setPath(Account.getPathAllAcounts())
                .build();

        String responseString = getResponseString(makeHttpGet(uri));

        JsonObject o = JsonUtils.stringToJson(responseString);
        Type taskType = new TypeToken<ArrayList<Account>>() {
        }.getType();

        accounts.addAll(gson.fromJson(o.get("data"), taskType));

        return accounts;

    }

    public List<WorkFlow> getAccountWorkFlows(String id) throws URISyntaxException, IOException {
        List<WorkFlow> workFlows = new ArrayList<>();

        URIBuilder uri = uriBuilderWithHostAndScheme()
                .setPath(WorkFlow.getPathWorkFlowsInAccount(id));

        JsonObject o = getJsonFromURI(uri.build());

        Type taskType = new TypeToken<ArrayList<WorkFlow>>() {
        }.getType();

        workFlows.addAll(gson.fromJson(o.get("data"), taskType));

        return workFlows;
    }

    public List<Dependency> getDependencies(String taskId) throws IOException, URISyntaxException {
        List<Dependency> dependencies = new ArrayList<>();

        URIBuilder uri = uriBuilderWithHostAndScheme()
                .setPath(Dependency.getPathTaskDependencies(taskId));

        JsonObject o = getJsonFromURI(uri.build());

        Type taskType = new TypeToken<ArrayList<Dependency>>() {
        }.getType();

        dependencies.addAll(gson.fromJson(o.get("data"), taskType));

        return dependencies;
    }

    public Version getVersion() throws URISyntaxException, IOException {

        Version version;

        URIBuilder uri = uriBuilderWithHostAndScheme()
                .setPath(Version.getPathForVersion());

        JsonObject o = getJsonFromURI(uri.build());


        Type taskType = new TypeToken<Version>() {
        }.getType();

        version = gson.fromJson(o.get("data").getAsJsonArray().get(0), taskType);

        return version;
    }

    public List<TimeLog> getTimeLogs() throws URISyntaxException, IOException {

        List<TimeLog> timeLogs = new ArrayList<>();

        URIBuilder uri = uriBuilderWithHostAndScheme()
                .setPath(TimeLog.getPathAllTimeLogs());
      
        JsonObject o = getJsonFromURI(uri.build());

        Type taskType = new TypeToken<ArrayList<TimeLog>>() {
        }.getType();

        timeLogs.addAll(gson.fromJson(o.get("data"), taskType));

        return timeLogs;
    }

//    public void createTask(Task task, String folderId) throws URISyntaxException, IOException {
//        URI uri = uriBuilderWithHostAndScheme()
//                .setPath(Task.getPathCreate(folderId))
//                //   .addParameter("title", "bug")
//                .build();
//        HttpPost post = makeHttpPost(uri);
//        String json = gson.toJson(task);
//        JsonElement jo = new JsonParser().parse(json);
//        post.setHeader("Content-type", "application/json");
//        StringEntity entity = new StringEntity(json);
//
//        post.setEntity(entity);
//        String responseString = getResponseString(post);
//
//    }

    private void initToken(String token) {
        this.TOKEN = "Bearer " + token;
    }

}
