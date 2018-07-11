package com.coxtunes.listview.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);



        TextView t = findViewById(R.id.dtext);

        String a = getIntent().getStringExtra("name");
        getSupportActionBar().setTitle(a);
        t.setText(a);



    }
}
