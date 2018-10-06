package com.example.parasrawat.projectinfroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.parasrawat.projectinfroid.FragmentClasses.myactivity;
import com.example.parasrawat.projectinfroid.FragmentClasses.reportclass;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ContentUploader extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    Spinner spinner;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_uploader);
        drawerLayout=findViewById(R.id.drawblelayout);
        Toolbar toolbar=findViewById(R.id.Toolbar);
        NavigationView navigationView=findViewById(R.id.navigationbar);
        navigationView.setNavigationItemSelectedListener(this);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if(savedInstanceState==null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new reportclass()).commit();
            navigationView.setCheckedItem(R.id.report);
        }
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {

            Toast.makeText(this,"User Signed Out",Toast.LENGTH_LONG).show();
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(ContentUploader.this,MainActivity.class));
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.report:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new reportclass()).commit();

                break;
            case R.id.activity:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new myactivity()).commit();

                break;
            case R.id.logout:
                Toast.makeText(this,"User Signed Out",Toast.LENGTH_LONG).show();
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(ContentUploader.this,MainActivity.class));
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }


}
