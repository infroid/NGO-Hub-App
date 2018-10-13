package com.example.parasrawat.projectinfroid.FragmentClasses;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.parasrawat.projectinfroid.Adapters.HorizontalAdaptor;
import com.example.parasrawat.projectinfroid.R;

import java.util.ArrayList;
import java.util.List;

public class myactivity extends Fragment {
    View view;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    ArrayList<Integer> photoarray=new ArrayList<>();
    ArrayList<String> issue=new ArrayList<>();
    ArrayList<String> description=new ArrayList<>();

    TextView ratingmeter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_my,container,false);

        ratingmeter=view.findViewById(R.id.ratingcount);
        photoarray.add(R.drawable.poverty);
        issue.add("Poverty");
        description.add("Poverty Description");
        photoarray.add(R.drawable.childlabour);
        issue.add("ChildLabour");
        description.add("Child labour description");
        photoarray.add(R.drawable.garbage);
        issue.add("Garbage");
        description.add("Garbage description");
        photoarray.add(R.drawable.women);
        issue.add("Feminism");
        description.add("Feminism description");
        recyclerView=view.findViewById(R.id.horizontalrecyclerview);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter=new HorizontalAdaptor(photoarray,issue,description,getContext());
        recyclerView.setAdapter(adapter);
        return view;
    }
}
