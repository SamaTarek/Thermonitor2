package com.example.thermonitor;

import android.content.Intent;
import android.support.v4.widget.ImageViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListdataActivity extends AppCompatActivity {

    TextView name;
    ImageView Image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdata);
        name=findViewById(R.id.language);
        Image= findViewById(R.id.images);

        Intent intent=getIntent();
         name.setText(intent.getStringExtra("name"));
         Image.setImageResource(intent.getIntExtra("name",0));


    }
}
