package com.example.aefx.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    public DatabaseReference databaseReference;
    Button goButton;
    Button leftButton;
    Button rightButton;
    Button backButton;
    Button stopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

        stopButton = (Button) findViewById(R.id.stop);
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, Object> value = new HashMap<String, Object>();
                value.put("MOTOROPEN", 4);
                databaseReference.updateChildren(value);
            }
        });

        backButton = (Button) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, Object> value = new HashMap<String, Object>();
                value.put("MOTOROPEN", 1);
                databaseReference.updateChildren(value);
            }
        });

        rightButton = (Button) findViewById(R.id.right);
        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, Object> val = new HashMap<String, Object>();
                val.put("MOTOROPEN", 3);
                databaseReference.updateChildren(val);
            }
        });

        leftButton = (Button) findViewById(R.id.left);
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, Object> value= new HashMap<String, Object>();
                value.put("MOTOROPEN", 2);
                databaseReference.updateChildren(value);
            }
        });

        goButton = (Button) findViewById(R.id.go);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, Object> value = new HashMap<String, Object>();
                value.put("MOTOROPEN", 0);
                databaseReference.updateChildren(value);
            }
        });


    }


}
