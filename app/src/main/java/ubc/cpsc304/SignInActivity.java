package ubc.cpsc304;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    // Called when the user taps the Sign In button
    public void signIn(View view) {
        if (areValidCredentials()) {
            Intent intent = new Intent(this, AllGamesActivity.class);
            startActivity(intent);

            showSuccessToast();
        } else {
            showFailureToast();
        }
    }

    private boolean areValidCredentials() {
        EditText usernameView = (EditText) findViewById(R.id.usernamePlainText);
        String usernameString = usernameView.getText().toString();
        EditText passwordView = (EditText) findViewById(R.id.passwordPassword);
        String passwordString = passwordView.getText().toString();

        if (TextUtils.isEmpty(usernameString)) {
            usernameView.setError("Username cannot be empty");
            return false;
        }
        if (TextUtils.isEmpty(passwordString)) {
            passwordView.setError("Password cannot be empty");
            return false;
        }

        // TODO: make SQL query

        return true;   // TODO: code stub
    }

    private void showSuccessToast() {
        Context context = getApplicationContext();
        CharSequence text = "Notification: Sign in succeeded.";
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
