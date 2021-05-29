package com.example.live_easy;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class phone_otp_1 extends AppCompatActivity {
    private EditText editTextMobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_otp1);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        editTextMobile = findViewById(R.id.mobilemum);

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mobile = editTextMobile.getText().toString().trim();

                if(mobile.isEmpty() || mobile.length() < 10){
                    editTextMobile.setError("Enter a valid mobile");
                    return;
                }
                Intent intent = new Intent(phone_otp_1.this,phone_otp2.class);
                intent.putExtra("mobile", mobile);
                startActivity(intent);
            }
        });
    }
}