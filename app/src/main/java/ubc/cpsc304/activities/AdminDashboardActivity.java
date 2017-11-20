package ubc.cpsc304.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import ubc.cpsc304.R;

public class AdminDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        getAdminUserProfile();
    }

    private void getAdminUserProfile() {
        TextView usernameTextView = (TextView) findViewById(R.id.usernameTextView);
        TextView emailTextView = (TextView) findViewById(R.id.emailTextView);
        TextView descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);

        // TODO: SQL query to get username, email, and description
        usernameTextView.setText("Username: " + "");
        emailTextView.setText("Email: " + "");
        descriptionTextView.setText("Description: " + "");
    }
}
