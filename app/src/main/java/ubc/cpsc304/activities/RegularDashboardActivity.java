package ubc.cpsc304.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import ubc.cpsc304.R;

public class RegularDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_dashboard);

        getRegularUserProfile();

        Button button = (Button) findViewById(R.id.addBalanceButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addBalance();
            }
        });
    }

    private void getRegularUserProfile() {
        TextView usernameTextView = (TextView) findViewById(R.id.usernameTextView);
        TextView balanceTextView = (TextView) findViewById(R.id.balanceTextView);
        TextView emailTextView = (TextView) findViewById(R.id.emailTextView);
        TextView descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);

        // TODO: SQL query to get username, balance, email, and description
        usernameTextView.setText("Username: " + "");
        balanceTextView.setText("Account Balance: " + "");
        emailTextView.setText("Email: " + "");
        descriptionTextView.setText("Description: " + "");
    }

    private void addBalance() {
        EditText amountToAdd = (EditText) findViewById(R.id.amountToAddEditText);
        float toAdd = Float.valueOf(amountToAdd.getText().toString());

        if(toAdd > 0) {
            // TODO: SQL query to add to account balance
            TextView balanceTextView = (TextView) findViewById(R.id.balanceTextView);
            balanceTextView.setText("Account Balance: " + "");
        } else {
            Toast.makeText(getApplicationContext(), "Please enter a positive amount to add" +
                    "to your account balance", Toast.LENGTH_SHORT).show();
        }
    }
}
