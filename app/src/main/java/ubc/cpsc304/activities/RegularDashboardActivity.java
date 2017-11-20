package ubc.cpsc304.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.concurrent.ExecutionException;

import ubc.cpsc304.MyApplication;
import ubc.cpsc304.R;
import ubc.cpsc304.rest.HttpGetRequest;
import ubc.cpsc304.rest.HttpPostRequest;

public class RegularDashboardActivity extends AppCompatActivity {

    String username = ((MyApplication) getApplicationContext()).getUsername();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_dashboard);

        try {
            getRegularUserProfile();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        Button addBalanceButton = (Button) findViewById(R.id.addBalanceButton);
        addBalanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    addBalance();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

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
                // TODO
                // Intent intent = new Intent(this, );
                // startActivity(intent);
            }
        });

        Button showRecommendedGamesButton = (Button) findViewById(R.id.recommendedGamesButton);
        showRecommendedGamesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO
                // Intent intent = new Intent(this, );
                // startActivity(intent);
            }
        });
    }

    private void getRegularUserProfile() throws ExecutionException, InterruptedException, JSONException {
        TextView usernameTextView = (TextView) findViewById(R.id.usernameTextView);
        TextView balanceTextView = (TextView) findViewById(R.id.balanceTextView);
        TextView emailTextView = (TextView) findViewById(R.id.emailTextView);
        TextView descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);

        String url = "localhost:3000/users/" + username;
        HttpGetRequest areValidCredentials = new HttpGetRequest(url, this);
        String response = areValidCredentials.execute().get();
        JSONArray jsonResponse = new JSONArray(response);
        JSONObject jsonObject = jsonResponse.getJSONObject(0);

        usernameTextView.setText("Username: " + jsonObject.get("username"));
        balanceTextView.setText("Account Balance: " + jsonObject.get("balance").toString());
        emailTextView.setText("Email: " + jsonObject.get("email").toString());
        descriptionTextView.setText("Description: " + jsonObject.get("description").toString());
    }

    private void addBalance() throws ExecutionException, InterruptedException, JSONException {
        EditText amountToAdd = (EditText) findViewById(R.id.amountToAddEditText);
        float toAdd = Float.valueOf(amountToAdd.getText().toString());

        if(toAdd > 0) {
            String url = "localhost:3000/users/" + username;
            HttpGetRequest areValidCredentials = new HttpGetRequest(url, this);
            String response = areValidCredentials.execute().get();
            JSONArray jsonResponse = new JSONArray(response);
            JSONObject jsonObject = jsonResponse.getJSONObject(0);

            float newBalance = (Float)jsonObject.get("balance") + toAdd;
            jsonObject.put("balance", newBalance);
            HttpPostRequest updateBalance = new HttpPostRequest(url, jsonObject, this);
            updateBalance.execute();

            TextView balanceTextView = (TextView) findViewById(R.id.balanceTextView);
            balanceTextView.setText("Account Balance: " + newBalance);
        } else {
            Toast.makeText(getApplicationContext(), "Please enter a positive amount to add " +
                    "to your account balance", Toast.LENGTH_SHORT).show();
        }
    }
}
