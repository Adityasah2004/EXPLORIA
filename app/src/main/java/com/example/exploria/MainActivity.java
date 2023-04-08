package com.example.exploria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.exploria.ui.Activity2;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Username = (TextView) findViewById(R.id.Username);
        TextView Password = (TextView) findViewById(R.id.Password);

        MaterialButton Login = (MaterialButton) findViewById(R.id.Login);

        //admin and admin
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Username.getText().toString().equals("admin") && Password.getText().toString().equals("admin")) {
                    //correct
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    {
                        Intent i=new Intent(getApplicationContext(), Activity2.class);
                        startActivity(i);

                    }
                } else
                    //incorrect
                    Toast.makeText(MainActivity.this, "LOGIN FAILED!!!", Toast.LENGTH_SHORT).show();
            }


        });

    }
}