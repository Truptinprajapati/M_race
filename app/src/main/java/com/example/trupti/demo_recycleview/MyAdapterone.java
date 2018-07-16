package com.example.trupti.demo_recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Lenovo on 14-07-2018.
 */

public class MyAdapterone extends RecyclerView.Adapter<MyAdapterone.ViewHolder> {

    private Dataiteam[] iteamdtaone;

    public MyAdapterone(Dataiteam[] itemsDataone) {
        this.iteamdtaone=itemsDataone;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.dataone,null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.tv.setText(iteamdtaone[position].getTitle());
        holder.iv.setImageResource(iteamdtaone[position].getImageUrl());
    }


    @Override
    public int getItemCount() {
        return iteamdtaone.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView tv;
        ImageView iv;

        public ViewHolder(View itemView) {
            super(itemView);
            tv=(TextView)itemView.findViewById(R.id.item_title);
            iv=(ImageView)itemView.findViewById(R.id.item_icon);

        }
    }
}
