package com.toong.androidautorestartaftercrash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {
    private String a = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        a= "3";

        findViewById(R.id.button_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.length();
                startActivity(new Intent(FirstActivity.this, SecondActivity.class));
            }
        });

        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new Fragment1()).commit();
    }
}
