package ubc.cpsc304.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import ubc.cpsc304.MyApplication;
import ubc.cpsc304.R;

import static ubc.cpsc304.database.User.areValidCredentials;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    // Called when the user taps the Sign In button
    public void signIn(View view) {
        if (!checkFieldsNonEmpty()) {
            return;
        }

        EditText usernameView = (EditText) findViewById(R.id.usernamePlainText);
        String usernameString = usernameView.getText().toString();
        EditText passwordView = (EditText) findViewById(R.id.passwordPassword);
        String passwordString = passwordView.getText().toString();

        try {
            if (areValidCredentials(usernameString, passwordString, this)) {
                MyApplication myApplication = (MyApplication) getApplicationContext();
                myApplication.setUsername(usernameString);

                Intent intent = new Intent(this, RegularDashboardActivity.class);
                startActivity(intent);

                showSuccessToast();
            } else {
                showFailureToast();
            }
        } catch (Exception e) {
            e.printStackTrace();
            showFailureToast();
        }
    }

    private boolean checkFieldsNonEmpty() {
        EditText usernameView = (EditText) findViewById(R.id.usernamePlainText);
        String usernameString = usernameView.getText().toString();
        if (TextUtils.isEmpty(usernameString)) {
            usernameView.setError("Error: Username cannot be empty!");
            return false;
        }

        EditText passwordView = (EditText) findViewById(R.id.passwordPassword);
        String passwordString = passwordView.getText().toString();
        if (TextUtils.isEmpty(passwordString)) {
            passwordView.setError("Error: Password cannot be empty!");
            return false;
        }

        return true;
    }

    private void showSuccessToast() {
        Context context = getApplicationContext();
        CharSequence text = "Message: Sign in succeeded.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    private void showFailureToast() {
        Context context = getApplicationContext();
        CharSequence text = "Error: Sign in failed!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
