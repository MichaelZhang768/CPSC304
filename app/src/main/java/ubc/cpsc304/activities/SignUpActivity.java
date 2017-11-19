package ubc.cpsc304.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

import ubc.cpsc304.R;

public class SignUpActivity extends AppCompatActivity {
    // TODO: add fields for usernameView, usernameString,
    // emailView, emailString, etc.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    // Called when the user taps the Sign Up button
    public void signUp(View view) {
        if (!checkFieldsNonEmpty()) {
            return;
        }

        EditText usernameView = (EditText) findViewById(R.id.usernamePlainText);
        String usernameString = usernameView.getText().toString();

        if (isUniqueUsername()) {

            ToggleButton adminView = (ToggleButton) findViewById(R.id.isAdminToggleButton);
            boolean isAdmin = adminView.isChecked();

            // TODO: make SQL query

            Intent intent = new Intent(this, AllGamesActivity.class);
            startActivity(intent);

            showSuccessToast();
        } else {
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

        EditText emailView = (EditText) findViewById(R.id.emailEditText);
        String emailString = emailView.getText().toString();
        if (TextUtils.isEmpty(emailString)) {
            emailView.setError("Error: Email cannot be empty!");
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

    private boolean isUniqueUsername() {
        EditText usernameView = (EditText) findViewById(R.id.usernamePlainText);
        String usernameString = usernameView.getText().toString();

        // TODO: make SQL query

        return true;   // TODO: code stub
    }

    private void showSuccessToast() {
        Context context = getApplicationContext();
        CharSequence text = "Message: Sign up succeeded.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    private void showFailureToast() {
        Context context = getApplicationContext();
        CharSequence text = "Error: Sign up failed!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
