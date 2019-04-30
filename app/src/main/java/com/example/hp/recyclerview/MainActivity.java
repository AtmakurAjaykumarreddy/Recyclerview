package com.example.hp.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recycler);
        int images[]={R.drawable.c,
                     R.drawable.d,
                     R.drawable.g,
                     R.drawable.h,
                     R.drawable.i,
                     R.drawable.m,
                     R.drawable.p};
        String names[]={"fighter","gandhi","father","peace","nonviolance","proud of India","british"};
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new MyAdapter(this,images,names));

    }
}
