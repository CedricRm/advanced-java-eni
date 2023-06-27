package com.advancedjava.invetorymanagement.httpappache;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.IOException;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.core5.net.URIBuilder;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import org.apache.hc.client5.http.classic.methods.HttpDelete;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.classic.methods.HttpPut;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;

public class HttpCallActions {

    public static String baseURI = "http://localhost:3000";

    // Client for SSL
    public static CloseableHttpClient getNonSSLClient() {
        CloseableHttpClient client = HttpClients.createDefault();
        return client;
    }

    // GET Method
    public static JsonArray GET(String endpoint, CloseableHttpClient httpClient) throws ParseException {
        try {
            URI uri = new URIBuilder(baseURI + endpoint).build();
            HttpGet httpGet = new HttpGet(uri);
            try (CloseableHttpResponse httpResponse = httpClient.execute(httpGet)) {
                if (httpResponse != null) {
                    // Get the status code from the response
                    int statusCode = httpResponse.getCode();
                    System.out.println("Status Code: " + statusCode);
                    // Get the response entity
                    HttpEntity entity = httpResponse.getEntity();
                    if (entity != null) {
                        // Read the response content as a String
                        String responseString = EntityUtils.toString(entity);

                        // Parse the response as a JsonArray
                        JsonElement jsonElement = JsonParser.parseString(responseString);
                        if (jsonElement.isJsonArray()) {
                            JsonArray jsonArray = jsonElement.getAsJsonArray();
                            return jsonArray;
                        }
                    }
                }
            }
        } catch (IOException | URISyntaxException e) {
        }
        return null;
    }

    // POST method
    public static void POST(String endPoint, String jsonBody, CloseableHttpClient httpClient) {
        try {
            // Prepare the URL
            URI uri = new URIBuilder(baseURI + endPoint).build();

            // Create POST request
            HttpPost httpPost = new HttpPost(uri);
            httpPost.setHeader("Content-Type", "application/json");

            // Set the request body
            StringEntity stringEntity = new StringEntity(jsonBody);
            httpPost.setEntity(stringEntity);

            // Execute the request
            ClassicHttpResponse httpResponse = (ClassicHttpResponse) httpClient.execute(httpPost);

            // Get the response
            if (httpResponse != null) {
                int statusCode = httpResponse.getCode();
                System.out.println("Status Code: " + statusCode);

                // Get the response entity
                HttpEntity entity = httpResponse.getEntity();
                if (entity != null) {
                    // Read the response content as a String
                    String responseString = EntityUtils.toString(entity, StandardCharsets.UTF_8);
                    System.out.println("Response: " + responseString);
                }
            }
        } catch (IOException | URISyntaxException | ParseException e) {
            e.printStackTrace();
        }
    }

    // PUT method
    public static void PUT(String endPoint, String jsonBody, CloseableHttpClient httpClient) {
        try {
            // Prepare the URL
            URI uri = new URIBuilder(baseURI + endPoint).build();

            // Create PUT request
            HttpPut httpPut = new HttpPut(uri);
            httpPut.setHeader("Content-Type", "application/json");

            // Set the request body
            StringEntity stringEntity = new StringEntity(jsonBody);
            httpPut.setEntity(stringEntity);

            // Execute the request
            ClassicHttpResponse httpResponse = (ClassicHttpResponse) httpClient.execute(httpPut);

            // Get the response
            if (httpResponse != null) {
                int statusCode = httpResponse.getCode();
                System.out.println("Status Code: " + statusCode);

                // Get the response entity
                HttpEntity entity = httpResponse.getEntity();
                if (entity != null) {
                    // Read the response content as a String
                    String responseString = EntityUtils.toString(entity, StandardCharsets.UTF_8);
                    System.out.println("Response: " + responseString);
                }
            }
        } catch (IOException | URISyntaxException | ParseException e) {
            e.printStackTrace();
        }
    }

    // DELETE method
    public static void DELETE(String endPoint, String jsonBody, CloseableHttpClient httpClient) throws ParseException {
        try {
            // Prepare the URL
            URI uri = new URIBuilder(baseURI + endPoint).build();
            HttpDelete httpDelete = null;

            // Create DELETE request
            if (jsonBody != null) {
                httpDelete = new HttpDelete(uri);
                httpDelete.setHeader("Content-Type", ContentType.APPLICATION_JSON.getMimeType());

                // Set the request body
                StringEntity stringEntity = new StringEntity(jsonBody);
                httpDelete.setEntity(stringEntity);
            } else {
                httpDelete = new HttpDelete(uri);
            }

            // Execute the request
            ClassicHttpResponse httpResponse = (ClassicHttpResponse) httpClient.execute(httpDelete);

            // Get the response
            if (httpResponse != null) {
                int statusCode = httpResponse.getCode();
                System.out.println("Status Code: " + statusCode);

                // Get the response entity
                HttpEntity entity = httpResponse.getEntity();
                if (entity != null) {
                    // Read the response content as a String
                    String responseString = EntityUtils.toString(entity, StandardCharsets.UTF_8);
                    System.out.println("Response: " + responseString);
                }
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    // SEARCH method
    public static JsonArray SEARCH(String endPoint, String query, CloseableHttpClient httpClient) {
        try {
            // Prepare the URL
            URI uri = new URIBuilder(baseURI + endPoint).build();

            // Create POST request
            HttpPost httpPost = new HttpPost(uri);
            httpPost.setHeader("Content-Type", "application/json");

            // Set the request body with the search query
            String jsonBody = "{ \"query\": \"" + query + "\" }";
            StringEntity stringEntity = new StringEntity(jsonBody);
            httpPost.setEntity(stringEntity);

            // Execute the request
            ClassicHttpResponse httpResponse = (ClassicHttpResponse) httpClient.execute(httpPost);

            // Get the response
            if (httpResponse != null) {
                int statusCode = httpResponse.getCode();
                System.out.println("Status Code: " + statusCode);

                // Get the response entity
                HttpEntity entity = httpResponse.getEntity();
                if (entity != null) {
                    // Read the response content as a String
                    String responseString = EntityUtils.toString(entity);

                    // Parse the response as a JsonArray
                    JsonElement jsonElement = JsonParser.parseString(responseString);
                    if (jsonElement.isJsonArray()) {
                        JsonArray jsonArray = jsonElement.getAsJsonArray();
                        return jsonArray;
                    }
                }
            }
        } catch (IOException | URISyntaxException | ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

}
