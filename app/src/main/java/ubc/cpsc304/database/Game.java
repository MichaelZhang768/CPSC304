package ubc.cpsc304.database;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.concurrent.ExecutionException;

import ubc.cpsc304.rest.HttpGetRequest;

public class Game {

    public static JSONArray getAllGames(String username, Context context) throws InterruptedException,
            ExecutionException, JSONException {
        String url = "localhost:3000/" + username + "/all_games";
        HttpGetRequest getAllGames = new HttpGetRequest(url, context);
        String response = getAllGames.execute().get();
        return new JSONArray(response);
    }
}
