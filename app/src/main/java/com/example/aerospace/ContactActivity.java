package com.example.aerospace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContactActivity extends AppCompatActivity {
    Button subbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        subbtn=findViewById(R.id.submitbtn);

        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ContactActivity.this,"Submitted",Toast.LENGTH_LONG).show();
            }
        });

    }
}