package com.example.androidactivity;
//10119042-Muhammad Rifqu Abdillah-IF1 22/04/2022
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;



public class LoginActivity extends AppCompatActivity {
 private EditText etUsername, etPassword;
 private String username, password;

        Button btnLogin,btnRegistrasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = findViewById(R.id.btn_login);
        btnRegistrasi = findViewById(R.id.btn_register);
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                username = etUsername.getText().toString();
                password = etPassword.getText().toString();
                //action
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("username", username);
                intent.putExtra("password", password);
                startActivity(intent);
            }
        });

       btnRegistrasi.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
               startActivity(intent);
           }
       });
    }


}