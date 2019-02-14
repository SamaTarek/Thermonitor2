package com.example.thermonitor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class SecondActivity extends AppCompatActivity {
ListView listView;
    private FirebaseAuth mAuth;
    String[] languages = {"Java","C++","SQL","C#","Python","Javascript"};
    int[] Images = {R.drawable.java,R.drawable.c_plus_plus,R.drawable.sql,R.drawable.c_sharp,R.drawable.python,R.drawable.js};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        listView = findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(),ListdataActivity.class);
                intent.putExtra("name",languages[i]);
                intent.putExtra("image",Images[i]);
                startActivity(intent);

            }
        });





    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return Images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.data, null);

            TextView name = view1.findViewById(R.id.language);
            ImageView image = view1.findViewById(R.id.images);

            name.setText(languages[i]);
            image.setImageResource(Images[i]);
            return view1;


        }
    }}




