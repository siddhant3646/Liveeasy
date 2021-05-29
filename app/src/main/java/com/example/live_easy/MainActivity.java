package com.example.live_easy;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    Spinner et41;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        et41=findViewById(R.id.et41);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, phone_otp_1.class);
                startActivity(i);
                finish();
            }
        });
        ArrayAdapter<CharSequence> adapter2 =ArrayAdapter.createFromResource( this,R.array.grades,R.layout.my_selected_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        et41.setAdapter(adapter2);
    }
}