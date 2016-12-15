package com.example.user.mythirdapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;

    ArrayList<User> arrayUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayUsers = new ArrayList<User>();
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
    }

    public void addToArray(View view) {

        User myUser = new User(editText1.getText().toString(), editText2.getText().toString());

        arrayUsers.add(myUser);
    }

    public void goToSecondActivity(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("listOfUsers", arrayUsers);
        startActivity(intent);
    }
}
