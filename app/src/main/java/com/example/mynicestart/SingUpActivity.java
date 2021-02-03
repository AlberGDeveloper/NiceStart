package com.example.mynicestart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Ventana de registro. Botones funcionales: Cancel y login, el cual te lleva al main activity 2 (de nuevo)
 * @author Alberto García
 * @see MainActivity2
 */

public class SingUpActivity extends AppCompatActivity {

    protected Button mCancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);

        getSupportActionBar().hide();


        mCancelButton = (Button) findViewById(R.id.cancelbutton);
        mCancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        Button miBoton3 = findViewById(R.id.loginbutton);
        miBoton3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SingUpActivity.this, MainActivity3.class);
                startActivity(intent);

            }
        });

    }}