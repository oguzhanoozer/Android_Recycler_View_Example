package com.oguzhanozer.detailedrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Films> films;
    private MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        Films f1 = new Films("oguz",9.99,"django");
        Films f2 = new Films("oguz",9.99,"birzamanlaranadoluda");
        Films f3 = new Films("oguz",9.99,"inception");
        Films f4 = new Films("oguz",9.99,"interstellar");
        Films f5 = new Films("oguz",9.99,"thepianist");


        films = new ArrayList<>();

        films.add(f1);
        films.add(f2);
        films.add(f3);
        films.add(f4);
        films.add(f5);

        myAdapter = new MyAdapter(getApplicationContext(), films);
        recyclerView.setAdapter(myAdapter);


    }



}
