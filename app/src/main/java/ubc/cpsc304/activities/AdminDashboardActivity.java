package ubc.cpsc304.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.concurrent.ExecutionException;

import ubc.cpsc304.MyApplication;
import ubc.cpsc304.R;
import ubc.cpsc304.rest.HttpGetRequest;

public class AdminDashboardActivity extends AppCompatActivity {

    String username = ((MyApplication) getApplicationContext()).getUsername();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        try {
            getAdminUserProfile();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        Button showFriendsButton = (Button) findViewById(R.id.friendsButton);
        showFriendsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO
                // Intent intent = new Intent(this, );
                // startActivity(intent);
            }
        });

        Button showGamesButton = (Button) findViewById(R.id.showOwnedGamesButton);
        showGamesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AllGamesActivity.class);
                startActivity(intent);
            }
        });

        Button showUsersButton = (Button) findViewById(R.id.showAllUsersButton);
        showUsersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO
//                Intent intent = new Intent(getApplicationContext(), );
//                startActivity(intent);
            }
        });
    }

    private void getAdminUserProfile() throws ExecutionException, InterruptedException, JSONException {
        TextView usernameTextView = (TextView) findViewById(R.id.usernameTextView);
        TextView emailTextView = (TextView) findViewById(R.id.emailTextView);
        TextView descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);

        String url = "localhost:3000/users/" + username;
        HttpGetRequest areValidCredentials = new HttpGetRequest(url, this);
        String response = areValidCredentials.execute().get();
        JSONArray jsonResponse = new JSONArray(response);
        JSONObject jsonObject = jsonResponse.getJSONObject(0);

        usernameTextView.setText("Username: " + jsonObject.get("username"));
        emailTextView.setText("Email: " + jsonObject.get("email").toString());
        descriptionTextView.setText("Description: " + jsonObject.get("description").toString());
    }
}
