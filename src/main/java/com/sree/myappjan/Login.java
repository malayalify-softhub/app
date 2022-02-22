package com.sree.myappjan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {
    EditText password, username;
    Button cancel;
    String un = "Admin";
    String pw = "abc123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // Creates Variable for  Text fields and Button
        username = (EditText) findViewById(R.id.usernameee);
        password = (EditText) findViewById(R.id.pswd);
        cancel = (Button) findViewById(R.id.cancel);

        cancel.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        // Exits App
        finish();
    }

    public void login(View view) {
        // Converts Text filed content to Strings
        String uname = username.getText().toString();
        String pword = password.getText().toString();

        // Check Whether both username and password equals to inpuut
        if(uname.equals(un) && pword.equals(pw)){

            // Opens Home Page on Success
            Intent i = new Intent(getApplicationContext(),HomePage.class);
            startActivity(i);

        }else{
            // Shows toast of incorrect password
            Toast.makeText(getApplicationContext(),"email or password incorrect",Toast.LENGTH_LONG).show();
        }
    }
}