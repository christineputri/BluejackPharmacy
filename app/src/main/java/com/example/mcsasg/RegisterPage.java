package com.example.mcsasg;

import static com.example.mcsasg.R.id.editTextEmailRegisterPage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterPage extends AppCompatActivity {
    public void loginButtonRegisterPageClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    private EditText mNameEditText, mEmailEditText, mPasswordEditText, mConfirmPasswordEditText;
    private Button mRegisterButton;
    private int mUserId = 1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        mNameEditText = findViewById(R.id.editTextNameRegisterPage);
        mEmailEditText = findViewById(editTextEmailRegisterPage);
        mPasswordEditText = findViewById(R.id.editTextPasswordRegisterPage);
        mConfirmPasswordEditText = findViewById(R.id.editTextConfirmPasswordRegisterPage);
        mRegisterButton = findViewById(R.id.registerButton);

        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameEditText.getText().toString();
                String email = mEmailEditText.getText().toString();
                String password = mPasswordEditText.getText().toString();

                if (TextUtils.isEmpty(name) || TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
                    showToast("All fields are required.");
                } else if (name.length() < 5) {
                    showToast("Name must be at least 5 characters long.");
                } else if (!email.endsWith(".com")) {
                    showToast("Email must end with '.com'");
                } else if (!password.matches("[a-zA-Z0-9]+")) {
                    showToast("Password must be alphanumeric.");
                } else {
                    User user = new User(mUserId, name, email, password);
                    mUserId++;
                    showToast("Registration successful.");
                }
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private class User {
        private int id;
        private String name;
        private String email;
        private String password;

        public User(int id, String name, String email, String password) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.password = password;
        }
    }
}