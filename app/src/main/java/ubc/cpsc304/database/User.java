package ubc.cpsc304.database;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import ubc.cpsc304.rest.HttpGetRequest;
import ubc.cpsc304.rest.HttpPostRequest;

public class User {

    public static void addUser(final String username, final String password, final String email,
                               Context context) {
        Map<String, String> attributes = new HashMap<String, String>() {
            {
                put("username", username);
                put("password", password);
                put("email", email);
            }
        };
        JSONObject jsonAttributes = new JSONObject(attributes);

        String url = "localhost:3000/users/";
        HttpPostRequest addUser = new HttpPostRequest(url, jsonAttributes, context);
        addUser.execute();
    }

    public static boolean usernameExists(String username, Context context) throws
            InterruptedException, ExecutionException, JSONException {
        String url = "localhost:3000/user_usernames/" + username;
        HttpGetRequest usernameExists = new HttpGetRequest(url, context);
        String response = usernameExists.execute().get();
        JSONArray jsonResponse = new JSONArray(response);

        return containsUsername(jsonResponse, username);
    }

    public static boolean areValidCredentials(String username, String password, Context context)
            throws InterruptedException, ExecutionException, JSONException {
        String url = "localhost:3000/users/" + username;
        HttpGetRequest areValidCredentials = new HttpGetRequest(url, context);
        String response = areValidCredentials.execute().get();
        JSONArray jsonResponse = new JSONArray(response);

        return containsCredentials(jsonResponse, username, password);
    }

    // Input: [] or [<username>]
    private static boolean containsUsername(JSONArray jsonArray, String username) throws
            JSONException {
        if (jsonArray.length() == 0) {
            return false;
        }

        String string = (String) jsonArray.get(0);
        return string.equals(username);
    }

    // Input: [] or [{"username": <username>, "password": <password>, ...}]
    private static boolean containsCredentials(
            JSONArray jsonArray, String username, String password
    ) throws JSONException {
        if (jsonArray.length() == 0) {
            return false;
        }

        JSONObject jsonObject = jsonArray.getJSONObject(0);
        return jsonObject.get("username").equals(username)
                && jsonObject.get("password").equals(password);
    }

    public static JSONArray getAllFriends(String username, Context context) throws  InterruptedException, ExecutionException, JSONException {
        String url = "localhost:3000/" + username + "/friends";
        HttpGetRequest getAllFriends = new HttpGetRequest(url, context);
        String response = getAllFriends.execute().get();
        return new JSONArray(response);
    }
}
