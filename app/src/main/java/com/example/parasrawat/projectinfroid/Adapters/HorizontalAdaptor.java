package com.example.parasrawat.projectinfroid.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.parasrawat.projectinfroid.ContentUploader;
import com.example.parasrawat.projectinfroid.R;

import java.util.ArrayList;
import java.util.List;

public class HorizontalAdaptor extends RecyclerView.Adapter<HorizontalAdaptor.ViewHolder> {
    ArrayList<Integer> photoarray;
    ArrayList<String > issue;
    ArrayList<String>  description;
    Context context;

    public HorizontalAdaptor(ArrayList<Integer> photoarray, ArrayList<String> issue, ArrayList<String> description, Context context) {
        this.photoarray = photoarray;
        this.issue = issue;
        this.description = description;
        this.context = context;
    }

    @NonNull

    @Override
    public HorizontalAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerviewlayout,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalAdaptor.ViewHolder viewHolder, int i) {
    viewHolder.imageView.setImageResource(photoarray.get(i));
    viewHolder.issue.setText(description.get(i));
    viewHolder.description.setText(description.get(i));

    }

    @Override
    public int getItemCount() {
        return photoarray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView issue;
        TextView description;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            issue=itemView.findViewById(R.id.issue);
            description=itemView.findViewById(R.id.description);
            imageView=itemView.findViewById(R.id.imageview);
        }
    }
}
