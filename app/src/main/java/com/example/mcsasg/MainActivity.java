package com.example.mcsasg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText emailEditText, passwordEditText;
    Button loginButton;
    public void registerButtonClick(View view) {
        Intent intent = new Intent(this, RegisterPage.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.PasswordEditText);
        loginButton = findViewById(R.id.loginButton);
        Button button = findViewById(R.id.registerButton);
        button.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                if (TextUtils.isEmpty(email)) {
                    emailEditText.setError("Fill in email");
                    emailEditText.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    passwordEditText.setError("Fill in Password");
                    passwordEditText.requestFocus();
                    return;
                }

                // Validate that email and password are registered in the database
                if (!isRegistered(email, password)) {
                    Toast.makeText(MainActivity.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Check if the user is verified
                if (!isVerified(email)) {
                    Toast.makeText(MainActivity.this, "Account not verified", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Redirect to home page
                Intent intent = new Intent(MainActivity.this, HomeSection.class);
                startActivity(intent);
            }
        });
    }

    private boolean isRegistered(String email, String password) {
        return true;
    };

    private boolean isVerified(String email) {
        return true;
    };
}