package ubc.cpsc304.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.json.JSONArray;

import ubc.cpsc304.MyApplication;
import ubc.cpsc304.R;

import static ubc.cpsc304.database.Game.getAllGames;

public class AllGamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_games);

        displayGames();
    }

    private void displayGames() {
        String username = ((MyApplication) getApplicationContext()).getUsername();
        try {
            JSONArray games = getAllGames(username, this);

            RecyclerView gamesRecyclerView = (RecyclerView) findViewById(R.id.gamesRecyclerView);
            gamesRecyclerView.setHasFixedSize(true);
            RecyclerView.LayoutManager gamesLayoutManager = new LinearLayoutManager(this);
            gamesRecyclerView.setLayoutManager(gamesLayoutManager);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
