package com.thaiems1669.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_case_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new CustomRecyclerAdapter(this, initPlayer());
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    private List<AccidentCase> initPlayer() {

        AccidentCase messi = new AccidentCase("Leonel Missi", "Barcelona", "test1");
        AccidentCase ronaldo = new AccidentCase("Cristiano Ronaldo", "Real Madrid", "test2");
        AccidentCase suarez = new AccidentCase("Luis Suarez", "Liverpool", "test3");

        List<AccidentCase> dataset = new ArrayList<AccidentCase>();

        dataset.add(messi);
        dataset.add(ronaldo);
        dataset.add(suarez);

        return dataset;
    }
}
