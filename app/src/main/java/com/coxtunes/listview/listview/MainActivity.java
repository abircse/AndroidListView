package com.coxtunes.listview.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        lv = findViewById(R.id.mylist);
        lv.setDivider(null);

        final String[] getdata = getResources().getStringArray(R.array.androidos);


        adapter = new ArrayAdapter(this, R.layout.custom_layout, R.id.mytext, getdata);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//                Toast.makeText(getApplicationContext(), "you clicked on "+getdata[position], Toast.LENGTH_LONG).show();

                Intent a = new Intent(getApplicationContext(), Details.class);
                a.putExtra("name",getdata[position]);
                startActivity(a);

            }
        });






    }
}
