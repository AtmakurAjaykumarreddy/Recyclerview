package com.example.hp.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context ct;
    int myImages[];
    String myNames[];

    public MyAdapter(MainActivity mainActivity, int[] images, String[] names) {
        ct=mainActivity;
        myNames=names;
        myImages=images;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(ct).inflate(R.layout.item_row,viewGroup,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.iv.setImageResource(myImages[i]);
        myViewHolder.tv.setText(myNames[i]);

    }

    @Override
    public int getItemCount() {
        return myImages.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
                iv=itemView.findViewById(R.id.imageview);
                tv=itemView.findViewById(R.id.names);
                iv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(ct, "ajay", Toast.LENGTH_SHORT).show();
                    }
                });
        }
    }
    }


