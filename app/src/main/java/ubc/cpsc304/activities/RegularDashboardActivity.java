package ubc.cpsc304.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ubc.cpsc304.R;

public class RegularDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_dashboard);

        getRegularUserProfile();
    }

    private void getRegularUserProfile() {
    }
}
