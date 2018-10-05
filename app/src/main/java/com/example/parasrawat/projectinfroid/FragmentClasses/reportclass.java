package com.example.parasrawat.projectinfroid.FragmentClasses;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.parasrawat.projectinfroid.R;

public class reportclass extends Fragment {

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.demoreport,container,false);
        //        spinner=findViewById(R.id.issuespinner);
//        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.issue,android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
////        toggle.syncState();
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        return view;
    }
}
