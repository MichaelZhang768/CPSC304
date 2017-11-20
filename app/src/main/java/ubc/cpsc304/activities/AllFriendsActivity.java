package ubc.cpsc304.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.json.JSONArray;

import ubc.cpsc304.MyApplication;
import ubc.cpsc304.R;

import static ubc.cpsc304.database.User.getAllFriends;

/**
 * Created by Crimson on 11/19/17.
 */

public class AllFriendsActivity extends AppCompatActivity {
    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_friends);

        displayFriends();
    }

    private void displayFriends(){
        String username = ((MyApplication) getApplicationContext()).getUsername();
        try{
            JSONArray friends = getAllFriends(username, this);

            RecyclerView gamesRecyclerView = (RecyclerView) findViewById(R.id.gamesRecyclerView);
            gamesRecyclerView.setHasFixedSize(true);
            RecyclerView.LayoutManager gamesLayoutManager = new LinearLayoutManager(this);
            gamesRecyclerView.setLayoutManager(gamesLayoutManager);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
