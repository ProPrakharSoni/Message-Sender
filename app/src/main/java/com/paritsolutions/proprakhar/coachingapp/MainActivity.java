package com.paritsolutions.proprakhar.coachingapp;

import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    private RecyclerView mRecyclerView;
    private Adapter mAdapter;
    private List<String> myNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // drawer layout instance to toggle the menu icon to open
        // drawer and back button to close drawer
        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        // pass the Open and Close toggle for the drawer layout listener
        // to toggle the button
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        // to make the Navigation drawer icon always appear on the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        myNum =new ArrayList<>();
        for(int i=0;i<=5;i++){
            myNum.add("Batch-"+i);
        }
        mAdapter=new Adapter(this,myNum);
        mRecyclerView.setAdapter(mAdapter);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {

        switch(item.getItemId()){
            case R.id.home :
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                Log.i("homework","yes");
                return true;
            case R.id.detail:
                Toast.makeText(this, "Detail", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.create_batch:
                Toast.makeText(this, "Create Batch", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.remove_batch:
                Toast.makeText(this, "Remove Batch", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.update_batch:
                Toast.makeText(this, "Update Batch", Toast.LENGTH_SHORT).show();
                return true;
            default: return false;
        }

        }
       return super.onOptionsItemSelected(item);
    }

}