/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poushay.jwrike.client;

import com.google.gson.JsonObject;
import com.poushay.jwrike.http.URISchemes;
import com.poushay.jwrike.file.JsonUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.Charsets;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author Colin
 */
abstract class AbstractClient {

    public abstract String getBaseURL();

    protected abstract HttpGet makeHttpGet(URI uri);

    protected abstract HttpPost makeHttpPost(URI uri);

    public JsonObject getResponseJson(HttpRequestBase base) throws IOException {
        String responseString = getResponseString(base);
        JsonObject o = JsonUtils.stringToJson(responseString);
        return o;
    }

    public String getResponseString(HttpRequestBase base) throws IOException {
        String string = null;

        CloseableHttpClient httpclient = HttpClients.createDefault();
        CloseableHttpResponse response = httpclient.execute(base);
        try {
            HttpEntity entity = response.getEntity();
            if (entity != null) {

                InputStream instream = entity.getContent();
                try {
                    Header encodingHeader = entity.getContentEncoding();

                    Charset encoding = encodingHeader == null ? StandardCharsets.UTF_8
                            : Charsets.toCharset(encodingHeader.getValue());

                    string = EntityUtils.toString(entity, encoding);

                } finally {
                    instream.close();
                }
            }
        } finally {
            response.close();
        }

        return string;

    }

    protected URIBuilder uriBuilderWithHostAndScheme() {

        return new URIBuilder()
                .setScheme(URISchemes.HTTPS)
                .setHost(getBaseURL());
    }

    public JsonObject getJsonFromURI(URI uri) {

        String responseString = null;

        try {

            responseString = getResponseString(makeHttpGet(uri));

        } catch (IOException ex) {

        }

        JsonObject o = JsonUtils.stringToJson(responseString);

        return o;
    }

}


 

