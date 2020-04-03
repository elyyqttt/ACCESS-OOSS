package com.example.loginmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText usernameinput;
    private EditText passwordinput;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /*public void onLogin()
    {
        usernameinput = findViewById(R.id.email);
        passwordinput = findViewById(R.id.password);
        button = findViewById(R.id.loginbutt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usernameinput.getText().toString().trim().equals("user") && passwordinput.getText().toString().trim().equals("admin"))
                {
                    Intent intent = new Intent(getBaseContext(), MainMenuFinal.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }*/
}
