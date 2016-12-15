package com.example.user.mythirdapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "myTAG";
    ArrayList<User> inputArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        inputArray = intent.getParcelableArrayListExtra("listOfUsers");

        for(User u: inputArray){
            Log.d(TAG, "onCreate: " + u.getFirstName() + " " + u.getLastName());
        }
    }
}
