package com.example.parasrawat.projectinfroid;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.parasrawat.projectinfroid.Adapters.ViewPagerAdapter;

public class Slides extends AppCompatActivity {
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slides);
        viewPager=findViewById(R.id.viewpager);
        viewPagerAdapter =new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
        Boolean isFirstRun =getSharedPreferences("PREFERENCE",MODE_PRIVATE).getBoolean("isFirstRun",true);
        if(isFirstRun){
            startActivity(new Intent(Slides.this,IntroSlider.class));
        }

    }
}
