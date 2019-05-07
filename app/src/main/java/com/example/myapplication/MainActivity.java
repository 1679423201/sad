package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<myClass> myClasses = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        myClass myClass = new myClass("asd","sadds");
        myClasses.add(myClass);
        myClass mywClass = new myClass("sdfasd","sadsdf");
        myClasses.add(mywClass);
        myClass myClasrs = new myClass("adfssd","safd");
        myClasses.add(myClasrs);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
//        RecyclerView.LayoutManager
//                layoutManager=new StaggeredGridLayoutManager( 1,StaggeredGridLayoutManager.VERTICAL );
//        recyclerView.setLayoutManager( layoutManager );
//        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        myAdapter adapter = new myAdapter(myClasses);
        recyclerView.setAdapter(adapter);

        recyclerView.setAdapter(adapter);
    }
}
