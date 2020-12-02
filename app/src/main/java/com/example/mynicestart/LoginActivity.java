package com.example.mynicestart;

import android.widget.Button;
import android.widget.ImageView;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

//import android.support.v7.app.ActionBarActivity;


public class LoginActivity extends Activity {

    protected Button mSignUpButton;
    protected Button mLoginButton;
    protected TextInputLayout mUsername;
    protected ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        mLoginButton = (Button)findViewById(R.id.loginbutton);
        mLoginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);


            }
        });

        mSignUpButton = (Button) findViewById(R.id.singupbutton);
        mSignUpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, SingUpActivity.class);
                startActivity(intent);


            }
        });







    }}
