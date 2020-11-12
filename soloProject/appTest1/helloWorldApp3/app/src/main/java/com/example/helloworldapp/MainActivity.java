package com.example.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText email;
    private Object loggedIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.editTextTextEmailAddress);

    }
    public void formSubmit(View view){
        String emailA = email.getText().toString();
        emailA = String.join(" ","Junk sent to : ",emailA);
        Toast.makeText(view.getContext(),emailA,Toast.LENGTH_SHORT).show();
        openNewActivity();
            }
    public void openNewActivity(){
        Intent intent = new Intent(this, loggedIn.class);
        startActivity(intent);
        }
}